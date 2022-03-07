package com.example.banking.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.banking.Models.Loan;
import com.example.banking.Models.Loan_Details;
import com.example.banking.Models.TransactionRowMapper;
import com.example.banking.Models.Transactions;
import com.example.banking.Models.User;
import com.example.banking.beans.Transaction;

@Service
public class LanDao {
	
	@PersistenceContext
	private EntityManager em;
	@Autowired
	JdbcTemplate jdbcTemplate;
	User user = new User();

	User u= new User();
	Loan ld= new Loan();
	
	@Transactional
	public Loan_Details register(Loan_Details loan_Details) {
		
		//ld = em.find(Loan.class, "1");
		//loan_Details.setLoanAppId("123");
		//user.setAccountNo(358766);
System.out.println(loan_Details.getLoanAppId());
		
	 em.persist(loan_Details);

		return loan_Details;
	}
	
	public List<Loan_Details> getLoan(long accNo) {
		
		//ld = em.find(Loan.class, "1");
		//loan_Details.setLoanAppId("123");
		//user.setAccountNo(358766);
//System.out.println(loan_Details.getLoanAppId());
		
	List<Loan_Details> ld= em.createQuery("select l from Loan_Details l where l.user=:user").setParameter("user", accNo).getResultList();


		return ld;
	}
	
	
	


   
}
