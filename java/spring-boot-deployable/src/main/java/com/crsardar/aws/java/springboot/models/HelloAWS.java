package com.crsardar.aws.java.springboot.models;

import java.util.Date;

/**
 * @author Chittaranjan Sardar
 * www.crsardar.com
 * @date 10/11/20 6:31 am
 */

public class HelloAWS {

    private String msg;

    private Date date;

    private final String developer = "Mr. Chittaranjan Sardar";

    public HelloAWS() {
    }

    public HelloAWS(String msg) {
        this.msg = msg;
        date = new Date();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDeveloper() {
        return developer;
    }
}
