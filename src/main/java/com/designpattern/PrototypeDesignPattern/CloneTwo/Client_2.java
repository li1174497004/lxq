package com.designpattern.PrototypeDesignPattern.CloneTwo;

/**
 * @Author: lxq
 * @Date: 2020/12/24 15:18
 */
public class Client_2 {
    //测试类，客户端
    public static void main(String[] args) {
        WeeklyLog_2 log_1,log_2=null;
        log_1 = new WeeklyLog_2();	//创建原型对象
        Attachment_2 attachment = new Attachment_2(); //创建附件对象
        log_1.setAttachment(attachment);	//将附件添加到周报种去
        try {
            log_2=log_1.deepclone();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }	//克隆周报
        System.out.println("周报对象是否相同"+(log_1==log_2));
        System.out.println("附件对象是否相同"+(log_1.getAttachment()==log_2.getAttachment()));
    }
}
