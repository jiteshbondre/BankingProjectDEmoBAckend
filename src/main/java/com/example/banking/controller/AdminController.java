package com.example.banking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.banking.DAO.AdminDao;
import com.example.banking.DAO.LanDao;
import com.example.banking.DAO.TransactionDao;
import com.example.banking.Models.Loan_Details;
import com.example.banking.Models.User;
import com.example.banking.beans.Loans;
import com.example.banking.beans.Transaction;
import com.example.banking.service.AdminService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {

	@Autowired
	AdminService TD;
	
	@GetMapping("/allTransactions")             
	public List<Transaction> getTransaction()
	{    
		List<Transaction> l=TD.getTransaction();
		return l;
	}

	@GetMapping("/allLoan")
	public List<Loans> getloan()
	{    
		List<Loans> l=TD.getloan();
		return l;
	}
	
	@GetMapping("/allUser")
	public List<User> getUser()
	{    
		
		return TD.getUser();
	}

}
