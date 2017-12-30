package com.tutorial.testng.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFailure {
	
	@Test(dataProvider = "userDetails")
	public void testUserDetails(String user, String password) {
		System.out.println("Test User: " + user + " Password: " + password);
	}

	@DataProvider(name = "userDetails")
	public Object[][] userDetails() {

		return new Object[][] { { "user1", "password1", "extraValue" },
			                    { "user2", "password2" }, 
			                    { "user3", "password3" } };
	}
}
