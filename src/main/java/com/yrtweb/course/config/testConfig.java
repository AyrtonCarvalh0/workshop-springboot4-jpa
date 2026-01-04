package com.yrtweb.course.config;

import com.yrtweb.course.entities.User;
import com.yrtweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class testConfig implements CommandLineRunner {

    @Autowired
    private UserRepository ur;


    @Override
    public void run(String... args) throws Exception {
        User u1  = new User(null , "Maria Brown "  , "maria@gmail.com "  , "9232191" , "11121");
        User u2  = new User(null , "Alex Brown "  , "alex@gmail.com "  , "9211231" , "133211");

        ur.saveAll(Arrays.asList(u1,u2));
    }
}
