package com.loonch.jainja.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("features")
public class PropertyFeatures {

    @Id
    private String id;

}
