package com.example.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banking.DAO.TransactionDao;
import com.example.banking.Models.User;
import com.example.banking.beans.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService{
	@Autowired
	TransactionDao TD;
	
	public List<Transaction> getTransaction(User user)
	{
		return TD.getTransaction(user);
	}

}
