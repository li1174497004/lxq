package com.designpattern.BridgeDesignPattern.Notification;

import com.designpattern.BridgeDesignPattern.MsgSender.MsgSender;

/**
 * @Author: lxq
 * @Date: 2020/12/25 11:06
 */
public class TrivialNotification extends Notification {

    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

    }
}
