package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: lxq
 * @description: 动态代理
 * @author: Mr.lxq
 * @create: 2019-05-27 18:58
 **/

public class MyInvocationHandler<T> implements InvocationHandler {
     T target;

    public MyInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
}
