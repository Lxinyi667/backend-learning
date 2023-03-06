package top.lxyi.spring.ioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SetterDITest {
    public static void main(String[] args) {
        String xmlPath ="/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) ac.getBean("userService");
        userService.say();
        String msg = (String) ac.getBean("msg");
        msg.toString();
    }
}
