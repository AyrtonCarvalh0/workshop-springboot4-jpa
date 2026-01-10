package com.yrtweb.course.service;

import com.yrtweb.course.entities.Category;
import com.yrtweb.course.entities.User;
import com.yrtweb.course.repositories.CategoryRepository;
import com.yrtweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository cr;

    public List<Category> findAll(){
        return cr.findAll();

    }
    public Category findById(Long id){
        Optional<Category> obj = cr.findById(id);
                return obj.get();    }

}
