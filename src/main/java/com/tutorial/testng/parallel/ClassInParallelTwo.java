package com.tutorial.testng.parallel;

import org.testng.annotations.Test;

public class ClassInParallelTwo {
	@Test()
	public void firstTestMethod() {
		System.out.println("First test method from Class Two, ThreadID:" + Thread.currentThread().getId());
	}

	@Test()
	public void secondTestMethod() {
		System.out.println("Second test method from Class Two, ThreadID:" + Thread.currentThread().getId());
	}
}
