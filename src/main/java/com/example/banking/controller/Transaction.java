package com.example.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.banking.DAO.TransactionDao;
import com.example.banking.Models.Transactions;
import com.example.banking.Models.User;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Transaction {
	
	@Autowired
	TransactionDao TD;
	
	@PostMapping("/transaction")
	public List<Transactions> getTransaction(@RequestBody User user)
	{    
		List<Transactions> t=TD.getTransaction(user);
		return t;
	}

}
