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
import com.example.banking.beans.Loans;
import com.example.banking.beans.Transaction;
import com.example.banking.rowMapper.loanRowMapper;

@Service
public class AdminDao {
	
	@PersistenceContext
	private EntityManager em;
	@Autowired
	JdbcTemplate jdbcTemplate;
	User user = new User();
	
	
	public List<User> getAllUser() {
		List<User> user = (List<User>) em.createQuery("select U from User U", User.class).getResultList(); ;
		System.out.println(user);
		
		return user;
		
		
	}
	
	public List<Transaction> getAllTransaction()
	{
		 System.out.print("All transavctions");

String SQL = "Select * from transactions join transactions_user on transactions.transaction_id=transactions_user.transactions_transaction_id "
		+ "";
System.out.print("hellow");    
		List<Transaction> t=jdbcTemplate.query(SQL,  new TransactionRowMapper());
	return t;
	}

	public List<Loans> getallLoan()
	{
		 System.out.print("sdklfj");

String SQL = "select *from loan_details ld,loans l, user u where ld.user=u.account_no and ld.loan=l.loan_id";
System.out.print("hellow");
		List<Loans> l=jdbcTemplate.query(SQL,  new loanRowMapper());
	return l;
	}
}
