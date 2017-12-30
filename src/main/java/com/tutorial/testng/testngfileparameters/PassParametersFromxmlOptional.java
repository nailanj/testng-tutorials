package com.tutorial.testng.testngfileparameters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassParametersFromxmlOptional {
	
	@Parameters({"browser","version","operatingSystem"})
	@BeforeClass
    public void beforeClass(String browser,String version,@Optional String operatingSystem) {
		
		System.out.println("Parameter browser:"+browser);
		System.out.println("Parameter version:"+version);
		System.out.println("Parameter operatingSystem:"+operatingSystem);
	}
	
	@Parameters({"browser","version","operatingSystem"})
	@BeforeTest
    public void beforetest(String browser,String version,@Optional String operatingSystem) {
		
		System.out.println("Parameter browser:"+browser);
		System.out.println("Parameter version:"+version);
		System.out.println("Parameter operatingSystem:"+operatingSystem);
	}
	@Parameters({"browser","version","operatingSystem"})
	@BeforeMethod
    public void beforeMethod(String browser,String version,@Optional String operatingSystem) {
		
		System.out.println("Parameter browser:"+browser);
		System.out.println("Parameter version:"+version);
		System.out.println("Parameter operatingSystem:"+operatingSystem);
	}
	@Parameters({"browser","version","operatingSystem"})
	@Test()
	public void firstTestMethod(String browser,String version,@Optional String operatingSystem) {
		
		System.out.println("Parameter browser:"+browser);
		System.out.println("Parameter version:"+version);
		System.out.println("Parameter operatingSystem:"+operatingSystem);
	}
}
