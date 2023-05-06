package com.shf.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:Su HangFei
 * @Date:2023-05-04 10 24
 * @Project:LiGongSSM
 */
public class MyProxy implements InvocationHandler {
    private UserDao userDao;

    public Object createProxy(UserDao userDao){
        this.userDao = userDao;
        ClassLoader classLoader = MyProxy.class.getClassLoader();
        Class<?>[] interfaces = userDao.getClass().getInterfaces();
        Object o = Proxy.newProxyInstance(classLoader, interfaces, this);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //创建增强类对象
        MyAspact myAspact = new MyAspact();
        myAspact.check_permission();

        //保证原有功能的执行
        Object invoke = method.invoke(userDao, args);

        //日志增强
        myAspact.log();

        return invoke;
    }
}
