package com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityTwo;

import com.designpattern.ChainOfResponsibilityDesignPattern.ChainOfResponsibilityOne.Study;
import com.designpattern.ChainOfResponsibilityDesignPattern.NoUseDesignPattern.PreparationList;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lxq
 * @Date: 2021/1/8 11:23
 */
public class FilterChain implements StudyPrepareFilter {


    private List<StudyPrepareFilter> list = new ArrayList();


    private Study study;

    private int count = 0;

    public FilterChain(Study study) {
        this.study = study;
    }

    public void addFilter(StudyPrepareFilter filter) {
        list.add(filter);
    }


    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if (list.size() == count){
            study.study();
        }
        list.get(count).doFilter(preparationList,filterChain);
        count = count+1;
    }
}
