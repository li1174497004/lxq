package com.designpattern.IteratorDesignPattern;

import java.util.List;

/**
 * @Author: lxq
 * @Date: 2021/1/29 17:09
 */
public class ArrayIterator<T> implements Iterator {

    private List<T> list;

    private int curNum;

    public ArrayIterator(List<T> list) {
        this.list = list;
        curNum = 0;
    }

    @Override
    public boolean hasNext() {
        return curNum < list.size();
    }

    @Override
    public void next() {
        curNum++;
    }

    @Override
    public T currentItem() {
        return list.get(curNum);
    }


}
