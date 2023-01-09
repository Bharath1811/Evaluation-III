package com.masai.webapp.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.webapp.example.entity.User;

public interface UserService {
	
	public List<User> addUser(User user);
	public boolean deleteUser(int userId);
	public List<User> getUsers();
	public User getUser(int userId);

}
