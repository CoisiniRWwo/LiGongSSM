package com.shf.demo03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author:Su HangFei
 * @Date:2023-05-04 10 47
 * @Project:LiGongSSM
 */
public class XmlAdvice {

    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知");
        System.out.println("目标类：" + joinPoint.getTarget());
        System.out.println("切入点方法：" + joinPoint.getSignature().getName());
    }

    public void after(JoinPoint joinPoint) {
        System.out.println("后置通知");
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("自定义环绕通知在，在切入点之前执行");
        Object res = null;
        try {
            res = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("自定义环绕通知在，在切入点之后执行");
        return res;
    }

    public void after_returning(){
        System.out.println("返回通知，返回值结束才会执行(如果出现异常，不会执行)");
    }

    public void after_throwing(){
        System.out.println("异常通知，（出现异常，才会通知）");
    }
}
