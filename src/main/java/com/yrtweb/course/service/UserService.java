package com.yrtweb.course.service;

import com.yrtweb.course.entities.User;
import com.yrtweb.course.repositories.UserRepository;
import com.yrtweb.course.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository ur;

    public List<User> findAll(){
        return ur.findAll();

    }
    public User findById(Long id){
        Optional<User> obj = ur.findById(id);
                return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public User insert (User obj){
       return ur.save(obj);
    }

    public void delete(Long id){
        ur.deleteById(id);
    }
    public User update(Long id , User obj){
        User entity = ur.getReferenceById(id);
        updateData(entity,obj);
        return ur.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
