package com.designpattern.SingletonDesignPattern.ErrorPatternSix;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: lxq
 * @Date: 2021/3/12 10:43
 */
public class Logger {


    private String log;
    private Logger(String log){
        this.log = log;
    }

    public static Logger forClass(String  log) {
        return new Logger(log);
    }


    public static void main(String[] args) throws ParseException {

        System.out.println(new Date());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d = simpleDateFormat.parse("2011-12-12 12:12:12");

        System.out.println(d.toString());

    }


}
