package com.example.banking.Models;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class User {
	Random random = new Random();   

	@Id
	@Column(name = "accountNo")
    private long accountNo=random.nextInt(1000000);
	
	@Column(name = "firstName")
    private String firstName;
	
	@Column(name = "lastName")
    private String lastName;
	
	@Column(name = "address")
    private String address;
	
	@Column(name = "aadharNo")
    private long aadharNo;
	
	@Column(name = "panNo")
    private String panNo;
	
	@Column(name = "balance")
    private long balance;
	
	@Column(name = "branchId")
    private String branchId;
	
	@Column(name = "password")
    private String password;
	
	@Column(name = "approvalStatus")
    private String approvalStatus;
	
	@Column(name = "mailId")
    private String mailId;
	
	@Column(name = "phoneNo")
    private long phoneNo;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public User(long accountNo, String firstName, String lastName, String address, long aadharNo, String panNo,
			long balance, String branchId, String password, String approvalStatus, String mailId, long phoneNo) {
		super();
		this.accountNo = accountNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
		this.balance = balance;
		this.branchId = branchId;
		this.password = password;
		this.approvalStatus = approvalStatus;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [random=" + random + ", accountNo=" + accountNo + ", firstName=" + firstName + ", lastName="
				+ lastName + ", address=" + address + ", aadharNo=" + aadharNo + ", panNo=" + panNo + ", balance="
				+ balance + ", branchId=" + branchId + ", password=" + password + ", approvalStatus=" + approvalStatus
				+ ", mailId=" + mailId + ", phoneNo=" + phoneNo + "]";
	}
    
    
}