package com.jhonatanEL.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhonatanEL.course.entites.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	 
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "joao", "joao@outlook.com", "2342323", "2111222");
		return ResponseEntity.ok().body(u);
	}
}
