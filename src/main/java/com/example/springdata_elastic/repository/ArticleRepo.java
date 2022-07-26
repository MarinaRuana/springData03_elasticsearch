package com.example.springdata_elastic.repository;

import com.example.springdata_elastic.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends ElasticsearchRepository<Article, Integer> {
}
