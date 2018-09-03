package com.revature.Project2Rocr.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2Rocr.beans.Account;
import com.revature.Project2Rocr.service.AccountService;

@RestController
public class AccountCtrl {

	@Autowired
	AccountService accountService;

	@GetMapping("/account/{id}")
	public Optional<Account> getAccount(@PathVariable int id) {
		System.out.println("AccountCtrl -GET");
		return accountService.getAccount(id);
	}

	@GetMapping("/account")
	public List<Account> getAllAccounts() {
		System.out.println("AccountCtrl getAllAccounts -GET");
		return accountService.getAllAccounts();
	}

	@PostMapping("/account")
	public ResponseEntity<Account> createAccount(@RequestBody Account acc) {
		System.out.println("AccountCtrl - createAccount");
		acc = accountService.createAccount(acc);
		return new ResponseEntity<Account>(acc, HttpStatus.CREATED);
	}
	
	
}
