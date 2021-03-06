package com.revature.Project2Rocr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2Rocr.beans.Account;
import com.revature.Project2Rocr.beans.City;
import com.revature.Project2Rocr.beans.Country;
import com.revature.Project2Rocr.beans.State;
import com.revature.Project2Rocr.repository.AccountRepo;
import com.revature.Project2Rocr.repository.CityRepo;
import com.revature.Project2Rocr.repository.CountryRepo;
import com.revature.Project2Rocr.repository.RoleRepo;
import com.revature.Project2Rocr.repository.StateRepo;

@Service
public class AccountService {

	@Autowired
	AccountRepo accRepo;

	@Autowired
	CityRepo cityRepo;

	@Autowired
	StateRepo stateRepo;

	@Autowired
	CountryRepo countryRepo;

	@Autowired
	RoleRepo roleRepo;

	// service method to get the account information by id passed
	public Optional<Account> getAccount(int id) {
		System.out.println("service - get account by id: " + id);
		Optional<Account> x = accRepo.findById(id);
		return x;
	}

	// service method used to get all accounts from db
	public List<Account> getAllAccounts() {
		System.out.println("service - get all accounts");
		return (List<Account>) accRepo.findAll();
	}

	// service method used to create accounts
	public Account createAccount(Account acc) {
		System.out.println("service - Creating Account");
		accRepo.save(acc);
		return acc;
	}
	
	// service method for deactivating accounts
	public Account deactivateAccount(Account acc) {
		System.out.println("service - Creating Account");
		accRepo.save(acc);
		return acc;
	}

	// service method used to pass a username and password to find an account
	public Optional<Account> loginAttempt(String username, String password) {
		System.out.println("Account Service login attempt -POST");
		return accRepo.findByUsernameAndPassword(username, password);
	}
	
	
	/**
	 * This method gets all cities
	 * @return returns a list of cities from the db
	 */
	public List<City> getCities() {
		return (List<City>) cityRepo.findAll();
	}
	
	/**
	 * This method gets all states
	 * @return list of states from the db
	 */
	public List<State> getStates() {
		return (List<State>) stateRepo.findAll();
	}
	
	/**
	 * This method gets all countries
	 * @return list of countries from db
	 */
	public List<Country> getAllCountries() {
		return (List<Country>) countryRepo.findAll();
	}
}
