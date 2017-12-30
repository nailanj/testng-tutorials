package com.tutorial.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FailingProblem {

	@Test()
	public void testMethod1() {
		System.out.println("In @Test - testMethod1");
	}

	@Test()
	public void testMethod22() {
		System.out.println("In @Test - testMethod2");
	}

	@AfterMethod
	public void afterMethod() {
		try {
			System.out.println("In @AfterMethod");
			Assert.assertTrue(false);
		} catch (java.lang.AssertionError e) {

		}
	}

}
