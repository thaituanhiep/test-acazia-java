package com.example.testacazia.repository;

import com.example.testacazia.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    @Query("SELECT p FROM Product p WHERE p.category_tag.tag like %?1")
    public List<Product> findByCategory_tag(String categoryTag);
}
