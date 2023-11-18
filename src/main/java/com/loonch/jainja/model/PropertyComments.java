package com.loonch.jainja.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("comments")
public class PropertyComments {

    @Id
    private String id;

    @Field(name = "author")
    private User author;

    @Field(name = "text")
    private String text;

    public PropertyComments() {
    }

    public PropertyComments(String id, User author, String text) {
        this.id = id;
        this.author = author;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
