package com.designpattern.BuilderDesignPattern;

/**
 * @Author: lxq
 * @Date: 2020/12/24 10:14
 */
public class BuilderDesignPatternTest {

    public static void main(String[] args) throws Exception {
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("资源池子。。。。")
                .setMaxIdle(100)
                .setMinIdle(10)
                .setMaxTotal(40)
                .builder();
    }

}
