package com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityTwo;

import com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityOne.AbstractPrepareFilter;
import com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern.PreparationList;

/**
 * @Author: lxq
 * @Date: 2021/1/7 17:56
 */
public class HaveBreakfastFilterTwo implements StudyPrepareFilter{

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if (preparationList.isHaveBreakfast()) {
            System.out.println("吃早餐");
        }
        filterChain.doFilter(preparationList, filterChain);
    }

}
