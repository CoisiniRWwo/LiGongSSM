package com.shf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 11 11
 * @Project:LiGongSSM
 */
public class Bean3Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object bean2 = context.getBean("bean3");
        System.out.println(bean2);
    }
}
