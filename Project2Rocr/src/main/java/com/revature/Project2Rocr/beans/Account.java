package com.revature.Project2Rocr.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {

	@Id
//	@SequenceGenerator(name="FC_SEQ", sequenceName="FC_SEQ", allocationSize=1)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FC_SEQ")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="ROLE_ID")
	private int  roleId;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="INFO_ID")
	private int infoId;
	
	public Account() {}

	public Account(int userId, int roleId, String email, String password, int infoId) {
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.email = email;
		this.password = password;
		this.infoId = infoId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getInfoId() {
		return infoId;
	}

	public void setInfoId(int infoId) {
		this.infoId = infoId;
	}

	@Override
	public String toString() {
		return "Account [userId=" + userId + ", roleId=" + roleId + ", email=" + email + ", password=" + password
				+ ", infoId=" + infoId + "]";
	}

	
}
