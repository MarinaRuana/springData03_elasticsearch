package com.example.springdata_elastic.controller;

import com.example.springdata_elastic.model.Article;
import com.example.springdata_elastic.service.ArticleService;
import com.example.springdata_elastic.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @PostMapping
    public ResponseEntity<Article> save(@RequestBody Article newArticle) {
        return ResponseEntity.ok(service.save(newArticle));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> getById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findById(id));
    }

}
