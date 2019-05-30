package com.java8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: lxq
 * @description: 动态代理
 * @author: Mr.lxq
 * @create: 2019-05-27 18:37
 **/

public class proxyTest {

  private List list =new ArrayList();
    public List doS(){
        List s =(List)Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(list, args);
            }
        });
            return s;
    }


}
