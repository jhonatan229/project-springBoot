package com.jhonatanEL.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonatanEL.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
