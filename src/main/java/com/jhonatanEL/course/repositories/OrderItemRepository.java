package com.jhonatanEL.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonatanEL.course.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
