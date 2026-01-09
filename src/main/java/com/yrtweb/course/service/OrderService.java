package com.yrtweb.course.service;

import com.yrtweb.course.entities.Order;
import com.yrtweb.course.repositories.OrderRepository;
import com.yrtweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository or;

    public List<Order> findAll(){
        return or.findAll();

    }
    public Order findById(Long id){
        Optional<Order> obj = or.findById(id);
                return obj.get();
    }

}
