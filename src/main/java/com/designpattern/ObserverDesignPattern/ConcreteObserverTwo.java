package com.designpattern.ObserverDesignPattern;

/**
 * @Author: lxq
 * @Date: 2020/12/30 17:29
 */
public class ConcreteObserverTwo implements  Observer {

    @Override
    public void update(Message message) {
        System.out.println("----------");
    }
}
