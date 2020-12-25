package com.designpattern.DecoratorDesignPattern;

import com.designpattern.DecoratorDesignPattern.Decorator.ChinesePeople;
import com.designpattern.DecoratorDesignPattern.Decorator.HenanPeople;
import com.designpattern.DecoratorDesignPattern.Decorator.JiyuanPeople;

/**
 * @Author: lxq
 * @Date: 2020/12/25 14:32
 */
public class Client {

    public static void main(String[] args) {

        NormalPeople normalPeople = new NormalPeople();

        ChinesePeople chinesePeople = new ChinesePeople(normalPeople);

        HenanPeople henanPeople = new HenanPeople(chinesePeople);

        JiyuanPeople jiyuanPeople = new JiyuanPeople(henanPeople);

        jiyuanPeople.say();


    }

}
