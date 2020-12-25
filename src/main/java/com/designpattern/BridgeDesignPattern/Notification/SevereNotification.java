package com.designpattern.BridgeDesignPattern.Notification;

import com.designpattern.BridgeDesignPattern.MsgSender.MsgSender;

/**
 * @Author: lxq
 * @Date: 2020/12/25 11:01
 */
public class SevereNotification extends Notification {

    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
