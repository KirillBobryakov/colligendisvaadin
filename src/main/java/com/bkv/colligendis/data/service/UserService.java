package com.bkv.colligendis.data.service;

import com.bkv.colligendis.data.entity.User;
import java.util.UUID;

import org.neo4j.driver.internal.shaded.reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UserRepository> {


    public UserService(UserRepository repository) {
        super(repository);
    }


}
