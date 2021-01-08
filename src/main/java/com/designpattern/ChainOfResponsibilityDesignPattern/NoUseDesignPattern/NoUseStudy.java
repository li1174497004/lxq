package com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern;

/**
 * @Author: lxq
 * @Date: 2021/1/7 17:15
 * 接着定义一个学习类，按妈妈要求，把妈妈要求的事情做完了再去上学：
 */
public class NoUseStudy {

    public void study(PreparationList preparationList) {
        if (preparationList.isWashHair()) {
            System.out.println("洗脸");
        }
        if (preparationList.isWashHair()) {
            System.out.println("洗头");
        }
        if (preparationList.isHaveBreakfast()) {
            System.out.println("吃早餐");
        }

        System.out.println("我可以去上学了！");
    }
}
