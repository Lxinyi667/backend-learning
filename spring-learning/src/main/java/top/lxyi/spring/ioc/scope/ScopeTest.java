package top.lxyi.spring.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
       //声明周期
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans4.xml");
        System.out.println(context.getBean("scope"));
        System.out.println(context.getBean("scope"));
    }
}
