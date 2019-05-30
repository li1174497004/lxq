package com.java8;

public class morenfangfa {
    public static void main(String args[]) {
        Younger younger = new Student();
        younger.print();
    }
}

interface Younger {
    default void print() {
        System.out.println("I am a younger.");
    }

    static void sayHi() {
        System.out.println("Young is the capital.");
    }
}

interface Learner {
    default void print() {
        System.out.println("I am a learner.");
    }
}

class Student implements Younger, Learner {
    @Override
    public void print() {
        Younger.super.print();
        Learner.super.print();
        Younger.sayHi();
        System.out.println("I am a student!");
    }
}
