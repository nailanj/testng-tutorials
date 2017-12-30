package com.tutorial.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnabledTestMethod {
	// By Default test as True
	@Test
	public void byDefaultTrue() {
		System.out.println("Running: default as true");
	}

	// Enabled Test
	@Test(enabled = true)
	public void enabledTest() {
		System.out.println("Running: enabled = true");
	}

	// Disabled Test
	@Test(enabled = false)
	public void disabledTest() {
		System.out.println("Running: enabled = false");
	}
}
