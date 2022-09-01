package com.bkv.colligendis.data.service;

import com.bkv.colligendis.data.entity.User;

import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveNeo4jRepository<User, Long> {

    Mono<User> findByLoginName(String username);
}