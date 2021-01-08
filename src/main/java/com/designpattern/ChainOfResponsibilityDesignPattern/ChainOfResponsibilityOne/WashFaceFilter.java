package com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityOne;

import com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern.PreparationList;

/**
 * @Author: lxq
 * @Date: 2021/1/7 17:54
 * 洗脸
 */
public class WashFaceFilter  extends AbstractPrepareFilter{

    public WashFaceFilter(
            AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PreparationList preparationList) {
        if (preparationList.isWashFace()) {
            System.out.println("洗脸");
        }
    }
}
