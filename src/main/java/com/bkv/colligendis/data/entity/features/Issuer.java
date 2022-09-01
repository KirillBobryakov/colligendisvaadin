package com.bkv.colligendis.data.entity.features;

import com.bkv.colligendis.data.entity.AbstractEntity;
import org.springframework.data.neo4j.core.schema.Node;

@Node("ISSUER")
public class Issuer extends AbstractEntity {


    private String name;

    public Issuer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
