package top.lxyi.spring.ioc.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
    public static void main(String[] args) {
        //构造器实例化
            //首先定义了配置文件的路径，然后Spring容器ApplicationContext会加载配置文件。
            //在加载时，Spring容器会通过id为bean1的实现类Bean1中默认的无参构造方法对Bean进行实例化
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans1.xml");
        Bean1 bean1 = context.getBean("bean1",Bean1.class);
        System.out.println(bean1);
    }
}
