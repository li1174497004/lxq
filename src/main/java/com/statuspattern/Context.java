package com.statuspattern;

/**
 * @program: lxq
 * @description: 起始和保存状态
 * @author: Mr.lxq
 * @create: 2019-05-30 11:06
 **/

public class Context {
    public final static CarryingState carryingState = new CarryingState();
    public final static PutingState puttingState = new PutingState();
    public final static GoawayingState goawayingState = new GoawayingState();
    public final static IgniteingState ignitingState = new IgniteingState();

    private  Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public void carry(){
        status.carry();
    }

    public void put(){

        status.put();
    }


    public void goaway(){
        status.goaway();
    }

    public void ignite(){
        status.ignite();
    }

}
