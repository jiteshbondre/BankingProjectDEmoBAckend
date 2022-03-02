package com.example.banking.service;

import org.springframework.stereotype.Service;

import com.example.banking.Models.User;
import com.example.banking.beans.Login;

@Service
public interface UserService {
	User findByAcct(Login login);
	User register(User user);
}
