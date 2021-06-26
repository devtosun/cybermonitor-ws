package com.cybermonitor.service;

import java.util.List;
import java.util.Optional;

import com.cybermonitor.dao.ArticleDao;
import com.cybermonitor.repository.ArticleRepository;

import org.springframework.stereotype.Service;


@Service
public class ArticleService {

    public final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public ArticleDao getArticle(Long articleId){
        Optional<ArticleDao> articleDao = articleRepository.findById(articleId);
        return articleDao.get();
    }

    public List<ArticleDao> findAll(){
        return articleRepository.findAll();
    }

    public void saveArticle(ArticleDao articleDao){
        var hehe = articleRepository.save(articleDao);
        System.out.println(hehe.username);
    }

    
}
