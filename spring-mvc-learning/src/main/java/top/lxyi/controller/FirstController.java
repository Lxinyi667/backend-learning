package top.lxyi.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller {
    //implements Controller 加mvc的

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //创建模型视图对象
        ModelAndView mav =new ModelAndView();
        //向模型中添加数据
        mav.addObject("msg","我的第一个Spring MVC 程序");
        mav.addObject("msd","My First Spring MVC Application");
        //设置视图名称
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        return mav;
    }


}
