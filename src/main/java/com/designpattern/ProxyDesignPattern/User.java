package com.designpattern.ProxyDesignPattern;

/**
 * @Author: lxq
 * @Date: 2020/12/24 17:35
 */
public class User implements UserInterface {

    @Override
    public void say(String name) {
        System.out.println("名字是。。。"+name);
    }
}
