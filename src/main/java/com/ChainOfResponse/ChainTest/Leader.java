package com.ChainOfResponse.ChainTest;

/**
 * @program: lxq
 * @description: 面试官抽象类
 * @author: Mr.lxq
 * @create: 2019-05-29 14:44
 **/

public abstract class Leader{
    private String name;
    private Leader next;

    public Leader(String name) {
        this.name = name;
    }

    public Leader setNext(Leader next) {
        this.next = next;
        return next;
    }

    public void doAction(Student student){

        boolean result = result(student);
        if (result){
            success(student);
            if (null !=next){

                next.doAction(student);
            }
//        }else if (null != next){
//          next.doAction(student);
        }else {
            fail(student);
        }

    }
    abstract boolean result(Student student);

    abstract void success(Student student);

    abstract void fail(Student student);

}
