package com.shf.demo02;

/**
 * @Author:Su HangFei
 * @Date:2023-05-04 10 39
 * @Project:LiGongSSM
 */
public class CglibTest {
    public static void main(String[] args) {
        MyCglibProxy myCglibProxy = new MyCglibProxy();

        UserDao2 userDao2 = new UserDao2();

        UserDao2 proxy = (UserDao2) myCglibProxy.createProxy(userDao2);

        proxy.saveUser();
        proxy.deleteuser();
    }
}
