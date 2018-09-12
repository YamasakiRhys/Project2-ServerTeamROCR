package com.revature.Project2Rocr.rest;

import java.util.List;
import java.util.Map;
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

	// get request to get account by id
	@GetMapping("/account/{id}")
	public Optional<Account> getAccount(@PathVariable int id) {
		System.out.println("AccountCtrl getAccount -GET");
		return accountService.getAccount(id);
	}

	// get request to get all accounts
	@GetMapping("/account")
	public List<Account> getAllAccounts() {
		System.out.println("AccountCtrl getAllAccounts -GET");
		return accountService.getAllAccounts();
	}

	// end point to send a post request to create an account
	@PostMapping("/create/account")
	public ResponseEntity<Account> createAccount(@RequestBody Account acc) {
		System.out.println("AccountCtrl - createAccount");
		// the variable acc takes the newly created user from the service
		acc = accountService.createAccount(acc);
		System.out.println(acc);
		// returns a new object of the account info that was received from db
		return new ResponseEntity<Account>(acc, HttpStatus.CREATED);
	}
	
	
	// post method for logging in a user
	@PostMapping("/login")
	public Optional<Account> testLogin(@RequestBody Map<String, String> body) {
		// looks at the json object and looks for appropriate value of the specified key
		String username = body.get("username");
		String password = body.get("password");
		// checks the db for a user based on username and password
		Optional<Account> x = accountService.loginAttempt(username, password);
		return x;
	}
}
