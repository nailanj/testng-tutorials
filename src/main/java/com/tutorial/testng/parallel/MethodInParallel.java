package com.tutorial.testng.parallel;

import org.testng.annotations.Test;

public class MethodInParallel {
	@Test()
	public void firstTestMethod() {
		System.out.println("First test method, ThreadID:" + Thread.currentThread().getId());
	}

	@Test()
	public void secondTestMethod() {
		System.out.println("Second test method, ThreadID:" + Thread.currentThread().getId());
	}
}
