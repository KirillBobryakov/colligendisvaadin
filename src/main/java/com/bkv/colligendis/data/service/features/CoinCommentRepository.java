package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.CoinComment;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;

public interface CoinCommentRepository extends ReactiveNeo4jRepository<CoinComment, Long> {
}
