package com.Observer;

/**
 * @program: lxq
 * @description: 测试
 * @author: Mr.lxq
 * @create: 2019-05-29 18:31
 **/

public class ObserverTest {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Student student = new Student("一号");
        Student student2 = new Student("二号");
        Student student3 = new Student("三号");
        Student student4 = new Student("四号");
        Student student5 = new Student("五号");

        teacher.add(student);
        teacher.add(student2);
        teacher.add(student3);
        teacher.add(student4);
        teacher.add(student5);


        teacher.notifyMsg("哈哈哈啊哈和");
    }

}
