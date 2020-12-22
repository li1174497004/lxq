package com.designpattern.SingletonDesignPattern.PatternFive;

/**
 * @Author: lxq
 * @Date: 2020/12/22 16:01
 * 枚举模式
 * 优点：
 *     1.最简单的单例模式。
 */
public enum Logger {
      INSTANCE;
     public void doSomeThing(){
     }
    public static void main(String[] args) {
        //证明获取的是同一个对象。
        System.out.println(Logger.INSTANCE);
        System.out.println(Logger.INSTANCE);
    }
}
