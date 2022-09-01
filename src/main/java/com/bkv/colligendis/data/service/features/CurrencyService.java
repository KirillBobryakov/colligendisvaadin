package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.features.Currency;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService extends AbstractService<Currency, CurrencyRepository> {
    public CurrencyService(CurrencyRepository repository) {
        super(repository);
    }

    public Currency findByName(String name){
        return repository.findByName(name).block();
    }
}
