package com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityTwo;

import com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityOne.AbstractPrepareFilter;
import com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern.PreparationList;

/**
 * @Author: lxq
 * @Date: 2021/1/7 17:54
 * 洗脸
 */
public class WashFaceFilterTwo implements StudyPrepareFilter {

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if (preparationList.isWashFace()) {
            System.out.println("洗脸");
        }
        filterChain.doFilter(preparationList, filterChain);
    }
}
