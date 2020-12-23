package com.designpattern.FactoryDesignPattern.AbstractFactory;

import com.designpattern.FactoryDesignPattern.AbstractFactory.Computer.Cpu;
import com.designpattern.FactoryDesignPattern.AbstractFactory.Computer.InterCpu;
import com.designpattern.FactoryDesignPattern.AbstractFactory.Computer.InterMainboard;
import com.designpattern.FactoryDesignPattern.AbstractFactory.Computer.Mainboard;

/**
 * @Author: lxq
 * @Date: 2020/12/23 16:55
 */
public class InterFactory implements AbstractFactory {

    @Override
    public Cpu creatCpu() {
        return new InterCpu();
    }

    @Override
    public Mainboard creatMainboard() {
        return new InterMainboard();
    }
}
