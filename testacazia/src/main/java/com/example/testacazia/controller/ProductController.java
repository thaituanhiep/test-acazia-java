package com.example.testacazia.controller;

import com.example.testacazia.entity.Product;
import com.example.testacazia.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/all")
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/name/{name}")
    public List<Product> getByName(@PathVariable String name){
        return productRepository.findByCategory_tag(name);
    }
}
