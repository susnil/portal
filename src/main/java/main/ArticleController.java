package main;

import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class ArticleController {
    @Autowired
    private  ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> getAllArticles(){
        return articleService.getAllArticles();
}
    @RequestMapping("/article/{id}")
    public Article getAllArticles(@PathVariable String id){
        return articleService.getArticle(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/articles")
    public void addArticle(@RequestBody Article article){
        articleService.addArticle(article);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/article/{id}")
    public void updateArticle(@RequestBody Article article, @PathVariable String id){
        articleService.updateArticle(article,id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteArticle/{id}")
    public void deleteArticles(@PathVariable String id){
        articleService.deleteArticle(id);
    }
}
