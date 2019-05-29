package com.ChainOfResponse;

/**
 * @program: lxq
 * @description: 解决问题抽象类
 * @author: Mr.lxq
 * @create: 2019-05-29 11:27
 **/

public abstract  class Support {

    private  String name;
    private  Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public void support(Trouble trouble){
        if (resolve(trouble)){
            done(trouble);
        }else if (null !=next){
            next.support(trouble);
        }else {
            fail(trouble);
        }

    }

    @Override
    public String toString() {
        return "【"+name+"】";
    }

    protected  abstract  boolean resolve(Trouble trouble);

    protected  void  done(Trouble trouble){
        System.out.println(trouble.getName()+"     is resolved By"+this+".");
    }

    protected  void  fail(Trouble trouble){
        System.out.println(trouble + "cannot be resolved.");
    }







}
