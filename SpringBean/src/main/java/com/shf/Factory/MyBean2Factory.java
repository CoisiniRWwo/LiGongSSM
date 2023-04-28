package com.shf.Factory;

import com.shf.bean.bean2;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 10 46
 * @Project:LiGongSSM
 */
public class MyBean2Factory {
    public static bean2 createBean(){
        System.out.println("工厂的静态方法");
        return new bean2();
    }
}
