package com.capgemini.QuestionApp.repositories;

import com.capgemini.QuestionApp.models.User;

// for custom SQL methods that are not included in JpaRepository
public interface UserRepositoryCustom {
	User getUserByEmail(User user);
}
