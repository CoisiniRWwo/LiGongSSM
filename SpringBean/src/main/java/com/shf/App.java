package com.shf;

import com.shf.service.Impl.OrderServiceImpl;
import com.shf.service.OrderService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 10 27
 * @Project:LiGongSSM
 */
public class App {
    public static void main(String[] args) {
        BeanFactory xmlBeanFactory = new XmlBeanFactory(new FileSystemResource("D:\\Study\\SHFWorkSpace\\LiGongSSM\\SPringBean\\src\\main\\resources\\applicationContext.xml"));
//        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) xmlBeanFactory.getBean("OrderServiceImpl");
//        OrderService bean = xmlBeanFactory.getBean(OrderServiceImpl.class);
//        System.out.println(bean);

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Object bean1 = context.getBean("bean1");
//        Object bean2 = context.getBean("bean2");
//        System.out.println(bean1);
//        System.out.println(bean2);

    }
}
