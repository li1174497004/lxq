package com.designpattern.ObserverDesignPattern;

/**
 * @Author: lxq
 * @Date: 2020/12/30 17:14
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Message message);
}
