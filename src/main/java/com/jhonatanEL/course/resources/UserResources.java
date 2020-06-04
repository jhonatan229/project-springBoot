package com.jhonatanEL.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhonatanEL.course.entites.User;
import com.jhonatanEL.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	 
	@Autowired
	private UserService service ;
	
	//mostra os objetos exixtentes dentro do db, atraves da url users
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//mostra o objeto de id x, colocado no url dps de users
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
