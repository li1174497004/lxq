package com.designpattern.StrategyDesignPattern.SimpleStrategyDesignPattern;


/**
 * @Author: lxq
 * @Date: 2021/1/7 14:35
 */

public class Client {


    public static void main(String[] args) {

        //这里的OrderType类型可以是方法调用时传递过来的。
        OrderType normal =OrderType.NORMAL;
        DiscountStrategy discountStrategy = getResult(normal);
    }

    private static DiscountStrategy getResult(OrderType normal) {
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(normal);
        discountStrategy.calDiscount(new Order());
        return discountStrategy;
    }
}
