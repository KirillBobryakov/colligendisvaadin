package com.bkv.colligendis.data.entity.piece;

import com.bkv.colligendis.data.entity.AbstractEntity;
import org.springframework.data.neo4j.core.schema.Node;

@Node("EDGE")
public class Edge extends AbstractEntity {


    private String photoLink;
    private EDGE_TYPE edgeType;

}
