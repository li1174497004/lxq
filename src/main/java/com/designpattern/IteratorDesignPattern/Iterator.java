package com.designpattern.IteratorDesignPattern;

/**
 * @Author: lxq
 * @Date: 2021/1/29 17:04
 */
public interface Iterator<E> {

    boolean hasNext();

    void next();

    E currentItem();

}
