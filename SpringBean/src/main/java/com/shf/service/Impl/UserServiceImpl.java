package com.shf.service.Impl;

import com.shf.dao.UserDao;
import com.shf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 11 28
 * @Project:LiGongSSM
 */
@Service("userService")
public class UserServiceImpl implements UserService {

//    @Resource(name = "userDao")
    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
        System.out.println("调用了UserService的save方法");
    }
}
