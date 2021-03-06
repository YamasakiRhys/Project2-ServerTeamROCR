package com.revature.Project2Rocr.rest;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2Rocr.beans.Account;
import com.revature.Project2Rocr.beans.City;
import com.revature.Project2Rocr.beans.Country;
import com.revature.Project2Rocr.beans.State;
import com.revature.Project2Rocr.service.AccountService;

@CrossOrigin
@RestController
public class AccountCtrl {

	@Autowired
	AccountService accountService;

	// get request to get account by id
	@GetMapping("/account/{id}")
	public ResponseEntity<Optional<Account>> getAccount(@PathVariable int id) {
		System.out.println("AccountCtrl getAccount -GET");
		if (accountService.getAccount(id).equals(null)) {
			return new ResponseEntity<Optional<Account>>(HttpStatus.NOT_FOUND);
		} else {
		return new ResponseEntity<Optional<Account>>(accountService.getAccount(id), HttpStatus.OK);
		}
	}

	/**
	 *  Get request to get all accounts
	 * @return List of accounts
	 */
	@GetMapping("/account")
	public ResponseEntity<List<Account>> getAllAccounts() {
		System.out.println("AccountCtrl getAllAccounts -GET");
		if (accountService.getAllAccounts().size() == 0) {
			return new ResponseEntity<List<Account>>(HttpStatus.NO_CONTENT);
		} else {
		return new ResponseEntity<List<Account>>(accountService.getAllAccounts(), HttpStatus.OK);
		}
	}

	// end point to send a post request to create an account
	@PostMapping("/account")
	public ResponseEntity<Account> createAccount(@RequestBody Account acc) {
		System.out.println("AccountCtrl - createAccount");
		// the variable acc takes the newly created user from the service
		acc.setAccountStatusId(1);
		acc = accountService.createAccount(acc);
		System.out.println(acc);
		// returns a new object of the account info that was received from db
		return new ResponseEntity<Account>(acc, HttpStatus.CREATED);
	}
	
	// Put method to deactivate an account
	@PutMapping("/account/deactivate")
	public ResponseEntity<Account> deactivateAccount(@RequestBody Account acc) {
		System.out.println("AccountCtrl - createAccount");
		// the variable acc takes the newly created user from the service
		acc.setAccountStatusId(2);
		acc = accountService.deactivateAccount(acc);
		System.out.println(acc);
		// returns an http status once complete
		return new ResponseEntity<Account>(HttpStatus.OK);
	}
	
	// post method for logging in a user
	@PostMapping("/login")
	public ResponseEntity<Optional<Account>> testLogin(@RequestBody Map<String, String> body) {
		// looks at the json object and looks for appropriate value of the specified key
		String username = body.get("username");
		String password = body.get("password");
		// checks the db for a user based on username and password
		if (accountService.loginAttempt(username, password) == null ) {
			return new ResponseEntity<Optional<Account>> (HttpStatus.NOT_FOUND);
		} else {
		return new ResponseEntity<Optional<Account>>(accountService.loginAttempt(username, password), HttpStatus.ACCEPTED);
		}
	}
	
	/**
	 * This method gets a list of cities
	 * @return returns http status of not found or a list and http status of okay
	 */
	@GetMapping("/city")
	public ResponseEntity<List<City>> getAllCities() {
		if (accountService.getCities() == null) {
			return new ResponseEntity<List<City>>(HttpStatus.NOT_FOUND);
		} else {
		return new ResponseEntity<List<City>>(accountService.getCities(), HttpStatus.OK); 
		}
	}
	
	/**
	 * This method gets a list of states
	 * @return returns http status of not found or a list and http status of okay
	 */
	@GetMapping("/state")
	public ResponseEntity<List<State>> getAllStates() {
		if (accountService.getStates() == null) {
			return new ResponseEntity<List<State>>(HttpStatus.NOT_FOUND);
		} else {
		return new ResponseEntity<List<State>>(accountService.getStates(), HttpStatus.OK); 
		}
	}
	
	/**
	 * This method gets a list of countries
	 * @return returns http status of not found or a list and http status of okay
	 */
	@GetMapping("/country")
	public ResponseEntity<List<Country>> getAllCountries() {
		if (accountService.getAllCountries() == null) {
			return new ResponseEntity<List<Country>>(HttpStatus.NOT_FOUND);
		} else {
		return new ResponseEntity<List<Country>>(accountService.getAllCountries(), HttpStatus.OK); 
		}
	}
}
