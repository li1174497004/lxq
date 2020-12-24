package com.designpattern.PrototypeDesignPattern.CloneTwo;

import java.io.Serializable;

/**
 * @Author: lxq
 * @Date: 2020/12/24 15:16
 */
public class Attachment_2 implements Serializable {

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
