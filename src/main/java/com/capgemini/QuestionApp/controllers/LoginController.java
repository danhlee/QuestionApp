package com.capgemini.QuestionApp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.QuestionApp.models.User;

@RestController
@RequestMapping("/QuestionApp")
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public List<User> list() {
		
		
		return users;
		
	}
	
	
}
