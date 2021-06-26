package com.cybermonitor.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long articleId;

    public String username;
    public String header;
    public String text;
    public String pictureLink;

}
