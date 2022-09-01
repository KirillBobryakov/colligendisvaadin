package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.Mint;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Mono;

public interface MintRepository extends ReactiveNeo4jRepository<Mint, Long> {

    Mono<Mint> findByNumistaURL(String numistaURL);

}
