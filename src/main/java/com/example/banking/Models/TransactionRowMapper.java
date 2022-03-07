package com.example.banking.Models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.banking.beans.Transaction;

public class TransactionRowMapper implements RowMapper<Transaction>{
	 public Transaction mapRow(ResultSet rs, int rownumber) {  
		 System.out.print("dk");
			Transaction t=new Transaction();  

		 try{
			 System.out.print("sdklfj");
			t.setTransactionId(rs.getString(1));
			t.setAmount(rs.getInt(2));
			t.setTransactionDate(rs.getDate(4));
			t.setTransactionType(rs.getString(5));
			t.setAccountNo(rs.getLong(7));
	
		 }
		 catch(SQLException s)
		 {
         System.out.print("no data found");
		 }
         System.out.print(t);

	        return t;

	        
	    } 

}
