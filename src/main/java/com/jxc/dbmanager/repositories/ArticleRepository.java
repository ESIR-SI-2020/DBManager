package com.jxc.dbmanager.repositories;

import com.jxc.dbmanager.models.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article, String> {

    Page<Article> findAll();

}

