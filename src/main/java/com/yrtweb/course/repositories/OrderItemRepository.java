package com.yrtweb.course.repositories;

import com.yrtweb.course.entities.OrderItem;
import com.yrtweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
