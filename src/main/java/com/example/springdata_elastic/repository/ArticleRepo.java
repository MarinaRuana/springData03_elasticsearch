package com.example.springdata_elastic.repository;

import com.example.springdata_elastic.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepo extends ElasticsearchRepository<Article, Integer> {

    @Query("{\"match_all\": {} }")
    List<Article> findAllArticle(); // Para não precisar de conversão de Iterable para List

    @Query("{\"match\": {\"title\": {\"query\": \"?0\"}}}")
    Page<Article> findByTitle(String title, Pageable pg);
}
