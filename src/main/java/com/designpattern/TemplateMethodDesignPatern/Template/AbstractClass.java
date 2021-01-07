package com.designpattern.TemplateMethodDesignPatern.Template;

/**
 * @Author: lxq
 * @Date: 2021/1/5 14:57
 */
public abstract class AbstractClass {

    public final void templateMethod(){


        method1();

        method2();
    }

    abstract void method1();

    abstract void method2();


}
