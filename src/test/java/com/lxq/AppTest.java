package com.lxq;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.cglibproxy.CglibProxy;
import com.cglibproxy.HelloConcrete;
import com.java8.User;
import com.java8.proxyTest;
import com.proxy.MyInvocationHandler;
import org.junit.Test;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.Month;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void f1() {
        User user = new User();
        user.setAge(33);
        user.setName("小路");

        Optional<User> user1 = Optional.ofNullable(user);

        user1.isPresent();

        String s = Optional.of("张三").orElse("kkkkk");
        String ss = (String) Optional.empty().orElse("lskdjs");
        System.out.println(s + "----" + ss);


    }

    @Test
    public void test() {
        List<Integer> list = getNumList(10, () -> (int) Math.random() * 1000);
//        List<Integer> list = getNumList(10,()->(int)Math.random()*100);
        System.out.println(list);
    }

    // 需求：产生指定个数的整数，并放入集合中
    public List<Integer> getNumList(int num, Supplier<Integer> sup) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            Integer e = sup.get();
            System.out.println(e);
            list.add(e);
        }
        return list;
    }

    @Test
    public void ftest() {
        //ifPresent方法的参数是一个Consumer的实现类，Consumer类包含一个抽象方法，
        // 该抽象方法对传入的值进行处理，只处理没有返回值。
        Optional<String> stringOptional = Optional.of("lixq");
        stringOptional.ifPresent(e -> System.out.println("我在。。。" + e));

    }

    private static class CustomException extends RuntimeException {
        private static final long serialVersionUID = -4399699891687593264L;

        public CustomException() {
            super("自定义异常");
        }

        public CustomException(String message) {
            super(message);
        }
    }


    @Test
    public void fl() {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};
        Comparator<String> c = (s1, s2) -> (s1.length() - s2.length());
        Arrays.sort(players, c);
        System.out.println(Arrays.asList(players));
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }

    @Test
    public void fl2() {

        // 测试功能型
        // 平方
        Integer aInteger = new Integer(12);
        String string = "outerline";
        Function<Integer, Integer> function = a -> {
            return a * a;
        };
        System.out.println("功能型接口  :" + function.apply(aInteger));


        // 测试供给型接口
        // 生成一个随机数
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(45);
        };
        System.out.println("供给型接口  " + supplier.get());


        // 断言式接口
        // 判断一个数是否大于0
        Predicate<Integer> predicate = a -> {
            return a > 0;
        };
        System.out.println("断言式接口  " + predicate.test(18));


        Predicate<String> p = a -> {
            return a.length() > 4;
        };


        // 消费性接口
        // 输出输入的参数
        Consumer<String> consumer = a -> {
            System.out.println("消费性接口内部  " + a.length() + "  " + string);
        };
        System.out.println("调用消费性接口");
        consumer.accept("xiaofeixingjiekoucanshu");


    }

    @Test
    public void f8() {

        User u1 = new User();
        u1.setAge(33);
        u1.setName("大大");

        User u2 = new User();
        u2.setAge(22);
        u2.setName("中中");
        User u3 = new User();
        u3.setAge(11);
        u3.setName("小小");
        List<User> users = Arrays.asList(u1, u2, u3);
        List<User> lsit = users.stream().filter(u -> u.getName().equals("大大")).collect(Collectors.toList());
        List<User> collect = users.stream().sorted(Comparator.comparing(x -> x.getAge())).collect(Collectors.toList());

        List<Integer> collect1 = users.stream().map(user -> user.getAge() * 2).distinct().collect(Collectors.toList());

        System.out.println(Arrays.deepToString(collect1.toArray()));


    }

    @Test
    public void ff9() {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }


//            long t0 = System.nanoTime();
//
//            long count = values.stream().sorted().count();
//            System.out.println(count);
//
//            long t1 = System.nanoTime();
//
//            long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//            System.out.println(String.format("sequential sort took: %d ms", millis));

        long t0 = System.nanoTime();

        long count = values.parallelStream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();


        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);


        System.out.println(String.format("parallel sort took: %d ms", millis));


    }

    @Test
    public void asse() {
        boolean isOpen = false;

        // 如果开启了断言，会将isOpen的值改为true
        assert isOpen = true;

        boolean result = 5 != 6;
        if (result) {
            System.out.println(result);
        }
        assert result;
        // 打印是否开启了断言，如果为false，则没有启用断言
//            System.out.println(isOpen);
    }


    @Test
    public void test1() {

        AtomicInteger atomicInteger = new AtomicInteger(123);
        boolean b = atomicInteger.compareAndSet(123, 234);

        System.out.println(b);
        System.out.println(atomicInteger.getAndAdd(111) + "--" + atomicInteger);


    }

    Semaphore semaphore = new Semaphore(5, true);

    @Test
    public void test2() throws Exception {

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                return;
            }
        }
        );

        Class.forName("sldfk");
        this.getClass();

        semaphore.acquire();
        Thread.sleep(1000);
        System.out.println(System.currentTimeMillis());
        semaphore.release();


    }


    @Test
    public void test3() {

        proxyTest proxyTest = new proxyTest();
        List list = proxyTest.doS();

        list.add(22222);
        System.out.println(list);
    }

    @Test
    public void test4(){

        List<Integer> integers = new ArrayList<>();

        MyInvocationHandler<List> arrayListMyInvocationHandler = new MyInvocationHandler<List>(integers);

        List list = (List)Proxy.newProxyInstance(integers.getClass().getClassLoader(), integers.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(integers,args);
            }
        });

        list.add(2);

        list.add(23234);

        System.out.println(list);
    }


    @Test
    public void test5(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ArrayList.class);
        enhancer.setCallback(new CglibProxy());

        ArrayList helloConcrete = (ArrayList)enhancer.create();
        helloConcrete.add("张校长");
        System.out.println(helloConcrete);

    }

    @Test
    public void  test6(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ArrayList.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                return methodProxy.invokeSuper(o,objects);
            }
        });
      ArrayList list= (ArrayList)enhancer.create();
      list.add("wwwww");
      list.add("wwwww");
      list.add("wwwww");
      list.add("wwwww");

        System.out.println(list);
    }

}


