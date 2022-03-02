package com.example.banking.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Loan_Details {
	@Id
	@Column(name = "loanAppId")
	private String loanAppId;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "surity")
	private String surity;
	
	@Column(name = "ammountIssued")
	private double ammountIssued;
	
	
	@ManyToOne
	private Loan loan;
	
	@ManyToOne
	private User user;
	
	public String getLoanAppId() {
		return loanAppId;
	}
	public void setLoanAppId(String loanAppId) {
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
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	


}
