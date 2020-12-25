package com.designpattern.DecoratorDesignPattern;

/**
 * @Author: lxq
 * @Date: 2020/12/25 14:33
 */
public class NormalPeople implements People {

    @Override
    public void say() {
        System.out.println("我是一个普通的。。来自哪里？");
    }
}
