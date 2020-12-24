package com.designpattern.PrototypeDesignPattern.CloneOne;

/**
 * @Author: lxq
 * @Date: 2020/12/24 15:08
 */
public class Client {

    //测试类，客户端
    public static void main(String[] args) {
        WeeklyLog log_1, log_2;
        log_1 = new WeeklyLog();    //创建原型对象
        Attachment attachment = new Attachment(); //创建附件对象
        log_1.setAttachment(attachment);    //将附件添加到周报种去
        log_2 = log_1.clone();    //克隆周报
        System.out.println("周报是否相同" + (log_1 == log_2));
        System.out.println("附件是否相同" + (log_1.getAttachment() == log_2.getAttachment()));
    }
}
