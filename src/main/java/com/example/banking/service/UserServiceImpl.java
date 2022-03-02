package com.example.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banking.DAO.UserDao;
import com.example.banking.Models.User;
import com.example.banking.beans.Login;

@Service
public  class UserServiceImpl implements UserService{
    @Autowired
	UserDao dao;
	 User user = new User();
	@Override
	public User findByAcct(Login login) {
		// TODO Auto-generated method stub
		user = dao.findByAccountNo(login);
		return user;
	}
   
	public User register(User user)
	{
		return dao.register(user);
		
	}
	
}
