package com.designpattern.DecoratorDesignPattern.Decorator;

import com.designpattern.DecoratorDesignPattern.People;

/**
 * @Author: lxq
 * @Date: 2020/12/25 15:04
 */
public abstract class AbstractDecorator implements People {

    private People people;

    public AbstractDecorator(People people) {
        this.people = people;
    }

    public  void say(){
        people.say();
    } ;
}
