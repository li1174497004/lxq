package com.designpattern.CompositeDesignPattern.HumanExample;

/**
 * @Author: lxq
 * @Date: 2020/12/29 17:43
 */
public class Employee extends HumanResource {

    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
