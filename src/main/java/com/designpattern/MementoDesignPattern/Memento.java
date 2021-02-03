package com.designpattern.MementoDesignPattern;

/**
 * @Author: lxq
 * @Date: 2021/2/2 14:35
 */
public class Memento {

    private String state;


    public Memento(String state) {
        this.state = state;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
