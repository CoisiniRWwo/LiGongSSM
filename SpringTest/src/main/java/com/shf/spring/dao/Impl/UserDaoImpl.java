package com.shf.spring.dao.Impl;

import com.shf.spring.dao.UserDao;

/**
 * @Author:Su HangFei
 * @Date:2023-04-20 10 45
 * @Project:LiGongSSM
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String username, String password) {
        if (username.equals("苏航飞")&&password.equals("2212114628")){
            return true;
        }else{
            return false;
        }
    }
}
