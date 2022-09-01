package com.bkv.colligendis.data.service;

import com.bkv.colligendis.data.entity.SampleAddress;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SampleAddressService {

    private final SampleAddressRepository repository;

    @Autowired
    public SampleAddressService(SampleAddressRepository repository) {
        this.repository = repository;
    }

    public Mono<SampleAddress> get(Long id) {
        return repository.findById(id);
    }

    public Mono<SampleAddress> update(SampleAddress entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Flux<SampleAddress> list(Pageable pageable) {
//        return repository.findAll(pageable);
        return repository.findAll();
    }

    public long count() {
        return repository.count().block();
    }

}
