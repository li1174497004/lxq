package com.ChainOfResponse;

/**
 * @program: lxq
 * @description: 不解决问题类
 * @author: Mr.lxq
 * @create: 2019-05-29 13:49
 **/

public class NoSupport extends  Support{

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
