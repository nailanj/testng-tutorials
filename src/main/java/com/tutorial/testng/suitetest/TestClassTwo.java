package com.tutorial.testng.suitetest;

import org.testng.annotations.Test;

public class TestClassTwo {
	@Test()
	public void firstTestMethod() {
		System.out.println("First test method from class 2");
	}

	@Test()
	public void secondTestMethod() {
		System.out.println("Second test method from class 2");
	}
}
