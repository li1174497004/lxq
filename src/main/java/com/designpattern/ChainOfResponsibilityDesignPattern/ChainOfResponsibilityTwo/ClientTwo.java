package com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityTwo;

import com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityOne.Study;
import com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern.PreparationList;

/**
 * @Author: lxq
 * @Date: 2021/1/8 14:52
 */
public class ClientTwo {

    public static void main(String[] args) {
        PreparationList preparationList = new PreparationList();
        preparationList.setHaveBreakfast(true);
        preparationList.setWashFace(false);
        preparationList.setWashHair(true);
        FilterChain chain = new FilterChain(new Study());
        chain.addFilter(new WashFaceFilterTwo());
        chain.addFilter(new WashHairFilterTwo());
        chain.addFilter(new HaveBreakfastFilterTwo());
        chain.doFilter(preparationList, chain);

    }


}
