package com.example.banking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.banking.Models.User;
import com.example.banking.beans.Loans;
import com.example.banking.beans.Transaction;

@Service
public interface AdminService {
	public List<Loans> getloan();
	public List<Transaction> getTransaction();
	public List<User> getUser();
}
