package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.CoinPart;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;

public interface CoinPartRepository extends ReactiveNeo4jRepository<CoinPart, Long> {
}
