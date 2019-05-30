package com.Observer;

/**
 * @program: lxq
 * @description: 学生类
 * @author: Mr.lxq
 * @create: 2019-05-29 18:00
 **/

public class Student implements  Notify{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void notifyme() {
        System.out.println("我的名字是"+name+",通知我的时间是"+System.currentTimeMillis());
    }
}
