package com.example.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.banking.DAO.UserDao;
import com.example.banking.Models.User;
import com.example.banking.beans.Login;
import com.example.banking.service.UserService;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
	
	@Autowired
	UserService user;
	
	@GetMapping("/h")
	public String login() {
		return "help";
	}
	
	@PostMapping("/login")
	public User login(@RequestBody Login login) {
		return user.findByAcct(login);
	}
	
	@PostMapping("/Reg")
	public User Reg(@RequestBody User usr) {
		return user.register(usr);
	
	}
	
	
}
