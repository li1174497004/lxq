package com.designpattern.ProxyDesignPattern.ProxyDesignOne;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: lxq
 * @Date: 2020/12/24 17:40
 */
public class Userhandler implements InvocationHandler {

    private Object objectProxy;

    public Userhandler(Object object) {
        this.objectProxy = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("我没有名字");
        Object result = method.invoke(objectProxy,objects);
        System.out.println("我有名字了。。。。呵呵哒。。。。");
        return result;
    }
}
