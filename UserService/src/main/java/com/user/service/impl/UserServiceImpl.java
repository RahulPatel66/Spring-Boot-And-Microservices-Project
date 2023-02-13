package com.user.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.service.entities.User;
import com.user.service.exception.ResourceNotFound;
import com.user.service.repository.UserRepository;
import com.user.service.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		String randomId= UUID.randomUUID().toString();
		user.setUserId(randomId);
		return userrepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}

	@Override
	public User getSingleUser(String userId) {
		// TODO Auto-generated method stub
		User user= userrepository.findById(userId).orElseThrow(() -> new ResourceNotFound("user is not exit on server"+userId));
		
//		http://localhost:8084/ratings/users/f9540639-784b-4be0-b668-c5dc46974e59
		
		ArrayList list= restTemplate.getForObject("http://localhost:8084/ratings/users/f9540639-784b-4be0-b668-c5dc46974e59",ArrayList.class);
		
		System.out.println(list);
		user.setRating(list);
		return user;
		
	}

	@Override
	public String deleteUser(String userId) {
		// TODO Auto-generated method stub
		try
		{
			userrepository.deleteById(userId);
			return "user is deleted ";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "user not deleted";
		}
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userrepository.save(user);
	}

}
