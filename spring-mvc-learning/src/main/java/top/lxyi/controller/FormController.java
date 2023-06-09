package top.lxyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.lxyi.entity.Form;

import java.util.List;

@Controller
public class FormController {
//    @PostMapping("/apply")
//    @ResponseBody
//    public String apply(@RequestParam(value = "name",defaultValue = "ANON")String name, String course, @RequestParam List<Integer> purpose){
//        System.out.println(name);
//        System.out.println(course);
//        for (Integer p : purpose){
//            System.out.println(p);
//        }
//        return "success2";
//    }
    @RequestMapping("/toForm")
    public String toForm(){
        return "inquiry";
    }
    @RequestMapping("/FormList")
    public ModelAndView Form(@RequestParam(value = "name",defaultValue = "ANON")String name, String course, @RequestParam List<String> purpose) throws Exception {
        ModelAndView mav = new ModelAndView();
//        Form form=new Form();
//        String name = form.getName();
//        String course = form.getCourse();
//        List<String> purpose = form.getPurpose();
        for (String p : purpose){
            System.out.println(p);
        }
        if (!"".equals(name) && !"".equals(course)){
            mav.addObject("name",name);
            mav.addObject("course",course);
            mav.addObject("purpose",purpose);
            mav.setViewName("success1");
        }
        return mav;
    }

}
