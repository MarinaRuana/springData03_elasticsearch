package com.example.springdata_elastic.service;

import com.example.springdata_elastic.model.Article;
import com.example.springdata_elastic.repository.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService implements IArticleService{

    @Autowired
    private ArticleRepo repo; // Injeção de dependência por atributo

    @Override
    public Article save(Article newArticle) {
        return repo.save(newArticle);
    }

    @Override
    public Article findById(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public String deleteById(int id) {
        repo.deleteById(id);
        return "Artigo removido com sucesso";
    }

    @Override
    public List<Article> findAll() {
        List<Article> list = new ArrayList<>();
        Iterable<Article> resp = repo.findAll();

        resp.forEach(list::add);

        return list;
    }
}
