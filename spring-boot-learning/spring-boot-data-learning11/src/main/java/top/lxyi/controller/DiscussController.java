package top.lxyi.controller;

import jakarta.annotation.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lxyi.domain.Discuss;
import top.lxyi.repository.DiscussRepository;

import java.util.List;

@Controller
public class DiscussController {
    @Resource
    private DiscussRepository discussRepository;
    @GetMapping("/discuss22")
    @ResponseBody
    public List<Discuss> getList(@RequestParam(name = "pageSize",defaultValue = "2") Integer pageSize,
                                 @RequestParam(name = "pageNum",defaultValue = "0") Integer pageNum){
        Pageable pageable = PageRequest.of(pageNum,pageSize);
        return discussRepository.getDiscussesByPage(1,pageable);
    }

    @GetMapping("/discuss")
     public String getDiscuss(ModelMap map){
         Pageable pageable = PageRequest.of(0,2);
        List<Discuss> list = discussRepository.getDiscussesByPage(1,pageable);
        map.put("discussList",list);
        map.put("title","hello world");
         return "index.html";
     }
}
