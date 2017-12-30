package com.tutorial.testng;

import org.testng.annotations.*;

public class TestngAnnotations {
	@BeforeSuite()
	public void beforeSuite() {
		System.out.println("In @BeforeSuite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("In @BeforeClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("In @BeforeTest");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In @BeforeMethod");
	}

	@Test()
	public void testMethod1() {
		System.out.println("In @Test - testMethod1");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("In @AfterMethod");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("In @AfterTest");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("In @AfterClass");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("In @AfterSuite");
	}
}
