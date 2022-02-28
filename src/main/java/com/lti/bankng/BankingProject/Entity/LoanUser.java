

package com.lti.bankng.BankingProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LoanTable")
public class LoanUser {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long loanId;
	
	@Column(name = "accNo")
	private long accNo;
	@Column(name = "empVerifierId")
	private long empVerifierId;
	@Column(name = "status")
	private String status;
	@Column(name = "surit")
	private String surit;
	@Column(name = "loanTypeId")
	private String loanTypeId;
	@Column(name = "amtIssued")
	private long amtIssued;
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getEmpVerifierId() {
		return empVerifierId;
	}
	public void setEmpVerifierId(long empVerifierId) {
		this.empVerifierId = empVerifierId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSurit() {
		return surit;
	}
	public void setSurit(String surit) {
		this.surit = surit;
	}
	public String getLoanTypeId() {
		return loanTypeId;
	}
	public void setLoanTypeId(String loanTypeId) {
		this.loanTypeId = loanTypeId;
	}
	public long getAmtIssued() {
		return amtIssued;
	}
	public void setAmtIssued(long amtIssued) {
		this.amtIssued = amtIssued;
	}
	@Override
	public String toString() {
		return "LoanController [loanId=" + loanId + ", accNo=" + accNo + ", empVerifierId=" + empVerifierId
				+ ", status=" + status + ", surit=" + surit + ", loanTypeId=" + loanTypeId + ", amtIssued=" + amtIssued
				+ "]";
	}
	
	
	

}
