package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.features.Value;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Mono;

public interface ValueRepository extends ReactiveNeo4jRepository<Value, Long> {

    Mono<Value> findByName(String name);
}
