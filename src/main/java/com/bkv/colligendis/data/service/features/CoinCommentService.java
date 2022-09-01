package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.CoinComment;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CoinCommentService extends AbstractService<CoinComment, CoinCommentRepository> {
    public CoinCommentService(CoinCommentRepository repository) {
        super(repository);
    }
}
