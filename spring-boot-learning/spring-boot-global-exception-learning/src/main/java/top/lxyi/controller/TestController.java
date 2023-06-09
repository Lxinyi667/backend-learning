package top.lxyi.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import top.lxyi.auth.CheckAuth;
import top.lxyi.domain.Ariticle;
import top.lxyi.service.ExceptionService;
import top.lxyi.util.AjaxResponse;

@RestController
@RequestMapping(value = "api")
public class TestController {
    @Resource
    private ExceptionService exceptionService;

    @GetMapping("/ariticles/{id}")
    @CheckAuth(value = "Admin123")
    public AjaxResponse getArticle(@PathVariable int id) {
        return AjaxResponse.success(exceptionService.getArticle(id));
    }

    @PostMapping("/ariticles")
    public AjaxResponse saveArticle(@Valid @RequestBody Ariticle ariticle) {
        return AjaxResponse.success(ariticle);
    }
}
