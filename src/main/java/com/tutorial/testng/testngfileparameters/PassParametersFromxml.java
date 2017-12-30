package com.tutorial.testng.testngfileparameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassParametersFromxml {
	
	@Parameters({"browser","version","operatingSystem"})
	@Test()
	public void firstTestMethod(String browser,String version,String operatingSystem) {
		
		System.out.println("Parameter browser:"+browser);
		System.out.println("Parameter version:"+version);
		System.out.println("Parameter operatingSystem:"+operatingSystem);
	}
}
