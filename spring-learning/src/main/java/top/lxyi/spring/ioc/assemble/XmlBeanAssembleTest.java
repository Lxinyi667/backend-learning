package top.lxyi.spring.ioc.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans5.xml");
        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
    }
}
