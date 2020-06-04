package com.jhonatanEL.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonatanEL.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
