package com.tutorial.testng.suitetest;

import org.testng.annotations.Test;

public class TestClassOne {
	@Test()
	public void firstTestMethod() {
		System.out.println("First test method from class 1");
	}

	@Test()
	public void secondTestMethod() {
		System.out.println("Second test method from class 1");
	}
}
