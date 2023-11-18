package com.loonch.jainja.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("user")
public class User {

    @Id
    private String id;

    @Field(name = "name")
    private String name;

    @Field(name = "role")
    private String role;

    public User() {
    }

    public User(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
