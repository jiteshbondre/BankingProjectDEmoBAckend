package com.example.banking.beans;

public class Loans {
	
	int loanAppID;
	double ammountIssue;
	String status;
	String surity;
	long userAccountNO;
	String loanType;
	public int getLoanAppID() {
		return loanAppID;
	}
	public void setLoanAppID(int loanAppID) {
		this.loanAppID = loanAppID;
	}
	public double getAmmountIssue() {
		return ammountIssue;
	}
	public void setAmmountIssue(double ammountIssue) {
		this.ammountIssue = ammountIssue;
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
	public long getUserAccountNO() {
		return userAccountNO;
	}
	public void setUserAccountNO(long userAccountNO) {
		this.userAccountNO = userAccountNO;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	
	

	
}
