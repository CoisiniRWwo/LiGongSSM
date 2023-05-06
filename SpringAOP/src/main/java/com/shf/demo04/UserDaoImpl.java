package com.shf.demo04;

/**
 * @Author:Su HangFei
 * @Date:2023-05-04 10 46
 * @Project:LiGongSSM
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存用户信息");
//        int i = 1/0;
    }

    @Override
    public void delete() {
        System.out.println("删除用户信息");
    }

    @Override
    public void findById() {
        System.out.println("根据id查询用户信息");
    }

    @Override
    public void update() {
        System.out.println("更新用户信息");
    }
}
