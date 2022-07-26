package com.example.springdata_elastic.service;

import com.example.springdata_elastic.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IArticleService {

    Article save(Article newArticle);

    Article findById(Integer id);

    String deleteById(int id);

    List<Article> findAll();

    Article update(Article article);

    Page<Article> getPageByTitle(String title, Pageable pg);
}
