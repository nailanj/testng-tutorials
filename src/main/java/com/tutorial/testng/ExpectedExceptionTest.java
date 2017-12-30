package com.tutorial.testng;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

	@Test(expectedExceptions = java.lang.NullPointerException.class)
	public void expectedExceptionTest() {
		String ptr = null;
		// This line of code throws NullPointerException
		ptr.equals("testng");
	}
}
