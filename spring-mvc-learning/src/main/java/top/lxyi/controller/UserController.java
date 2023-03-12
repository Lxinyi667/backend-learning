package top.lxyi.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.lxyi.entity.User;

@Controller
public class UserController {
    //    @RequestMapping注解可以用指定的URL路径访问本控制层
//    @RequestMapping("/User")
//    public String selectUser(HttpServletRequest request) {
//        String id = request.getParameter(  "id " );
//        System .out.println("id=" + id);
//        return "success";
//    }
    //    @RequestMapping注解可以用指定的URL路径访问本控制层
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    //    @RequestMapping("/LoginUser")
    public String loginUser(User user) {
        Integer id = user.getId();
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println("id=" + id);
        System.out.println("username=" + username);
        System.out.println("password" + password);
        return "success";
    }

    @RequestMapping("/LoginUser")

    public ModelAndView User(User user) throws Exception {

        ModelAndView mav = new ModelAndView();
        String username = user.getUsername();
        String password = user.getPassword();
        if (!"".equals(username) && !"".equals(password)) {
            mav.addObject("username", username);
            mav.addObject("password", password);
            mav.setViewName("success");
        } else {
            mav.addObject("message", "用户名或密码错误");
            mav.setViewName("login");
        }
        return mav;
    }

}
