package com.tutorial.testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestInTestng {
	// Skip Test
	@Test()
	public void skipTestMethod() {
		throw new SkipException("Skipped Test");
	}

	// Pass Test
	@Test()
	public void passTestMethod() {
		Assert.assertTrue(true);
	}

	// Fail Test
	@Test()
	public void failTestMethod() {
		Assert.assertTrue(false);
	}
}
