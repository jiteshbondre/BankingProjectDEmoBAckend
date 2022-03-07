package com.example.banking.rowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.banking.beans.Loans;
import com.example.banking.beans.Transaction;

public class loanRowMapper implements RowMapper<Loans>{
	 public Loans mapRow(ResultSet rs, int rownumber) {  
		 System.out.print("dk");
		 Loans l=new Loans(); 

		 try{
			 System.out.print("sdklfj");
			l.setLoanAppID(rs.getInt(1));
			l.setAmmountIssue(rs.getDouble(2));
			l.setUserAccountNO(rs.getLong(8));
			l.setStatus(rs.getString(3));
			l.setSurity(rs.getString(4));
			l.setLoanType(rs.getString(11));
			
	
		 }
		 catch(SQLException s)
		 {
         System.out.print("no data found");
		 }

	        return l;

	        
	    } 

}
