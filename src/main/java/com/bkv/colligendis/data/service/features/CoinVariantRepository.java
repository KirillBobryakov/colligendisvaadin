package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.CoinVariant;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;

public interface CoinVariantRepository extends ReactiveNeo4jRepository<CoinVariant, Long> {


}
