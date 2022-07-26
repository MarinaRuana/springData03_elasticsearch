package com.example.springdata_elastic.controller;

import com.example.springdata_elastic.model.Article;
import com.example.springdata_elastic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @PostMapping
    public ResponseEntity<Article> save(@RequestBody Article newArticle){
        return ResponseEntity.ok(service.save(newArticle));
    }

    @PutMapping
    public ResponseEntity<Article> update(@RequestBody Article article){
        return ResponseEntity.ok(service.update(article));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> getById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<Article>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id){
        return ResponseEntity.ok(service.deleteById(id));
    }

    @DeleteMapping("/v/{id}")
    public ResponseEntity<Void> deleteVoidById(@PathVariable int id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
