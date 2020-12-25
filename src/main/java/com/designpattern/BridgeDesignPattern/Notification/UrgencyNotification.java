package com.designpattern.BridgeDesignPattern.Notification;

import com.designpattern.BridgeDesignPattern.MsgSender.MsgSender;

/**
 * @Author: lxq
 * @Date: 2020/12/25 11:02
 */
public class UrgencyNotification extends Notification {

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

    }
}
