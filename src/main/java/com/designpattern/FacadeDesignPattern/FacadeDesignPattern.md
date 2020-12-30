### 门面模式
- 门面模式，也叫外观模式：门面模式为子系统提供一组统一的接口，定义一组高层接口让子系统更易用。    
- 假设一个系统A,提供了a,b,c,d四个接口，系统B完成摸个业务功能，需要调用A系统的a,b,c接口，利用
门面模式，我们一共一个包裹a,b,d接口调用的门面接口x，给系统B直接使用。    
- 门面模式可以用来封装系统的底层实现，隐藏系统的复杂性，提供一组更加简单易用，更高层的接口。    
- 完成接口的设计，就相当于完成了一半的开发，接口设计的好，代码也会相应很好。尽量保证接口的复用性，但是
针对特殊情况，允许使用冗余的门面接口，来提供更易用的接口。
- 使用门面模式还有一个附带的好处，能够有选择行的暴露方法，一个模块中定义的方法可以分成两部分，一部分给子系统外部使用
一部分是子系统内部之间相互调用使用。
~~~java
public class Module {
    /**
     * 提供给子系统外部使用的方法
     */
    public void a1(){};
    
    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void a2(){};
    private void a3(){};
}
public class ModuleB {
    /**
     * 提供给子系统外部使用的方法
     */
    public void b1(){};
    
    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void b2(){};
    private void b3(){};
}
public class ModuleC {
    /**
     * 提供给子系统外部使用的方法
     */
    public void c1(){};
    
    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void c2(){};
    private void c3(){};
}
public class ModuleFacade {
    
    ModuleA a = new ModuleA();
    ModuleB b = new ModuleB();
    ModuleC c = new ModuleC();
    /**
     * 下面这些是A、B、C模块对子系统外部提供的方法
     */
    public void a1(){
        a.a1();
    }
    public void b1(){
        b.b1();
    }
    public void c1(){
        c.c1();
    }
}
~~~

