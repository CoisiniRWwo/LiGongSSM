package com.shf.demo02;

import com.shf.demo01.MyAspact;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author:Su HangFei
 * @Date:2023-05-04 10 35
 * @Project:LiGongSSM
 */
public class MyCglibProxy implements MethodInterceptor {

    public Object createProxy(Object o){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(o.getClass());

        enhancer.setCallback(this);

        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        MyAspact myAspact = new MyAspact();
        myAspact.check_permission();

        Object invoke = methodProxy.invokeSuper(o, objects);

        myAspact.log();

        return invoke;
    }
}
