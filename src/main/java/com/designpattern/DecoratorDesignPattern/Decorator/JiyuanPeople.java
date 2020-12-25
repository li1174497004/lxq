package com.designpattern.DecoratorDesignPattern.Decorator;

import com.designpattern.DecoratorDesignPattern.People;
import java.io.FileInputStream;

/**
 * @Author: lxq
 * @Date: 2020/12/25 14:24
 */

public class JiyuanPeople extends AbstractDecorator {


    public JiyuanPeople(People people) {
        super(people);
    }

    @Override
    public void say() {
        super.say();
        System.out.println("我来自。。。济源");
    }
}
