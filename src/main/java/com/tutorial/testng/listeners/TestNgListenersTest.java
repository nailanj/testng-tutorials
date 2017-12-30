package com.tutorial.testng.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestNgListenersTest implements ISuiteListener {

	public void onStart(ISuite suite) {
		System.out.println("on Before Suite Start");
	}

	public void onFinish(ISuite suite) {
		System.out.println("on After Suite Finish");
	}

}
