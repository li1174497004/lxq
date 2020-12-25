package com.designpattern.ProxyDesignPattern.ProxyDesignTwo;

import com.designpattern.ProxyDesignPattern.User;
import java.lang.reflect.Method;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;

/**
 * @Author: lxq
 * @Date: 2020/12/24 17:38
 */
public class CglibProxy {

    public static final MethodInterceptor CALLBACK = new MethodInterceptor() {
        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
                throws Throwable {
            System.out.println("我叫。。。。什么？？？");
            methodProxy.invokeSuper(o, objects);
            System.out.println("我有名字了。。。。。。。");
            return o;
        }
    };

    public static void main(String[] args) {
       Enhancer enhancer = new Enhancer();
       enhancer.setSuperclass(new User().getClass());
       enhancer.setCallback(CALLBACK);

       User user = (User)enhancer.create();
       user.say("贾世辉。。。。");
    }
}
