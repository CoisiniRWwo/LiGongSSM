package com.shf.dao.Impl;

import com.shf.dao.UserDao;
import com.shf.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 11 25
 * @Project:LiGongSSM
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user");
        System.out.println(user);
        System.out.println("调用了userDao的save方法。。。");
    }
}
