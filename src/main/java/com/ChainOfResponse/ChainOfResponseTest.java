package com.ChainOfResponse;

/**
 * @program: lxq
 * @description: 测试责任链模式
 * @author: Mr.lxq
 * @create: 2019-05-29 14:01
 **/

public class ChainOfResponseTest {
    public static void main(String[] args) {


        Support alice   = new NoSupport("Alice");
        Support bob     = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana   = new LimitSupport("Diana", 200);
        Support elmo    = new OddSupport("Elmo");
        Support fred    = new LimitSupport("Fred", 300);

        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        for(int i=0;i<5000000;i++) {
            
            alice.support(new Trouble(i+"",i));
        }
    }
}
