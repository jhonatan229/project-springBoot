package com.jhonatanEL.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonatanEL.course.entites.Order;
import com.jhonatanEL.course.repositories.OrderRepository;

//registrando a classe na jpa
@Service
public class OrderService {

	@Autowired
	OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll(); 
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
