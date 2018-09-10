package com.revature.Project2Rocr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2Rocr.beans.Account;
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
	
	public Optional<Account> getAccount(int id) {
		System.out.println("service - get account by id: " + id);
		Optional<Account> x = accRepo.findById(id);
//		System.out.println(x);
		return x;
	}
	
	public List<Account> getAllAccounts() {
		System.out.println("service - get all accounts");
		System.out.println(cityRepo.findAll());
		System.out.println(stateRepo.findAll());
		System.out.println(countryRepo.findAll());
		System.out.println(roleRepo.findAll());
		return (List<Account>) accRepo.findAll();
	}
	
	public Account createAccount(Account acc) {
		System.out.println("service - Creating Account");
		accRepo.save(acc);
		return acc;
	}
	
	public Optional<Account> loginAttempt(String username, String password) {
		System.out.println("Account Service login attempt -POST");
		System.out.println(cityRepo.findAll());
		System.out.println(stateRepo.findAll());
		System.out.println(countryRepo.findAll());
		System.out.println(roleRepo.findAll());
		return accRepo.findByUsernameAndPassword(username, password);
	}
}
