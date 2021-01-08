package com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityOne;

import com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern.PreparationList;

/**
 * @Author: lxq
 * @Date: 2021/1/7 17:55
 */
public class WashHairFilter extends AbstractPrepareFilter {


    public WashHairFilter(
            AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PreparationList preparationList) {
        if (preparationList.isWashHair()) {
            System.out.println("洗头");
        }
    }
}
