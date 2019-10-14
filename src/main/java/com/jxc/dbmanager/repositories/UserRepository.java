package com.jxc.dbmanager.repositories;

import com.jxc.dbmanager.models.User;

import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {

    Page<User> findAll();

    Optional<User> findByEmail(String email);

}
