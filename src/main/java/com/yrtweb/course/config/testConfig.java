package com.yrtweb.course.config;

import com.yrtweb.course.entities.Enum.OrderStatus;
import com.yrtweb.course.entities.Order;
import com.yrtweb.course.entities.User;
import com.yrtweb.course.repositories.OrderRepository;
import com.yrtweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class testConfig implements CommandLineRunner {

    @Autowired
    private UserRepository ur;

    @Autowired
    private OrderRepository or;



    @Override
    public void run(String... args) throws Exception {
        User u1  = new User(null , "Maria Brown "  , "maria@gmail.com "  , "9232191" , "11121");
        User u2  = new User(null , "Alex Brown "  , "alex@gmail.com "  , "9211231" , "133211");
        ur.saveAll(Arrays.asList(u1,u2));

    Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID ,u1);
    Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT ,u2);
    Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT ,u1);
    or.saveAll(Arrays.asList(o1,o2,o3));


    }

}
