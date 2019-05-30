package com.statuspattern;

/**
 * @program: lxq
 * @description: 引爆状态
 * @author: Mr.lxq
 * @create: 2019-05-30 10:54
 **/

public class IgniteingState implements Status {
    @Override
    public void carry() {
        System.out.println("已经抗过去了炸弹。。。。");
    }

    @Override
    public void put() {
        System.out.println("已经放置了炸弹。。。。。");
    }

    @Override
    public void goaway() {
        System.out.println("已经撤退了。。。。。");
    }

    @Override
    public void ignite() {
        System.out.println("引爆炸弹。。。。。");
    }
}
