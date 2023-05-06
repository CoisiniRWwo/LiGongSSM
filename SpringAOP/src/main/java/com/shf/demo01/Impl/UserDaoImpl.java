package com.shf.demo01.Impl;

import com.shf.demo01.UserDao;

/**
 * @Author:Su HangFei
 * @Date:2023-05-04 10 21
 * @Project:LiGongSSM
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存用户信息");
    }

    @Override
    public void deleteuser() {
        System.out.println("删除用户信息");
    }
}
