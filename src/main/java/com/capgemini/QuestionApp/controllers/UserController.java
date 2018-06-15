package com.capgemini.QuestionApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.QuestionApp.models.User;
import com.capgemini.QuestionApp.services.UserService;

@RestController
@RequestMapping("/QuestionApp")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") long id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void createUser(@RequestBody User user) {
		userService.createUser(user);
	}
	
	@RequestMapping(value="/authenticateUser", method=RequestMethod.POST)
	public User authenticateUser(@RequestBody User user) {
		return userService.authenticateUser(user);
	}
}
