package com.designpattern.SingletonDesignPattern.PatternTwo;

/**
 * @Author: lxq
 * @Date: 2020/12/22 16:01
 * 懒汉式
 * 优点：
 *     1.延迟加载。
 *缺点：
 *     1.性能低下,因为会一直用到锁操作
 */
public class Logger {

    //这里初始化不会创建。
    public static Logger logger = null;

    //私有的构造方法是为了防止该对象被new出来。
    private Logger() {
    }

    //这里为例实现单例，使用了方法锁。
    public static synchronized Logger getInstence() {

        if (logger == null) {
            logger = new Logger();
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
