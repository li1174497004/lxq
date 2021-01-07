package com.designpattern.TemplateMethodDesignPatern.Template;

/**
 * @Author: lxq
 * @Date: 2021/1/5 14:59
 */
public class ConcreteClass1 extends AbstractClass {

    @Override
    void method1() {
        System.out.println("我是。。"+this.getClass().toString()+"。。。。方法1");
    }

    @Override
    void method2() {

    }
}
