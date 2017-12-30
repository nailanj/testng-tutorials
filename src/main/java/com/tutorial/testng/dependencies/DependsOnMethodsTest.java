package com.tutorial.testng.dependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {

	@Test()
	public void firstTestMethod() {
		System.out.println("First test method");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "firstTestMethod" }, alwaysRun = true)
	public void secondTestMethod() {
		System.out.println("Second test method");
	}
}
