package com.revature.Project2Rocr.rest;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.revature.Project2Rocr.beans.Account;
import com.revature.Project2Rocr.beans.City;
import com.revature.Project2Rocr.beans.Country;
import com.revature.Project2Rocr.beans.Role;
import com.revature.Project2Rocr.beans.State;
import com.revature.Project2Rocr.service.AccountService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AccountCtrlTest.class)
public class AccountCtrlTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private AccountService accountService;
	
	
	
	Account mockAccount = new Account(111, "nisat@yahoo.com", "Nisat", "Chowhury",
			"nisat24", 410987009, "Bruce B Downs", 2, 1, 1, 101, new Role(2,"User"),
			new City(1, "Tampa"), new State(1, "Florida"), new Country(101, "USA"));
	

	@Test
	public void testGetAccount() throws Exception{
		
	    List<Account> allAccounts = Arrays.asList(mockAccount);
	 
//	    given(accountService.getAllAccounts()).willReturn(allAccounts);
	 
	    mockMvc.perform(get("/account/111")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(jsonPath("$[0].fname", is(mockAccount.getFname())));
	}

}
