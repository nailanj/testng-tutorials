package com.tutorial.testng.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithObjectTest {
	
	@Test(dataProvider = "userDetails")
	public void testUserDetails(User users) {
		System.out.println("Test User: " + users.getUser() + " Password: " + users.getPassword());
	}

	@DataProvider(name = "userDetails")
	public Object[][] userDetails() {

		return new Object[][] { 
			{ new User().setUser("user1").setPassword("password1") },
			{ new User().setUser("user2").setPassword("password2") },
			{ new User().setUser("user3").setPassword("password3") }, };
	}
}
