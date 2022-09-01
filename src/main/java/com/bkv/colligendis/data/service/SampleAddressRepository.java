package com.bkv.colligendis.data.service;

import com.bkv.colligendis.data.entity.SampleAddress;

import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;

public interface SampleAddressRepository extends ReactiveNeo4jRepository<SampleAddress, Long> {


//    Flux<SampleAddress> findAll(Pageable pageable);
}