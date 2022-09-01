package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.features.Issuer;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class IssuerService extends AbstractService<Issuer, IssuerRepository> {
    public IssuerService(IssuerRepository repository) {
        super(repository);
    }

    public Issuer findByName(String name){
        return repository.findByName(name).block();
    }
}
