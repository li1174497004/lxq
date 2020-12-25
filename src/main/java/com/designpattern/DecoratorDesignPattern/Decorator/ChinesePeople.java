package com.designpattern.DecoratorDesignPattern.Decorator;

import com.designpattern.DecoratorDesignPattern.People;

/**
 * @Author: lxq
 * @Date: 2020/12/25 14:13
 */
public class ChinesePeople extends AbstractDecorator {


    public ChinesePeople(People people) {
        super(people);
    }

    @Override
    public void say() {
        super.say();
        System.out.println("我是来自。。。中国" );

    }
}




