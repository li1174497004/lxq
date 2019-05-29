package com.ChainOfResponse;

/**
 * @program: lxq
 * @description: 问题模拟类
 * @author: Mr.lxq
 * @create: 2019-05-29 11:34
 **/

public class Trouble {
    private String name;
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public Trouble(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
