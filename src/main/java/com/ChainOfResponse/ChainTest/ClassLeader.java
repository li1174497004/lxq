package com.ChainOfResponse.ChainTest;

import java.util.Random;

/**
 * @program: lxq
 * @description: 班长
 * @author: Mr.lxq
 * @create: 2019-05-29 15:10
 **/

public class ClassLeader extends Leader {
    public ClassLeader(String name) {
        super(name);
    }

    @Override
    boolean result(Student student) {
        boolean b = new Random().nextBoolean();

        return b;
    }

    @Override
    void success(Student student) {
        System.out.println("ClassLeader --- 通过");
    }

    @Override
    void fail(Student student) {
        System.out.println("ClassLeader --- 不通过");
    }
}
