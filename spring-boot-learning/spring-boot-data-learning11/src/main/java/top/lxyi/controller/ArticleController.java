package top.lxyi.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.lxyi.domain.Article;
import top.lxyi.domain.Discuss;
import top.lxyi.repository.ArticleRepository;
import top.lxyi.repository.DiscussRepository;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class ArticleController {
    private final ArticleRepository articleRepository;
    private final DiscussRepository discussRepository;
    @GetMapping("Article")
    public String indexPage(ModelMap map){
        map.put("articleList",articleRepository.findAll());
        return "index";
    }
    @GetMapping("detail")
    public String articleDetail(@RequestParam(value = "id",required = false) Integer id,ModelMap map){
        Optional<Article> articleOptional = articleRepository.findById(id);
        Optional<Discuss> byId = discussRepository.findById(id);
        articleOptional.ifPresent(article -> map.put("article",article));
        byId.ifPresent(discuss -> map.put("discussList",discuss));
        return "detail";
    }
}