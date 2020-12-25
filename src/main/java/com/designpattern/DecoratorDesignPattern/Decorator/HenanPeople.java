package com.designpattern.DecoratorDesignPattern.Decorator;

import com.designpattern.DecoratorDesignPattern.People;

/**
 * @Author: lxq
 * @Date: 2020/12/25 14:21
 */
public class HenanPeople extends AbstractDecorator {


    public HenanPeople(People people) {
        super(people);
    }

    @Override
    public void say() {
        super.say();
        System.out.println("我来自。。。。河南");
    }
}
