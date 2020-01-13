package fr.esir.jxc.elasticsearch.repositories;

import fr.esir.jxc.domain.models.Article;

import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article, String> {

    Page<Article> findAll();

    Page<Article> findByOwner(String owner);
}
