package com.example.banking.Models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Transactions")
public class Transactions {
	
	
	
		@Id
		@Column(name = "transactionId")
		private String transactionId;
		
		
		
		@Column(name = "cardId")
		private long cardId;
		
		@Column(name = "transactionDate")
		private Date transactionDate;
		
		@Column(name = "transactionType")
		private String transactionType;
		
		
		@Column(name = "amount")
		private double amount;
		
		
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
