package fr.esir.jxc.elasticsearch.repositories;

import fr.esir.jxc.domain.models.User;

import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {

    Page<User> findAll();

}
