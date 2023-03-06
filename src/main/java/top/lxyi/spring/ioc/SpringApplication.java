package top.lxyi.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lxyi.spring.ioc.entity.*;

public class SpringApplication {
    public static void main(String[] args) {
        String xmlPath ="/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        SpringApplication.animalBean(context);
        SpringApplication.bookBean(context);
        SpringApplication.clothBean(context);
        SpringApplication.schoolBagBean(context);
    }
    private static void animalBean(ApplicationContext context){
        Cat cat = context.getBean("cat", Cat.class);
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(cat);
        System.out.println(dog);
    }
    private static void bookBean(ApplicationContext context){
        Book book1=context.getBean("book1",Book.class);
        Book book2=context.getBean("book2",Book.class);
        System.out.println("book对象通过默认构造方法"+book1);
        System.out.println("book对象通过有参构造方法"+book2);
    }
    private static void clothBean(ApplicationContext context){
        Person girl =context.getBean("girl", Person.class);
        Person boy =context.getBean("boy",Person.class);
        System.out.println(girl.dress());
        System.out.println(boy.dress());
    }
    private static void schoolBagBean(ApplicationContext context){
        SchoolBag schoolBag =context.getBean("schoolBag",SchoolBag.class);
        System.out.println(schoolBag.getColor());
        System.out.println(schoolBag.getPencilCase());
        System.out.println(schoolBag);
    }
}
