package top.lxyi.spring.ioc.annotation;

import org.springframework.stereotype.Repository;

/**
 * UserDao的实现类，该类需要实现接口中的save()方法
 */
@Repository("userDao")
//相当于在.xml文件中配置的
//<bean id="userDao" class="top.mqxu.spring.ioc.annotation.UserDaoImpl"/>
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao...save...");
    }
}
