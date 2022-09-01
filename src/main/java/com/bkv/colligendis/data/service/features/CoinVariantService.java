package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.CoinVariant;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CoinVariantService extends AbstractService<CoinVariant, CoinVariantRepository> {
    public CoinVariantService(CoinVariantRepository repository) {
        super(repository);
    }
}
