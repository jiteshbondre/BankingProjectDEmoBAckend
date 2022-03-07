package com.example.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.banking.DAO.TransactionDao;
import com.example.banking.Models.User;
import com.example.banking.service.TransactionService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Transaction {
	
	@Autowired
	TransactionService TD;
	
	@PostMapping("/transaction") 
	public List<com.example.banking.beans.Transaction> getTransaction(@RequestBody User user)
	{    
		List<com.example.banking.beans.Transaction> t=TD.getTransaction(user);
		return t;
	}

}
