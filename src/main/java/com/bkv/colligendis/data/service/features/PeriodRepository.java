package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.features.Period;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Mono;

public interface PeriodRepository extends ReactiveNeo4jRepository<Period, Long> {

    Mono<Period> findByName(String name);
}
