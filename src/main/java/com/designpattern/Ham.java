package com.designpattern;

/**
 * @program: lxq
 * @description: 火腿装饰类
 * @author: Mr.lxq
 * @create: 2019-04-08 16:32
 **/

public class Ham implements Pancake {
    private Pancake pancake;

    public Ham(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String desC() {
        return pancake.desC()+"加了火腿....";
    }

    @Override
    public double price() {
        return pancake.price()+2.3;
    }
}
