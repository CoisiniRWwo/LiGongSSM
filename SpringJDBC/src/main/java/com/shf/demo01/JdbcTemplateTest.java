package com.shf.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author:Su HangFei
 * @Date:2023-05-18 10 55
 * @Project:LiGongSSM
 */
public class JdbcTemplateTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        jdbcTemplate.execute("create table test (id int,username varchar(255))");

        System.out.println("表创建成功");

    }
}
