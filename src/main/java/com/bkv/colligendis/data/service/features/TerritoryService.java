package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.features.Territory;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class TerritoryService extends AbstractService<Territory, TerritoryRepository> {

    public TerritoryService(TerritoryRepository repository) {
        super(repository);
    }

    public Territory findByName(String name){
        return repository.findByName(name).block();
    }
}
