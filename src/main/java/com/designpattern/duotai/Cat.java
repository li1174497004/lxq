package com.designpattern.duotai;

import static org.mockito.Mockito.when;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: lxq
 * @Date: 2021/4/25 17:34
 */
class Cat extends Animal {


    public Cat(int age) {
        this.age = age;
    }

    public Cat() {
    }

    static int num = 11;

    int age = 22;

    public void eat(){
        System.out.println("cat 吃");
    }
    public  void semll(){
        System.out.println("cat smell");
    }

    public static void main(String[] args) throws ClassNotFoundException {

       EnumSet<Fruit> e1 = EnumSet.allOf(Fruit.class);


        for (Fruit o : e1) {

            System.out.println(o);
        }
    }

}
