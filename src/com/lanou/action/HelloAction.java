package com.lanou.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by dllo on 17/10/23.
 */
public class HelloAction extends ActionSupport{

    public String hello(){
        System.out.println("hello方法被调用");
        return SUCCESS;
    }

    public String login(){
        return SUCCESS;
    }

    public String register(){
        return SUCCESS;
    }

    public String error(){
        return SUCCESS;
    }

    //该方法会先于action执行
    @Override
    public void validate() {
        super.validate();
    }
}
