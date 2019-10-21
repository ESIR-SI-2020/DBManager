package com.jxc.dbmanager.repositories;

import com.jxc.dbmanager.models.UserAdded;

import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddedRepository extends ElasticsearchRepository<UserAdded, String> {

    Page<UserAdded> findAll();
}
