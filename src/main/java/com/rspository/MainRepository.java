package com.rspository;

/**
 * @program: lxq
 * @description: 策略分配
 * @author: Mr.lxq
 * @create: 2019-05-29 16:56
 **/

public class MainRepository {

    private Ropository ropository;

    public MainRepository(Ropository ropository) {
        this.ropository = ropository;
    }

    public void doMath(int i){

        ropository.doSome(i);

    }



}
