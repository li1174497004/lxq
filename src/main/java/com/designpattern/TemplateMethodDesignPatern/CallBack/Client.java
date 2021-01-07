package com.designpattern.TemplateMethodDesignPatern.CallBack;

/**
 * @Author: lxq
 * @Date: 2021/1/5 16:15
 */
public class Client {

    public static void main(String[] args) {

       BClass bClass = new BClass();
       bClass.process(new ICallBack() {
           @Override
           public void methodToCallBack() {
               System.out.println(".....");
           }
       });
    }
}
