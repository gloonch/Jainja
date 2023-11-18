package com.loonch.jainja.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("details")
public class PropertyDetails {

    @Id
    private String id;

}
