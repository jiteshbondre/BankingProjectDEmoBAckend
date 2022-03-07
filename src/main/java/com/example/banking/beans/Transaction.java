package com.example.banking.beans;


import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


public class Transaction {
	
	
	
		private String transactionId;
		
		
		
		private long cardId;
		
		private Date transactionDate;
		
		private String transactionType;
		
		
		private double amount;
		
		private long accountNo;
		
		
		
		
		public long getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(long accountNo) {
			this.accountNo = accountNo;
		}
		public String getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}
		
		public long getCardId() {
			return cardId;
		}
		public void setCardId(long cardId) {
			this.cardId = cardId;
		}
		public Date getTransactionDate() {
			return transactionDate;
		}
		public void setTransactionDate(Date transactionDate) {
			this.transactionDate = transactionDate;
		}
		public String getTransactionType() {
			return transactionType;
		}
		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		
		@Override
		public String toString() {
			return "Transactions [transactionId=" + transactionId + ", cardId=" + cardId + ", transactionDate="
					+ transactionDate + ", transactionType=" + transactionType + ", amount=" + amount +  "]";
		}
        
   
}
