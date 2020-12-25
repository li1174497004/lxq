package com.designpattern.BridgeDesignPattern.Notification;

import com.designpattern.BridgeDesignPattern.MsgSender.MsgSender;

/**
 * @Author: lxq
 * @Date: 2020/12/25 11:00
 */
public abstract class Notification {

    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
