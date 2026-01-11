package com.yrtweb.course.service;

import com.yrtweb.course.entities.Product;
import com.yrtweb.course.repositories.ProductRepository;
import com.yrtweb.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;

    public List<Product> findAll(){
        return pr.findAll();

    }
    public Product findById(Long id){
        Optional<Product> obj = pr.findById(id);
                return obj.get();
    }

}
