package com.shf.demo04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Su HangFei
 * @Date:2023-05-04 10 52
 * @Project:LiGongSSM
 */
public class AnnoAopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao2 = (UserDao) context.getBean("userDao2");

        userDao2.save();
        System.out.println();
        userDao2.findById();
        System.out.println();
        userDao2.delete();
        System.out.println();
        userDao2.update();
    }
}
