package com.designpattern.ObserverDesignPattern;

/**
 * @Author: lxq
 * @Date: 2020/12/30 17:34
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.registerObserver(new ConcreteObserverOne());
        concreteSubject.registerObserver(new ConcreteObserverTwo());
        concreteSubject.notifyObservers(new Message());
    }

}
