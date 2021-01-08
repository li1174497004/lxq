package com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityOne;

import com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern.PreparationList;

/**
 * @Author: lxq
 * @Date: 2021/1/7 17:56
 */
public class HaveBreakfastFilter extends AbstractPrepareFilter{


    public HaveBreakfastFilter(
            AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PreparationList preparationList) {
        if (preparationList.isHaveBreakfast()) {
            System.out.println("吃早餐");
        }
    }
}
