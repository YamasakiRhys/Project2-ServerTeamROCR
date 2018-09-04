package com.revature.Project2Rocr.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT")
public class Account {

	@Id
	@SequenceGenerator(name="USER_ID_SEQ", sequenceName="USER_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_ID_SEQ")
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="ROLE_ID")
	private int  roleId;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="FIRST_NAME")
	private String fname;
	
	@Column(name="LAST_NAME")
	private String lname;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="PHONE_NUMBER")
	private double phoneNum;
	
	@Column(name="STREET_ADDRESS")
	private String street;
	
	@Column(name="CITY_ID")
	private int cityId;

	@Column(name="STATE_ID")
	private int stateId;
	
	@Column(name="COUNTRY_ID")
	private int countryId;
	
	public Account() {}

	public Account(int userId, int roleId, String email, String fname, String lname, String username, String password,
			double phoneNum, String street, int cityId, int stateId, int countryId) {
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.phoneNum = phoneNum;
		this.street = street;
		this.cityId = cityId;
		this.stateId = stateId;
		this.countryId = countryId;
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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	@Override
	public String toString() {
		return "Account [userId=" + userId + ", roleId=" + roleId + ", email=" + email + ", fname=" + fname + ", lname="
				+ lname + ", username=" + username + ", password=" + password + ", phoneNum=" + phoneNum + ", street="
				+ street + ", cityId=" + cityId + ", stateId=" + stateId + ", countryId=" + countryId + "]";
	}



	

	
	
	
}
