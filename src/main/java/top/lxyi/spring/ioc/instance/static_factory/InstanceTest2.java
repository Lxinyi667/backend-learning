package top.lxyi.spring.ioc.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {
    //静态工厂方法实例化
    //Bean配置中的class属性所指定的不再是Bean实例的实现类，
    // 而是静态工厂类，同时还需要使用factory-method属性来指定所创建的静态工厂方法。
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:beans2.xml");
        Bean2 bean2 = context.getBean("bean2", Bean2.class);
        System.out.println(bean2);
    }
}
