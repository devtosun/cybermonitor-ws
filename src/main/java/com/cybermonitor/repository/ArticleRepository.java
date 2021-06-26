package com.cybermonitor.repository;

import com.cybermonitor.dao.ArticleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleDao, Long> {

    
    
}
