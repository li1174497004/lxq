package com.designpattern.MementoDesignPattern;

/**
 * @Author: lxq
 * @Date: 2021/2/2 14:46
 */
public class Caretaker {
    private Memento mMemento;

    public Memento restoreMemento(){
        return mMemento;
    }

    public void storeMemento(Memento memento){
        this.mMemento = memento;
    }


}
