package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> finAll() { 
		User u = new User(1L, "Rodrigo", "Rodrigo@Email.com", "751234567", "12345");
		return ResponseEntity.ok().body(u);
		
	}
}
