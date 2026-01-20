package com.yrtweb.course.resources;


import com.yrtweb.course.entities.User;
import com.yrtweb.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value =  "/users")
public class UserResource {

    @Autowired
    private UserService us;


    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = us.findAll();
        return ResponseEntity.ok().body(list);


    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<User>findById(@PathVariable Long id){
        User user = us.findById(id);
        return ResponseEntity.ok().body(user);
    }
    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj){
        obj = us.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        us.delete(id);
        return ResponseEntity.noContent().build();

    }
}
