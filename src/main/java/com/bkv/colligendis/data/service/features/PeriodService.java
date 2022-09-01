package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.features.Period;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class PeriodService extends AbstractService<Period, PeriodRepository> {
    public PeriodService(PeriodRepository repository) {
        super(repository);
    }

    public Period findByName(String name){
        return repository.findByName(name).block();
    }
}
