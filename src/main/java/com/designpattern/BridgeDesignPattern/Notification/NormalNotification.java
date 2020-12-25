package com.designpattern.BridgeDesignPattern.Notification;

import com.designpattern.BridgeDesignPattern.MsgSender.MsgSender;

/**
 * @Author: lxq
 * @Date: 2020/12/25 11:04
 */
public class NormalNotification extends Notification {

    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

    }
}
