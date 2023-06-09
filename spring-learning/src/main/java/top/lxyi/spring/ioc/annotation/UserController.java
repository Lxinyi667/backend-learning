package top.lxyi.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;
    public void save(){
        this.userService.save();
        System.out.println("userController...save...");
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
