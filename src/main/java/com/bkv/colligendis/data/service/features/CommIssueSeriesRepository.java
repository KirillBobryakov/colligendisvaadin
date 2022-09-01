package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.CommIssueSeries;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Mono;

public interface CommIssueSeriesRepository extends ReactiveNeo4jRepository<CommIssueSeries, Long> {

    Mono<CommIssueSeries> findByName(String name);
}
