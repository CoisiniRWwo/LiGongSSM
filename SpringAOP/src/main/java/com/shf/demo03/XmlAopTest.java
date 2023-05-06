package com.shf.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Su HangFei
 * @Date:2023-05-04 10 52
 * @Project:LiGongSSM
 */
public class XmlAopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");

        userDao.save();
        System.out.println();
        userDao.findById();
        System.out.println();
        userDao.delete();
        System.out.println();
        userDao.update();
    }
}
