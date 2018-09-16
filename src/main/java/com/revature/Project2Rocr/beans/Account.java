package com.revature.Project2Rocr.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="ACCOUNT")
public class Account {

	@Id
	@SequenceGenerator(name="USER_ID_SEQ", sequenceName="USER_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_ID_SEQ")
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
	private String password;
	
	@Column(name="PHONE_NUMBER")
	private double phoneNumber;
	
	@Column(name="STREET_ADDRESS")
	private String streetAddress;
	
	@Column(name="ROLE_ID")
	private int roleId;
	
	@Column(name="CITY_ID")
	private int cityId;
	
	@Column(name="STATE_ID")
	private int stateId;
	
	@Column(name="COUNTRY_ID")
	private int countryId;
	
	@Column(name="ACCOUNT_STATUS_ID")
	private int accountStatusId;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch=FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name="ROLE_ID", insertable=false, updatable=false)
	private AccountStatus accountStatus;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch=FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name="ROLE_ID", insertable=false, updatable=false)
	private Role role;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch=FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name="CITY_ID", insertable=false, updatable=false)
	private City city;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch=FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name="STATE_ID", insertable=false, updatable=false)
	private State state;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch=FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name="COUNTRY_ID", insertable=false, updatable=false)
	private Country country;
	
	@OneToMany(mappedBy="account", fetch=FetchType.LAZY)
	private Set<Requests> requests = new HashSet<Requests>();
	
	public Account() {}

	public Account(int userId, String email, String fname, String lname, String username, String password,
			double phoneNumber, String streetAddress, int roleId, int cityId, int stateId, int countryId,
			int accountStatusId, AccountStatus accountStatus, Role role, City city, State state, Country country) {
		super();
		this.userId = userId;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.streetAddress = streetAddress;
		this.roleId = roleId;
		this.cityId = cityId;
		this.stateId = stateId;
		this.countryId = countryId;
		this.accountStatusId = accountStatusId;
		this.accountStatus = accountStatus;
		this.role = role;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreet(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public int getAccountStatusId() {
		return accountStatusId;
	}

	public void setAccountStatusId(int accountStatusId) {
		this.accountStatusId = accountStatusId;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
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
		return "Account [userId=" + userId + ", email=" + email + ", fname=" + fname + ", lname=" + lname
				+ ", username=" + username + ", password=" + password + ", phoneNumber=" + phoneNumber + ", street=" + streetAddress
				+ ", roleId=" + roleId + ", cityId=" + cityId + ", stateId=" + stateId + ", countryId=" + countryId
				+ ", role=" + role + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}
