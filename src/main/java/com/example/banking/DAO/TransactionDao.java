package com.example.banking.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.RowMapper;

import com.example.banking.Models.TransactionRowMapper;
import com.example.banking.Models.Transactions;
import com.example.banking.Models.User;
import com.example.banking.beans.Transaction;

@Service
public class TransactionDao {
	
	@PersistenceContext
	private EntityManager em;
	@Autowired
	JdbcTemplate jdbcTemplate;
	User user = new User();
	
	public List<Transaction> getTransaction(User user)
	{
		 System.out.print("sdklfj");

String SQL = "Select * from transactions join transactions_user on transactions.transaction_id=transactions_user.transactions_transaction_id where transactions_user.user_account_no=?";
System.out.print("hellow");
		List<Transaction> t=jdbcTemplate.query(SQL,  new Object[] { user.getAccountNo() }, new TransactionRowMapper());
	return t;
	}

   
}
