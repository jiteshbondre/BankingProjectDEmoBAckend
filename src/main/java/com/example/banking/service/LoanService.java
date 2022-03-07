package com.example.banking.service;

import java.util.List;

import com.example.banking.Models.Loan_Details;

public interface LoanService {
	public Loan_Details register(Loan_Details loan_Details);
	public List<Loan_Details> getLoan(long accNo);

}
