package com.example.springdata_elastic.service;

import com.example.springdata_elastic.model.Article;

import java.util.List;

public interface IArticleService {

    Article save(Article newArticle);

    Article findById(Integer id);

    String deleteById(int id);

    List<Article> findAll();
}
