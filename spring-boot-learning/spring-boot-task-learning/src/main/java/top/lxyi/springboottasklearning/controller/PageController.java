package top.lxyi.springboottasklearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 获取验证码图片
 * @return
 */

@Controller
public class PageController {
        @GetMapping("index")
        public String getIndex() {
            return "index";
        }
}