package com.tutorial.testng.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener, ISuiteListener, IInvokedMethodListener {

	// ISuiteListener and will execute before the Suite start
	public void onStart(ISuite suite) {
		System.out.println("Begin executing Suite:" + suite.getName());
	}

	// ISuiteListener and will execute, once the Suite is finished
	public void onFinish(ISuite suite) {
		System.out.println("After executing Suite:" + suite.getName());
	}

	// ITestListener and will execute before starting of Test set
	public void onStart(ITestContext arg0) {
		System.out.println("Begin executing Test:" + arg0.getName());
	}

	// ITestListener and will execute, once the Test set is finished
	public void onFinish(ITestContext arg0) {
		System.out.println("Completed executing test:" + arg0.getName());
	}

	// ITestListener and will execute only when the test is pass
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Completed executing test:" + arg0.getName());
	}

	// ITestListener and will execute only on the event of fail test
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test Status::" + arg0.getName());
	}

	// ITestListener and will execute before the main test start (@Test)
	public void onTestStart(ITestResult arg0) {
		System.out.println("Test Status:" + arg0.getName());
	}

	// ITestListener and will execute only if any of the main test(@Test) get
	// skipped
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test Status::" + arg0.getName());
	}

	// IInvokedMethodListener and will execute before every method including
	// @Before @After @Test
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("Before Invocation of method:" + arg0.getTestMethod().getMethodName());
	}

	// IInvokedMethodListener and will execute after every method including
	// @Before @After @Test
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("After Invocation of method:" + arg0.getTestMethod().getMethodName());
	}

	// ITestListener method and Success Percentage
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage:" + result.getTestName());
	}

}