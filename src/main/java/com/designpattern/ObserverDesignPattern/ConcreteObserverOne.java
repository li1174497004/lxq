package com.designpattern.ObserverDesignPattern;

/**
 * @Author: lxq
 * @Date: 2020/12/30 17:34
 */
public class ConcreteObserverOne implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("........");
    }
}
