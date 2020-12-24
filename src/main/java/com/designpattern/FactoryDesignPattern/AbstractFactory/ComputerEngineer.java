package com.designpattern.FactoryDesignPattern.AbstractFactory;

import com.designpattern.FactoryDesignPattern.AbstractFactory.Computer.Cpu;
import com.designpattern.FactoryDesignPattern.AbstractFactory.Computer.Mainboard;

/**
 * @Author: lxq
 * @Date: 2020/12/23 17:07
 */
public class ComputerEngineer {

    /**     * 定义组装机需要的CPU     */
    private Cpu cpu = null;
    /**     * 定义组装机需要的主板     */
    private Mainboard mainboard = null;

    public void makeComputer(
            AbstractFactory af) {
        /**         * 组装机器的基本步骤         */
        //1:首先准备好装机所需要的配件
        prepareHardwares(af);
        //2:组装机器
        // 3:测试机器
        // 4：交付客户

    }

    private void prepareHardwares(AbstractFactory af) {
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        // 可是，装机工程师并不知道如何去创建，怎么办呢？
        // 直接找相应的工厂获取

        this.cpu = af.creatCpu();
        this.mainboard = af.creatMainboard();
        //测试配件是否好用
        // this.cpu.calculate();
        // this.mainboard.installCPU();
    }

    public static void main(String[]args){
        //创建装机工程师对象
        ComputerEngineer cf = new ComputerEngineer();
        //客户选择并创建需要使用的产品对象
        AbstractFactory af = new InterFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);
    }
}
