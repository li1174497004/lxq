package com.ChainOfResponse;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @program: lxq
 * @description: 解决有限范围内问题
 * @author: Mr.lxq
 * @create: 2019-05-29 13:50
 **/

public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name,int limit) {
        super(name);
        this.limit =limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber()<limit;
    }
}
