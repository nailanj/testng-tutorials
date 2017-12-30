package com.tutorial.testng.dependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsTest {

	@Test(groups = { "testGroup" })
	public void firstGroupMethod() {
		System.out.println("First Group method");
	}

	@Test(groups = { "testGroup" })
	public void secondGroupMethod() {
		System.out.println("First Group method");
		Assert.assertTrue(false);
	}

	@Test(dependsOnGroups = { "testGroup" })
	public void TestMethodDependOnGroup() {
		System.out.println("test method depending on group");
	}
}
