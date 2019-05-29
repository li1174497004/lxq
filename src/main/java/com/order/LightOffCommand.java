package com.order;

/**
 * @program: lxq
 * @description: 关灯
 * @author: Mr.lxq
 * @create: 2019-05-29 09:56
 **/

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void doAction() {
        light.lightOff();
    }
}
