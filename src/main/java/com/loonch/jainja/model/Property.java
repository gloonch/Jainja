package com.loonch.jainja.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("property")
public class Property {

    @Id
    private String Id;

//    TODO : design data model


}
