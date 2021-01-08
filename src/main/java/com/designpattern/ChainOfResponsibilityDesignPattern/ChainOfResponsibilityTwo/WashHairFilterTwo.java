package com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityTwo;

import com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityOne.AbstractPrepareFilter;
import com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern.PreparationList;

/**
 * @Author: lxq
 * @Date: 2021/1/7 17:55
 */
public class WashHairFilterTwo implements StudyPrepareFilter {


    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if (preparationList.isWashHair()) {
            System.out.println("洗头");
        }

        filterChain.doFilter(preparationList, filterChain);
    }


}
