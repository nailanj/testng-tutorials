package com.tutorial.testng.listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class ListenerTestExample {
	@Test()
	public void testMethod() {
		System.out.println("First test method");
	}

}
