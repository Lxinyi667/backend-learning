package top.lxyi.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/beans6.xml");
        UserController userController = (UserController) context.getBean("userController");
        userController.save();
    }
}
