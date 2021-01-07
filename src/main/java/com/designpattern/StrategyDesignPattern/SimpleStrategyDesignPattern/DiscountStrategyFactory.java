package com.designpattern.StrategyDesignPattern.SimpleStrategyDesignPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lxq
 * @Date: 2021/1/7 14:14
 */
public class DiscountStrategyFactory {

    public static final Map<OrderType,DiscountStrategy> map = new HashMap<>();

    static {
        map.put(OrderType.NORMAL,new NormalDiscountStrategy());
        map.put(OrderType.GROUPON,new GrouponDiscountStrategy());
        map.put(OrderType.PROMOTION,new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderType orderType){
        return map.get(orderType);
    }

}
