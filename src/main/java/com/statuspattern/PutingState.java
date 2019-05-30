package com.statuspattern;

/**
 * @program: lxq
 * @description: 放置炸药状态
 * @author: Mr.lxq
 * @create: 2019-05-30 10:50
 **/

public class PutingState implements Status {
    @Override
    public void carry() {
        System.out.println("已经把炸弹抗过去了。。。");
    }

    @Override
    public void put() {
        System.out.println("正在放置炸弹。。。。。。");
    }

    @Override
    public void goaway() {
        System.out.println("还没有放置炸弹。。。不能离开。");
    }

    @Override
    public void ignite() {
        System.out.println("还没有放置炸弹。。。不能引爆。。");
    }
}
