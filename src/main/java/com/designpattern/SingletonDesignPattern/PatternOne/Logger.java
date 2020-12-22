package com.designpattern.SingletonDesignPattern.PatternOne;

/**
 * @Author: lxq
 * @Date: 2020/12/22 16:01
 * 恶汉式
 * 优点：
 *     1.代码简单。
 *     2.不需要使用锁。
 *缺点：
 *     1.代码启动就会加载资源，如果对于资源消耗比较大的初始化操作可能存在问题。
 *     但是也有观点认为，消耗资源较大的操作是需要初始化的。
 */
public class Logger {

    //类初始化就会建立的，直接占用资源
    public static final Logger logger = new Logger();

    //私有的构造方法是为了防止该对象被new出来。
    private Logger() {
    }

    public Logger getInstence() {
        return logger;
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
