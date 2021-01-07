package com.designpattern.duotai;

/**
 * @Author: lxq
 * @Date: 2021/4/26 17:48
 */
public enum Fruit {
    Apple("苹果",1),
    Banana("香蕉",2),
    BlackBerry("草莓",3),
    Bear("梨",4);
    private String s;
    private int i;

    Fruit(String s, int i) {
        this.s = s;
        this.i = i;
    }
}
