package com.shf.spring.service.Impl;

import com.shf.spring.dao.UserDao;
import com.shf.spring.service.UserService;

/**
 * @Author:Su HangFei
 * @Date:2023-04-20 10 48
 * @Project:LiGongSSM
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean login(String username, String password) {
        return userDao.login(username,password);
    }
}
