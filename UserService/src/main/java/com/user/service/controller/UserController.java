package com.user.service.controller;

import java.security.DrbgParameters.Reseed;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.entities.User;
import com.user.service.impl.UserServiceImpl;
import com.user.service.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user)
	{
		User userr= userservice.create(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userr);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getUser()
	{
		return ResponseEntity.status(HttpStatus.OK).body(userservice.getAllUser());
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(userservice.getSingleUser(userId));
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable String userId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(userservice.deleteUser(userId));
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable String userId, @RequestBody User user)
	{
		return ResponseEntity.status(HttpStatus.OK).body(userservice.updateUser(user));
	}
}
