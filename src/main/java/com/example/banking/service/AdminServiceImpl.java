package com.example.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banking.DAO.AdminDao;
import com.example.banking.Models.User;
import com.example.banking.beans.Loans;
import com.example.banking.beans.Transaction;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao TD;
	
	public List<Loans> getloan()
	{
		return TD.getallLoan();
	}
	public List<Transaction> getTransaction()
	{
		return TD.getAllTransaction();
	}
	public List<User> getUser()
	{
		return TD.getAllUser();
		
	}
}
