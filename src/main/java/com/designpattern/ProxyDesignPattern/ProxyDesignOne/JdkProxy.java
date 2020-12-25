package com.designpattern.ProxyDesignPattern.ProxyDesignOne;

import com.designpattern.ProxyDesignPattern.User;
import com.designpattern.ProxyDesignPattern.UserInterface;

/**
 * @Author: lxq
 * @Date: 2020/12/24 17:37
 */
public class JdkProxy {
    public static void main(String[] args) {
        UserProxy userProxy = new UserProxy();
        UserInterface u = (UserInterface)userProxy.creatProxyUser(new User());
        u.say("贾世辉。。。。");
    }
}
