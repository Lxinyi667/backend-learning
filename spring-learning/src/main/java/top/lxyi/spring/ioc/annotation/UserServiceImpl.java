package top.lxyi.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
//使用@Service注解
// <bean id="userService" class="top.mqxu.spring.ioc.annotation.UserServiceImpl" />；
public class UserServiceImpl implements UserService {
    //@Autowired 注解 相当于
    //<property name="userDao" ref="userDao"/>
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        //调用userDao中的save方法
        this.userDao.save();
        System.out.println("userService...save...");
    }
}
