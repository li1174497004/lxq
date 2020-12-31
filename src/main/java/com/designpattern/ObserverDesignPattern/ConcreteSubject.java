package com.designpattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lxq
 * @Date: 2020/12/30 17:24
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
