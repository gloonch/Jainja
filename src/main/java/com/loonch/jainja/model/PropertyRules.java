package com.loonch.jainja.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("rules")
public class PropertyRules {

    @Id
    private String id;

}
