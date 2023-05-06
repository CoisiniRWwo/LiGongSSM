package com.shf.demo01;

import com.shf.demo01.Impl.UserDaoImpl;

/**
 * @Author:Su HangFei
 * @Date:2023-05-04 10 29
 * @Project:LiGongSSM
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        MyProxy myProxy = new MyProxy();
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao proxy = (UserDao) myProxy.createProxy(userDao);

        proxy.saveUser();
        proxy.deleteuser();
    }
}
