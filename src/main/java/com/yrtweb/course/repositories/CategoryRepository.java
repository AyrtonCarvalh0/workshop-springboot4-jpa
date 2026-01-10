package com.yrtweb.course.repositories;

import com.yrtweb.course.entities.Category;
import com.yrtweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {


}
