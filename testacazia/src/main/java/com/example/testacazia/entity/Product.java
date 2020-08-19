package com.example.testacazia.entity;

import javax.persistence.*;

@Table(name = "product")
@Entity
public class Product {
    @Id
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_tag")
    private Category category_tag;

    public String getName() {
        return name;
    }

    public Category getCategory_tag() {
        return category_tag;
    }

    public void setCategory_tag(Category category_tag) {
        this.category_tag = category_tag;
    }
}
