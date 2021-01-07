package com.designpattern.TemplateMethodDesignPatern.CallBack;

/**
 * @Author: lxq
 * @Date: 2021/1/5 16:14
 */
public class BClass {
 public void process(ICallBack callBack){
     callBack.methodToCallBack();
 }
}
