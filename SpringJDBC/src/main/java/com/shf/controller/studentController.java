package com.shf.controller;

import com.shf.dao.StudentDao;
import com.shf.demo01.AccountDao;
import com.shf.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @Author:Su HangFei
 * @Date:2023-05-19 10 35
 * @Project:LiGongSSM
 */
public class studentController {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        StudentDao jdbcTemplate = (StudentDao) context.getBean("studentDao");

        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入"+username+"的密码：");
        String password = scanner.nextLine();
        Student studentByUsername = jdbcTemplate.findStudentByUsername(username, password);
        if (studentByUsername ==null){
            System.out.println("用户邓丽失败，用户名或者密码错误");
        }else {
            System.out.println("用户登录成功");
            System.out.println(username+"是"+ studentByUsername.getCourse()+"班的");
        }
    }
}
