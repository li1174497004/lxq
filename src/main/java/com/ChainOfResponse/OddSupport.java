package com.ChainOfResponse;

/**
 * @program: lxq
 * @description: 解决奇数问题
 * @author: Mr.lxq
 * @create: 2019-05-29 13:53
 **/

public class OddSupport extends Support {


    public OddSupport(String name) {
        super(name);
    }

    /**
     * @author: lxq
     * @date: 19-5-29
     * @param: [trouble]
     * @return: boolean
     * @description: 解决奇数问题
    */
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
