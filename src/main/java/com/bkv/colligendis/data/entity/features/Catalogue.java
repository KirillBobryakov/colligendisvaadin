package com.bkv.colligendis.data.entity.features;


import com.bkv.colligendis.data.entity.AbstractEntity;
import org.springframework.data.neo4j.core.schema.Node;

@Node("CATALOGUE")
public class Catalogue extends AbstractEntity {

    private String code;
    private String authors;
    private String title;
    private String edition;
    private String publisher;
    private String publicationLocation;
    private String publicationYear;
    private String ISBN10;
    private String ISBN13;


}
