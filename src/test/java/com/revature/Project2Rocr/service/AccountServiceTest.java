package com.revature.Project2Rocr.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.revature.Project2Rocr.beans.Account;
import com.revature.Project2Rocr.repository.AccountRepo;
/*
 * The @RunWith annotation runs the tests in this class instead of the runner built into JUnit.
 */
@RunWith(MockitoJUnitRunner.class)
/*
 * basically just saying not to run in a web environment 
 * because we want to run it as a junit test not a spring boot app
 */
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class AccountServiceTest {
	/*
	 * mock object to test because this is  being injected in my AccountService class
	 *  and fake variables that return the i/o
	 */
	@Mock
	AccountRepo accRepo;
	
	@InjectMocks
	private AccountService accountService;
	
	/*
	 * This annotation is just signaling that this method 
	 * should excute before "each" @Test method in the current test class.
	 */
	@BeforeEach
	void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
	}

	/*
	 * This is the actual test method which is why the @Test annotation is used here 
	 */
	@Test
	final void testCreateAccount() {
		
		Account account = new Account();
		
		account.setUserId(123);
		account.setFname("Alex");
		account.setLname("Moraga");
		account.setUsername("alexm");
		
		/*
		 * This is a special line that is using the .save() which when called upon 
		 * in the repo it will take in any message and return the object of the message
		 */
		when(accRepo.save(any(Account.class))).thenReturn(account);
		
		Account newAccount = accountService.accRepo.save(new Account());
		System.out.println(newAccount);
		
		/*
		 *  need to put in the expected vs the actual 
		 */
		assertEquals(123, newAccount.getUserId());
		assertEquals("Alex", newAccount.getFname());
		assertEquals("Moraga", newAccount.getLname());
		assertEquals("alexm", account.getUsername());

	}
	
	final void testGetAccount() {
		
	}
}
