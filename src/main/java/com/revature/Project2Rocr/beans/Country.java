package com.revature.Project2Rocr.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRY")
public class Country implements Serializable{

	@Id
	@Column(name="COUNTRY_ID")
	private int countryId;
	
	@Column(name="COUNTRY_NAME")
	private String countryName;
	
	@OneToMany(mappedBy="country", fetch=FetchType.LAZY)
	private Set<Account> acc = new HashSet<Account>();
	
	public Country() {}

	public Country(int countryId, String country) {
		super();
		this.countryId = countryId;
		this.countryName = country;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountry() {
		return countryName;
	}

	public void setCountry(String country) {
		this.countryName = country;
	}
	

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", country=" + countryName + "]";
	}
	
}
