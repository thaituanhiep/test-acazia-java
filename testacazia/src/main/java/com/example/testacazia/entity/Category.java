package com.example.testacazia.entity;

import javax.persistence.*;

@Table(name = "category")
@Entity
public class Category {
    @Id
    private String tag;
    @Column
    private String name;

    public String getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}