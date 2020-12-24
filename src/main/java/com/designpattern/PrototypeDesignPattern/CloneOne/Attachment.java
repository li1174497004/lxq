package com.designpattern.PrototypeDesignPattern.CloneOne;

/**
 * @Author: lxq
 * @Date: 2020/12/24 15:06
 *
 * 该类为附件类
 */
public class Attachment {

    private String name;    //附件名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件" + name);
    }

}
