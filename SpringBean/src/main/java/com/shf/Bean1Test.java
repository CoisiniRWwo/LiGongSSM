package com.shf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 10 44
 * @Project:LiGongSSM
 */
public class Bean1Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object bean1 = context.getBean("bean1");
        System.out.println(bean1);
    }
}
