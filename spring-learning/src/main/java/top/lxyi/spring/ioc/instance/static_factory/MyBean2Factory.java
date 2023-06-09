package top.lxyi.spring.ioc.instance.static_factory;

public class MyBean2Factory {
    //通过MyBean2Factory类的静态方法createBean（）方法才能调用到Bean2
    public static Bean2 createBean(){
        return new Bean2();
    }
}
