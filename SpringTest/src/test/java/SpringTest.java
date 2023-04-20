import com.shf.spring.pojo.HelloSpring;
import com.shf.spring.pojo.User;
import com.shf.spring.pojo.User2;
import com.shf.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Su HangFei
 * @Date:2023-04-20 10 26
 * @Project:LiGongSSM
 */
public class SpringTest {
    @Test
    public void testHelloSpring(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean
        HelloSpring helloworld = (HelloSpring)ioc.getBean("hellospring");
        helloworld.sayHello();
    }

    @Test
    public void testSpringUser(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean
        User user = (User)ioc.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testSpringUser2(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean
        User2 user2 = (User2)ioc.getBean("user2");
        System.out.println(user2);
    }

    @Test
    public void testSpringLogin(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean
        UserService userservice = (UserService) ioc.getBean("userservice");
        boolean result = userservice.login("苏航飞", "2212114628");
        if (result){
            System.out.println("登录成功");
        }else {
            System.out.println("登陆失败");
        }
    }
}
