package com.capgemini.QuestionApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.QuestionApp.models.User;
import com.capgemini.QuestionApp.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public User getUser(long id) {
		return userRepository.getOne(id);
	}

	public void createUser(User user) {
		userRepository.save(user);
	}

}
