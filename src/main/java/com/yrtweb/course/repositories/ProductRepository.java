package com.yrtweb.course.repositories;

import com.yrtweb.course.entities.Category;
import com.yrtweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {


}
