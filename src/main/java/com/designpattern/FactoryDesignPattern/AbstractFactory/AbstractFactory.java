package com.designpattern.FactoryDesignPattern.AbstractFactory;

import com.designpattern.FactoryDesignPattern.AbstractFactory.Computer.Cpu;
import com.designpattern.FactoryDesignPattern.AbstractFactory.Computer.Mainboard;
import jdk.tools.jaotc.Main;

/**
 * @Author: lxq
 * @Date: 2020/12/23 16:54
 */
public interface AbstractFactory {

    Cpu creatCpu();


    Mainboard creatMainboard();


}
