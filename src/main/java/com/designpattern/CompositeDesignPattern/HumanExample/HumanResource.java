package com.designpattern.CompositeDesignPattern.HumanExample;

/**
 * @Author: lxq
 * @Date: 2020/12/29 17:42
 */
public abstract class HumanResource {

    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}
