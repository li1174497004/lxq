package com.Observer;

public interface Observer {
    void add (Student student);
    void remove(Student student);
    void notifyMsg(String msg);
}
