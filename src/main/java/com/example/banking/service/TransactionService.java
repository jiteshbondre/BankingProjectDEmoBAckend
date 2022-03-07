package com.example.banking.service;

import java.util.List;

import com.example.banking.Models.User;
import com.example.banking.beans.Transaction;

public interface TransactionService {
	public List<Transaction> getTransaction(User user);
}
