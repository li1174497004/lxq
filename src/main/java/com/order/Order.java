package com.order;

/**
 * @program: lxq
 * @description: 命令者
 * @author: Mr.lxq
 * @create: 2019-05-29 09:58
 **/

public class Order {
    private Command command;

    public Order(Command command) {
        this.command = command;
    }

    public void doCommand(){
        command.doAction();
    }
}
