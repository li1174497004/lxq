package com.designpattern;

/**
 * @program: lxq
 * @description: 测试装饰者模式
 * @author: Mr.lxq
 * @create: 2019-04-08 16:33
 **/

public class testDesign {
    public static void main(String[] args) {
        Pancake sz = new shouzhuaCake("手抓饼....");
        sz= new Ham(sz);
        sz= new FireEgg(sz);
        System.out.println(sz.price());
        System.out.println(sz.desC());

    }
}
