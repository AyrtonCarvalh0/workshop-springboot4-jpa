package com.yrtweb.course.repositories;

import com.yrtweb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Long> {

}
