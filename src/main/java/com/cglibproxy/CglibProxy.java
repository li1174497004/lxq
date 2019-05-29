package com.cglibproxy;

import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: lxq
 * @description: 动态代理
 * @author: Mr.lxq
 * @create: 2019-05-28 16:36
 **/

public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invokeSuper(o,objects);
    }
}
