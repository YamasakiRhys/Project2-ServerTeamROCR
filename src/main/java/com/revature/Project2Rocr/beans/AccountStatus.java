package com.revature.Project2Rocr.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_STATUS")
public class AccountStatus implements Serializable{

	@Id
	@Column(name="ACCOUNT_STATUS_ID")
	private int accountStatusId;
	
	@Column(name="STATUS")
	private String status;
	
	@OneToMany(mappedBy = "accountStatus", fetch=FetchType.LAZY)
	private Set<Account> acc = new HashSet<Account>();

	public AccountStatus() {}

	public AccountStatus(int accountStatusId, String status, Set<Account> acc) {
		super();
		this.accountStatusId = accountStatusId;
		this.status = status;
		this.acc = acc;
	}

	public int getAccountStatusId() {
		return accountStatusId;
	}

	public void setAccountStatusId(int accountStatusId) {
		this.accountStatusId = accountStatusId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AccountStatus [accountStatusId=" + accountStatusId + ", status=" + status + "]";
	}
	
}
