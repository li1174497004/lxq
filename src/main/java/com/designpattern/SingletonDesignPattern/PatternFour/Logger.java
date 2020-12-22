package com.designpattern.SingletonDesignPattern.PatternFour;

/**
 * @Author: lxq
 * @Date: 2020/12/22 16:01
 * 静态内部类
 * 优点：
 *     1.该模式能兼顾效率和内存问题。是双重锁校验模式的进化
 *     2.Logger 的唯一性和线程安全性，由JVM保证
 */
public class Logger {

    //私有的构造方法是为了防止该对象被new出来。
    private Logger() {
    }

    public Logger getInstence(){
        return SingletonHolder.logger;
    }

   public static class SingletonHolder{
        public static final Logger logger = new Logger();
    }
    public void doSomeThing() {
        // 这里是该类需要执行的方法。。。。。。
    }

    public static void main(String[] args) {
        //证明获取的是同一个对象。
        System.out.println(new Logger().getInstence());
        System.out.println(new Logger().getInstence());
    }
}
