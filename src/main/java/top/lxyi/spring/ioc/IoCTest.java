package top.lxyi.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试IoC
 */
public class IoCTest {
//    手撕，如何获取Spring 容器
    public static void main(String[] args) {
        //读出容器中的bean
            //1.配置文件路径
        String xmlPath = "/applicationContext.xml";
            //2.(创建Spring容器)
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
            //3.从配置文件中读取配置好的Bean
        UserDao userDao=(UserDao) ac.getBean("userDao");
        userDao.say();
    }
}
