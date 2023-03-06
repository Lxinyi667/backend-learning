package top.lxyi.spring.ioc;

public class UserDaoImpl implements UserDao{
    @Override
    public void say() {
        System.out.println("userDao say Hello World!");
    }
}
