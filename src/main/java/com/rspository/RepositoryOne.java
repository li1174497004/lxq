package com.rspository;

/**
 * @program: lxq
 * @description: 策略1
 * @author: Mr.lxq
 * @create: 2019-05-29 16:43
 **/

public class RepositoryOne implements Ropository {
    @Override
    public void doSome(int i) {
        System.out.println("进入到了策略一。。。。。。");
    }
}
