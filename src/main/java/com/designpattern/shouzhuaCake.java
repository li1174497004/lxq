package com.designpattern;

/**
 * @program: lxq
 * @description: 手抓饼类
 * @author: Mr.lxq
 * @create: 2019-04-08 16:29
 **/

public class shouzhuaCake implements Pancake{

    private String desc;

    public shouzhuaCake(String desc) {
        this.desc = desc;
    }

    @Override
    public String desC() {
        return desc;
    }

    @Override
    public double price() {
        return 3;
    }
}
