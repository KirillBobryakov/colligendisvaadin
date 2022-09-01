package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.CoinPart;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CoinPartService extends AbstractService<CoinPart, CoinPartRepository> {
    public CoinPartService(CoinPartRepository repository) {
        super(repository);
    }
}
