package com.cybermonitor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.cybermonitor.dao.ArticleDao;
import com.cybermonitor.service.ArticleService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/article")
public class ArticleController {
    
    public final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping(value = "/{articleId}")
    public ArticleDao getArticle(@PathVariable Long articleId) {
        return articleService.getArticle(articleId);
    }

    @GetMapping(value = "/all")
    public List<ArticleDao> findAll(){
        return articleService.findAll();    
    }

    @PostMapping("/save")
    public ArticleDao postMethodName(@RequestBody ArticleDao articleDao) {
        articleService.saveArticle(articleDao);
        return articleDao;
    }
    
    
}


//@GetMapping(value = "/{articleId}")     localhost/1
//public ArticleDao getArticle(@PathVariable Long articleId) {
//    return articleService.getArticle(articleId);
//}
//
//@PostMapping("/save")         localhost/save?id&=1
//public ArticleDao postMethodName(@RequestBody ArticleDao articleDao) {
//    articleService.saveArticle(articleDao);
//    return articleDao;
//}