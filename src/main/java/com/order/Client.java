package com.order;

/**
 * @program: lxq
 * @description: 测试使用
 * @author: Mr.lxq
 * @create: 2019-05-29 10:04
 **/

public class Client {
    public static void main(String[] args) {
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        LightOffCommand lightOffCommand =new LightOffCommand(light);

        Order order = new Order(lightOnCommand);

        order.doCommand();

        Order order1 =new Order(lightOffCommand);

        order1.doCommand();

    }





}
