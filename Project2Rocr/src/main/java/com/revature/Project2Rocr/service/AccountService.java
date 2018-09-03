package com.revature.Project2Rocr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2Rocr.beans.Account;
import com.revature.Project2Rocr.repository.AccountRepo;

@Service
public class AccountService {

	@Autowired
	AccountRepo accRepo;
	
	public Optional<Account> getAccount(int id) {
		System.out.println(accRepo.findById(id));
		return accRepo.findById(id);
	}
	
	public List<Account> getAllAccounts() {
		System.out.println("service - get all accounts");
		return (List<Account>) accRepo.findAll();
	}
	
	public Account createAccount(Account acc) {
		System.out.println("service - Creating Account");
		accRepo.save(acc);
		return acc;
	}
	
	public Optional<Account> loginAttempt(String username, String password) {
		System.out.println("Account Service login attempt -POST");
		return accRepo.findByUsernameAndPassword(username, password);
	}
}
