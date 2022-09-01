package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.Mint;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class MintService extends AbstractService<Mint, MintRepository> {
    public MintService(MintRepository repository) {
        super(repository);
    }


    public Mint findByNumistaURL(String numistaURL){
        return repository.findByNumistaURL(numistaURL).block();
    }

}
