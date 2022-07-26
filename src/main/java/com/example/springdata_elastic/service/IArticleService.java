package com.example.springdata_elastic.service;

import com.example.springdata_elastic.model.Article;

public interface IArticleService {

    Article save(Article newArticle);

    Article findById(Integer id);
}
