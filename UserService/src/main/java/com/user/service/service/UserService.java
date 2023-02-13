package com.user.service.service;

import com.user.service.entities.User;



public interface UserService {

	User create(User user);
	
	java.util.List<User> getAllUser();
	
	User getSingleUser(String userId);
	
	String deleteUser(String userId);
	
	User updateUser(User user);
	
}
