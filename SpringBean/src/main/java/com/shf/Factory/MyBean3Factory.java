package com.shf.Factory;

import com.shf.bean.bean3;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 11 04
 * @Project:LiGongSSM
 */
public class MyBean3Factory {
    public MyBean3Factory() {
        System.out.println("实例化工厂的构造方法");
    }
    public bean3 createBean(){
        return new bean3();
    }
}
