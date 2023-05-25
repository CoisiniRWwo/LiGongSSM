package com.shf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:Su HangFei
 * @Date:2023-05-25 10 25
 * @Project:LiGongSSM
 */
@Controller
public class FirstController {
    @RequestMapping("/firstController")
    public String sayHello(){
        System.out.println("访问的第一个controller");
        return  "success";
    }
}

