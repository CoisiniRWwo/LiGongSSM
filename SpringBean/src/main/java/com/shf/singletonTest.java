package com.shf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 11 16
 * @Project:LiGongSSM
 */
public class singletonTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object bean1 = context.getBean("bean1");
        Object bean2 = context.getBean("bean1");
        System.out.println(bean2==bean1);
    }
}
