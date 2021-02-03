package com.designpattern.MementoDesignPattern;

/**
 * @Author: lxq
 * @Date: 2021/2/2 14:43
 */
public class Originator {

    private String state;

    public Memento createMemento(){
        return new Memento(state);
    }


    public  void restore(Memento memento){
        this.state = memento.getState();
    }


}
