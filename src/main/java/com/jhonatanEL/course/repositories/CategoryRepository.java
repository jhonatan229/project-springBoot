package com.jhonatanEL.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonatanEL.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
