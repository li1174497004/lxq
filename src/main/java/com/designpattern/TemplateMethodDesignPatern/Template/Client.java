package com.designpattern.TemplateMethodDesignPatern.Template;

/**
 * @Author: lxq
 * @Date: 2021/1/5 15:03
 */
public class Client {

    public static void main(String[] args) {

        AbstractClass a1 = new ConcreteClass1();
        a1.method1();

    }

}
