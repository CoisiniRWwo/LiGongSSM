package com.shf.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Su HangFei
 * @Date:2023-05-18 11 12
 * @Project:LiGongSSM
 */
public class AccountDaoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        AccountDao jdbcTemplate = (AccountDao) context.getBean("accountDao");

//        Account account = new Account();
//        account.setUsername("tom");
//        account.setBalance(1000.0);
//
//        int i = jdbcTemplate.addAccount(account);
//        if (i>0){
//            System.out.println("插入成功");
//        }else{
//            System.out.println("插入失败");
//        }

        Account accountById = jdbcTemplate.findAccountById(1);
        System.out.println(accountById);
    }
}
