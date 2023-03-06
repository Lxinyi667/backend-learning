package top.lxyi.spring.ioc;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    private String msg="test";


    public UserServiceImpl(String msg) {
        this.msg = msg;
    }
    public UserServiceImpl(){

    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public String toString() {
        return msg+"String ";
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("userService say Hello World!");
    }


}
