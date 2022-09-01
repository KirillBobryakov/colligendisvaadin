package com.bkv.colligendis.data.service;

import com.bkv.colligendis.data.entity.SamplePerson;

import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Flux;

public interface SamplePersonRepository extends ReactiveNeo4jRepository<SamplePerson, Long> {
    Flux<SamplePerson> findAllBy(Pageable pageable);

}