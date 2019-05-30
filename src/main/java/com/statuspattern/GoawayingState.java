package com.statuspattern;

/**
 * @program: lxq
 * @description: 离开状态
 * @author: Mr.lxq
 * @create: 2019-05-30 10:54
 **/

public class GoawayingState implements Status {
    @Override
    public void carry() {
        System.out.println("我已经到了炮楼下边。。。。。");
    }

    @Override
    public void put() {
        System.out.println("已经放置了炸弹。。。。。。");
    }

    @Override
    public void goaway() {
        System.out.println("正在撤离。。。。");
    }

    @Override
    public void ignite() {
        System.out.println("还没有撤离，，，，引爆失败。。。。。");
    }
}
