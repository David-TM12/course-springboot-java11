package com.david.magalhaes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.magalhaes.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
