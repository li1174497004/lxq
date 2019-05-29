package com.ChainOfResponse.ChainTest;

import java.util.Random;

/**
 * @program: lxq
 * @description: 组长
 * @author: Mr.lxq
 * @create: 2019-05-29 15:08
 **/

public class TeamLeader extends Leader {

    public TeamLeader(String name) {
        super(name);
    }

    @Override
    boolean result(Student student) {

        boolean b = new Random().nextBoolean();

        return b;
    }

    @Override
    void success(Student student) {
        System.out.println("TeamLeader --- 通过");
    }

    @Override
    void fail(Student student) {
        System.out.println("TeamLeader --- 不通过");

    }
}
