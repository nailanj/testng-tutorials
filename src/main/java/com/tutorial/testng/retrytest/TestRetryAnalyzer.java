package com.tutorial.testng.retrytest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * TestRetryAnalyzer class is implementing the IRetryAnalyzer Interface
 * 
 * @author pawan.garia
 *
 */
public class TestRetryAnalyzer implements IRetryAnalyzer {
	int counter = 1;
	int retryMaxLimit = 3;

	/**
	 * This method decides how many times a test needs to be rerun. TestNg will
	 * call this method every time a test fails. So we can put some code in here
	 * to decide when to rerun the test.
	 * 
	 * Note: This method will return true if a tests needs to be retried and
	 * false it not.
	 */
	public boolean retry(ITestResult result) {
		if (counter < retryMaxLimit) {
			counter++;
			return true;
		}
		return false;
	}

}
