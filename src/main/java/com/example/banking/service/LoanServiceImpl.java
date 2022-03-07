package com.example.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banking.DAO.LanDao;
import com.example.banking.Models.Loan_Details;

@Service
public class LoanServiceImpl implements LoanService{
	
	@Autowired
	LanDao TD;
	public Loan_Details register(Loan_Details loan_Details)
	{
		return TD.register(loan_Details);
	}
	public List<Loan_Details> getLoan(long accNo)
	{
		return TD.getLoan(accNo);
	}
}
