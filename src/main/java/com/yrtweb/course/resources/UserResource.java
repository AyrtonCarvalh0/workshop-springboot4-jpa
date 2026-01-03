package com.yrtweb.course.resources;


import com.yrtweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value =  "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll(){
        User u =  new User(1l,"Maria","maria@gmail.conm","1231123"," maria141");
        return ResponseEntity.ok().body(u);
    }
}
