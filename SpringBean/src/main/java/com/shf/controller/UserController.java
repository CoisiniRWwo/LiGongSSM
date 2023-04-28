package com.shf.controller;

import com.shf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 11 32
 * @Project:LiGongSSM
 */
@Controller("userController")
public class UserController {

//    @Resource(name = "userService")
    @Autowired
    private UserService userService;

    public void save(){
        userService.save();
        System.out.println("调用了UserController的save方法。。");
    }
}
