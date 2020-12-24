package com.designpattern.ProxyDesignPattern.ProxyDesignOne;

import java.lang.reflect.Proxy;

/**
 * @Author: lxq
 * @Date: 2020/12/24 17:52
 */
public class UserProxy {

    public Object creatProxyUser(Object object){

         return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),new Userhandler(object));

    }

}
