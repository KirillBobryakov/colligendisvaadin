package com.bkv.colligendis.data.service;

import com.bkv.colligendis.data.entity.SamplePerson;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SamplePersonService {

    private final SamplePersonRepository repository;

    @Autowired
    public SamplePersonService(SamplePersonRepository repository) {
        this.repository = repository;
    }

    public Mono<SamplePerson> get(Long id) {
        return repository.findById(id);
    }

    public Mono<SamplePerson> update(SamplePerson entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Flux<SamplePerson> list(Pageable pageable) {
        return repository.findAllBy(pageable);
    }

    public long count() {
        return repository.count().block();
    }

}
