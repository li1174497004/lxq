package com.ChainOfResponse.ChainTest;

/**
 * @program: lxq
 * @description: 测试
 * @author: Mr.lxq
 * @create: 2019-05-29 15:34
 **/

public class LeaderTest {

    public static void main(String[] args) {

        Student student = new Student("张同学");

        TeamLeader teamLeader = new TeamLeader("组长");

        ClassLeader classLeader = new ClassLeader("班长");

        SchoolLeader schoolLeader = new SchoolLeader("校长");


        teamLeader.setNext(classLeader).setNext(schoolLeader);


        teamLeader.doAction(student);

    }





}
