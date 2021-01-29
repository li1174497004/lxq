package com.designpattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: lxq
 * @Date: 2021/1/29 17:17
 */
public class Client {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("11","22","33","44");

        ArrayIterator listIterator = new ArrayIterator<>(list);

        while (listIterator.hasNext()){
            System.out.println(listIterator.currentItem().toString());
            listIterator.next();
        }


    }


}
