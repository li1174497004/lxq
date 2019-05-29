package com.order;

/**
 * @program: lxq
 * @description: 开灯
 * @author: Mr.lxq
 * @create: 2019-05-29 09:55
 **/

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void doAction() {
      light.lightOn();
    }
}
