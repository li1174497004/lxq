package com.designpattern;

/**
 * @program: lxq
 * @description: 煎鸡蛋装饰类
 * @author: Mr.lxq
 * @create: 2019-04-08 16:31
 **/

public class FireEgg extends Dector {
    private Pancake pancake;

    public FireEgg(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String desC() {
        return pancake.desC()+"加了鸡蛋....";
    }

    @Override
    public double price() {
        return pancake.price() + 1.5;
    }
}
