package com.masai.webapp.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.webapp.example.entity.User;
import com.masai.webapp.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;

	@Override
	public List<User> addUser(User user) {
		repository.save(user);
		return repository.findAll();
	}

	@Override
	public boolean deleteUser(int userId) {
		repository.deleteById(userId);
		return true;
	}

	@Override
	public List<User> getUsers() {
		return repository.findAll();
	}

	@Override
	public User getUser(int userId) {
		return repository.findById(userId).get();
	}

}
