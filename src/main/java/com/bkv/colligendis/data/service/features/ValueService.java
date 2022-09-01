package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.features.Value;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ValueService extends AbstractService<Value, ValueRepository> {
    public ValueService(ValueRepository repository) {
        super(repository);
    }

    public Value findByName(String name){
        return repository.findByName(name).block();
    }
}
