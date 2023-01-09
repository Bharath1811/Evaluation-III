package com.masai.webapp.example.controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.webapp.example.entity.Fir;
import com.masai.webapp.example.entity.User;
import com.masai.webapp.example.exceptions.InvalidMarksException;
import com.masai.webapp.example.service.Firservice;
import com.masai.webapp.example.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("masaifir")
public class MyControllerV2 {
	
	@Autowired
	UserService serviceuser;
	
	@Autowired
	Firservice servicefir;

	
	@PostMapping("/user/register")
	public ResponseEntity<?> createUser(@Valid @RequestBody User user){
		List<User> userlist = serviceuser.addUser(user);
		return new ResponseEntity<List<User>>(userlist, HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> authenticateUser(String firstName, String password) {
		return null;
	}
	
	
	@GetMapping("user/{userId}/fir")
	public List<Fir> getFir(@PathVariable int userId,@RequestBody Fir fir){
		return servicefir.addFir(fir);
	}
	
	@PostMapping("/user/fir")
	public ResponseEntity<?> createFir(@Valid @RequestBody Fir fir){
		List<Fir> firlist = servicefir.addFir(fir);
		return new ResponseEntity<List<Fir>>(firlist, HttpStatus.CREATED);
	}


}
