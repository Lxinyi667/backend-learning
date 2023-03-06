package top.lxyi.spring.ioc.instance.factory;

public class MyBean3Factory {
//    实例工厂方式实例化
    public MyBean3Factory(){
        System.out.println("Bean3工厂实例化中");
    }
    public Bean3 createBean(){
        return new Bean3();
    }
}
