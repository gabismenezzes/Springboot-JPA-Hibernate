package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entities.Product;
import com.example.demo.repositories.ProductRepository;

public class ProductService {

    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
