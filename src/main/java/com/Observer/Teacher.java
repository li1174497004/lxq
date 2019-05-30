package com.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @program: lxq
 * @description: 老师类
 * @author: Mr.lxq
 * @create: 2019-05-29 18:00
 **/

public class Teacher implements Observer{
    List<Student> list = new ArrayList<Student>();
    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            Student next = (Student)listIterator.next();
            if (next.getName().equals(student.getName())){
                listIterator.remove();
            }
        }
    }

    @Override
    public void notifyMsg(String msg) {
        for (Student s:list) {
             s.notifyme();
        }
    }
}
