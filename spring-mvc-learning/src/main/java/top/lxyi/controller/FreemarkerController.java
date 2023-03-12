package top.lxyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.lxyi.entity.SpringEntity;

import java.util.ArrayList;

@Controller
@RequestMapping("/ftl")
public class FreemarkerController {
    @GetMapping("/test1")
    public ModelAndView showTest(){
        ModelAndView mav= new ModelAndView("/test");
//        mav.setViewName();
//        User user = new User();
//        user.setUsername("andy");
//        mav.addObject("u",user);
        ArrayList<SpringEntity> list = new ArrayList<>();
        SpringEntity s1 = SpringEntity.builder().imgUrl("https://spring.io/img/icons/microservices.svg")
                .content("Quickly deliver production‑grade features with independently evolvable microservices.")
                .title("Microservices").build();
        SpringEntity s2 = SpringEntity.builder().imgUrl("https://spring.io/img/icons/reactive.svg")
                .content("Spring's asynchronous, nonblocking architecture means you can get more from your computing resources.")
                .title("Reactive").build();
        SpringEntity s3 = SpringEntity.builder().imgUrl("https://spring.io/img/icons/cloud.svg")
                .content("Your code, any cloud—we’ve got you covered. Connect and scale your services, whatever your platform.")
                .title("Cloud").build();
        SpringEntity s4 = SpringEntity.builder().imgUrl("https://spring.io/img/icons/web-apps.svg")
                .content("Frameworks for fast, secure, and responsive web applications connected to any data store.")
                .title("Web apps").build();
        SpringEntity s5 = SpringEntity.builder().imgUrl("https://spring.io/img/icons/serverless.svg")
                .content("The ultimate flexibility. Scale up on demand and scale to zero when there’s no demand.")
                .title("Serverless").build();
        SpringEntity s6 = SpringEntity.builder().imgUrl("https://spring.io/img/icons/event-driven.svg")
                .content("Integrate with your enterprise. React to business events. Act on your streaming data in realtime.")
                .title("Event Driven").build();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        mav.addObject("list",list);

        return mav;
    }

}
