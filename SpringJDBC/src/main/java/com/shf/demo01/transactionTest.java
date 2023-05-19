package com.shf.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Su HangFei
 * @Date:2023-05-18 11 28
 * @Project:LiGongSSM
 */
public class transactionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        AccountDao jdbcTemplate = (AccountDao) context.getBean("accountDao");
        jdbcTemplate.transfer("lisi","zhangsan",100.0);
    }
}
