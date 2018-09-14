package com.revature.Project2Rocr.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.revature.Project2Rocr.beans.Account;


public interface AccountRepo extends CrudRepository<Account, Integer>{

	/*
	 * 	A method that finds an account based on the information given
	 */
	public Optional<Account> findByUsernameAndPassword(String username, String password);
	
}
