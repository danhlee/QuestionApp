package com.capgemini.QuestionApp.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.QuestionApp.models.User;

@Repository
@Transactional	// TODO What does readOnly option do?
public class UserRepositoryImpl implements UserRepositoryCustom {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public User getUserByEmail(User user) {

		TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u WHERE u.email = ?1", User.class);
		
		return query.setParameter( 1, user.getEmail() ).getSingleResult();
	}

}
