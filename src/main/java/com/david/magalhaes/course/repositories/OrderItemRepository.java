package com.david.magalhaes.course.repositories;

import com.david.magalhaes.course.entities.OrderItem;
import com.david.magalhaes.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
