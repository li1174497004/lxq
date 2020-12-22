package com.designpattern.SingletonDesignPattern.PatternThree;

/**
 * @Author: lxq
 * @Date: 2020/12/22 16:01
 * 双重锁校验机制
 * 优点：
 *     1.解决了懒汉式程序开始运行就创建对象。
 *     1.解决了懒汉式频繁访问锁导致的效率低下问题。
 */
public class Logger {

    //这里初始化不会创建。
    //此处volatile关键字，是为了保证底层代码指令重排引起的单例异常，
    //在最新的java中底层已经对此进行处理，因此不再需要volatile关键字。此处需要注意。
    private static volatile Logger logger;

    //私有的构造方法是为了防止该对象被new出来。
    private Logger() {
    }

    public static Logger getInstence() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
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
