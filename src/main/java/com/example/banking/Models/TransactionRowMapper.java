package com.example.banking.Models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TransactionRowMapper implements RowMapper<Transactions>{
	 public Transactions mapRow(ResultSet rs, int rownumber) {  
		 System.out.print("dk");
			Transactions t=new Transactions();  

		 try{
			 System.out.print("sdklfj");
			t.setTransactionId(rs.getString(1));
			t.setAmount(rs.getInt(2));
			t.setTransactionType(rs.getString(5));
		 }
		 catch(SQLException s)
		 {
         System.out.print("no data found");
		 }

	        return t;

	        
	    } 

}
