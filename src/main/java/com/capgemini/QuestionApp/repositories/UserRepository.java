package com.capgemini.QuestionApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.QuestionApp.models.User;


public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

}
