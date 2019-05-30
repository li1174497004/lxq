package com.statuspattern;

/**
 * @program: lxq
 * @description: 状态模式测试
 * @author: Mr.lxq
 * @create: 2019-05-30 11:17
 **/

public class StatusTest {

    public static void main(String[] args) {
        Context context = new Context();

        context.setStatus(new PutingState());



        context.carry();

        context.put();
    }



}
