package com.ChainOfResponse.ChainTest;

import java.util.Random;

/**
 * @program: lxq
 * @description: 学校
 * @author: Mr.lxq
 * @create: 2019-05-29 15:12
 **/

public class SchoolLeader extends Leader {
    public SchoolLeader(String name) {
        super(name);
    }

    @Override
    boolean result(Student student) {
        boolean b = new Random().nextBoolean();

        return b;
    }

    @Override
    void success(Student student) {
        System.out.println("SchoolLeader --- 通过");

    }

    @Override
    void fail(Student student) {
        System.out.println("SchoolLeader --- 通过");

    }
}
