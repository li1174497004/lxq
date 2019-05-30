package com.statuspattern;

/**
 * @program: lxq
 * @description: 抗炸药到炮楼状态
 * @author: Mr.lxq
 * @create: 2019-05-30 10:49
 **/

public class CarryingState implements Status{
    @Override
    public void carry() {
        System.out.println("我已经跑到炮楼下边了。。。。");
    }

    @Override
    public void put() {
        System.out.println("引爆了炸弹。。。。");
    }

    @Override
    public void goaway() {
        System.out.println("还没有放置炸弹，，撤离失败。。。。");
    }

    @Override
    public void ignite() {
        System.out.println("还没有放置炸弹，，，引爆失败。。。。");
    }
}
