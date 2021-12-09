package com.sentek.com.sentek.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
public class Account {
    @Id
    private  String id;
    private String fullName;
    private HashMap properties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public HashMap getProperties() {
        return properties;
    }

    public void setProperties(HashMap properties) {
        this.properties = properties;
    }
}
