package com.example.banking.beans;

public class Login {
	
	private long accountNo;
	private String password;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [accountNo=" + accountNo + ", password=" + password + "]";
	}
	
	
  
}
