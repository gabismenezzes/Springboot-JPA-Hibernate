package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Entities.Order;
import com.example.demo.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;
    
    public List<Order> findAll(){
        return repository.findAll();
    }

    @GetMapping
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
