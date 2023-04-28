package com.shf;

import com.shf.controller.UserController;
import com.shf.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 11 35
 * @Project:LiGongSSM
 */
public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        UserController userController = (UserController) context.getBean("userController");
//        userController.save();
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        AbstractApplicationContext ac = (AbstractApplicationContext) context;
        ac.registerShutdownHook();
    }
}
