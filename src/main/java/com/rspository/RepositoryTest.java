package com.rspository;

import java.util.Random;

/**
 * @program: lxq
 * @description: 测试策略模式
 * @author: Mr.lxq
 * @create: 2019-05-29 16:52
 **/

public class RepositoryTest {

    public static void main(String[] args) {
        Student student = null;
        for (int i =0;i<20;i++){

             student = new Student((int)(Math.random()*1000));
            System.out.println(student.getI());
        if (student.getI()<=100){
            MainRepository mainRepository = new MainRepository(new RepositoryOne());
            mainRepository.doMath(student.getI());
        }else if (student.getI()>100 && student.getI()<=200){
            MainRepository mainRepository = new MainRepository(new RepositoryTwo());
            mainRepository.doMath(student.getI());
        }else if (student.getI()>200 ){
            MainRepository mainRepository = new MainRepository(new RepositoryThree());
            mainRepository.doMath(student.getI());
        }
    }

    }

}
