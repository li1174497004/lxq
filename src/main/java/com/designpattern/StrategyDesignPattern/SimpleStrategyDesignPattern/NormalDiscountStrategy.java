package com.designpattern.StrategyDesignPattern.SimpleStrategyDesignPattern;

/**
 * @Author: lxq
 * @Date: 2021/1/7 14:16
 */
public class NormalDiscountStrategy implements DiscountStrategy{

    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
