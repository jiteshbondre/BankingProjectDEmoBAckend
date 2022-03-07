package com.example.banking.Models;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Loan_Details {
	Random random = new Random();   

	@Id
	@Column(name = "loanAppId")
	private long loanAppId=random.nextInt(1000000);;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "surity")
	private String surity;
	
	@Column(name = "ammountIssued")
	private double ammountIssued;
	
	
	private long loan;
	
	private long user;
	
	public long getLoanAppId() {
		return loanAppId;
	}
	public void setLoanAppId(long loanAppId) {
		this.loanAppId = loanAppId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSurity() {
		return surity;
	}
	public void setSurity(String surity) {
		this.surity = surity;
	}
	public double getAmmountIssued() {
		return ammountIssued;
	}
	public void setAmmountIssued(double ammountIssued) {
		this.ammountIssued = ammountIssued;
	}
	public long getLoan() {
		return loan;
	}
	public void setLoan(long loan) {
		this.loan = loan;
	}
	public long getUser() {
		return user;
	}
	public void setUser(long user) {
		this.user = user;
	}
	
	
	


}
