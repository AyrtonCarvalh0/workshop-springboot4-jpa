package com.yrtweb.course.resources;


import com.yrtweb.course.entities.Product;
import com.yrtweb.course.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value =  "/products")
public class ProductResource {

    @Autowired
    private ProductService ps;


    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = ps.findAll();
        return ResponseEntity.ok().body(list);


    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product>findById(@PathVariable Long id){
        Product Product = ps.findById(id);
        return ResponseEntity.ok().body(Product);
    }
}
