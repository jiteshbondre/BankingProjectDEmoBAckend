package com.example.banking.DAO;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.banking.Models.User;
import com.example.banking.beans.Login;
import com.example.banking.repository.UserRepository;

@Service
public  class UserDao{
	@PersistenceContext
	private EntityManager em;
	
	User user = new User();
	
	public User findByAccountNo(Login login) {
		user = em.find(User.class, login.getAccountNo());
		System.out.println(user);
		System.out.println(login);
		if( user!=null&& (user.getPassword().equals(login.getPassword())))
		{
		return user;
		}
		else{
			return new User();
		}
		
	}
	@Transactional
	public User register(User user) {
	 em.persist(user);

		return user;
	}
	
	
}
