package com.shf.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 11 48
 * @Project:LiGongSSM
 */
@Component("student")
public class Student {
    @Value("11")
    private int id;

    @PostConstruct
    public void init(){
        System.out.println("初始化要调用的方法：init");
    }

    @PostConstruct
    public void destory(){
        System.out.println("销毁时要调用的方法：destory");
    }
}
