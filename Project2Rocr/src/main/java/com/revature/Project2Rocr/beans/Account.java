package com.revature.Project2Rocr.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ACCOUNT")
public class Account {

	@Id
	@SequenceGenerator(name="USER_ID_SEQ", sequenceName="USER_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_ID_SEQ")
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="FIRST_NAME")
	private String fname;
	
	@Column(name="LAST_NAME")
	private String lname;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	@JsonIgnore
	private String password;
	
	@Column(name="PHONE_NUMBER")
	private double phoneNum;
	
	@Column(name="STREET_ADDRESS")
	private String street;
	
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name="ROLE_ID", insertable=false, updatable=false)
	private Role role;
	
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name="CITY_ID", insertable=false, updatable=false)
	private City city;

	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name="STATE_ID", insertable=false, updatable=false)
	private State state;
	
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name="COUNTRY_ID", insertable=false, updatable=false)
	private Country country;
	
	public Account() {}

	

	public Account(int userId, Role role, String email, String fname, String lname, String username, String password,
			double phoneNum, String street, City city, State state, Country country) {
		super();
		this.userId = userId;
		this.role = role;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.phoneNum = phoneNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
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

	public void setPhoneNum(double phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}



	@Override
	public String toString() {
		return "Account [userId=" + userId + ", role=" + role + ", email=" + email + ", fname=" + fname + ", lname="
				+ lname + ", username=" + username + ", password=" + password + ", phoneNum=" + phoneNum + ", street="
				+ street + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	
	
	
}
