package com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityOne;

import com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern.PreparationList;


/**
 * @Author: lxq
 * @Date: 2021/1/7 17:22
 */
public abstract class AbstractPrepareFilter {
    private AbstractPrepareFilter nextPrepareFilter;

    public AbstractPrepareFilter(AbstractPrepareFilter nextPrepareFilter) {
        this.nextPrepareFilter = nextPrepareFilter;
    }

    public void doFilter(PreparationList preparationList, Study study) {
        prepare(preparationList);

        if (nextPrepareFilter == null) {
            study.study();
        } else {
            nextPrepareFilter.doFilter(preparationList, study);
        }
    }

    public abstract void prepare(PreparationList preparationList);


}
