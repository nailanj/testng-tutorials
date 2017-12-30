package com.tutorial.testng.retrytest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


/**
 * TestRetryAnalyzerListener class is to implement the IAnnotationTransformer
 * interface as TestNg needs this Listener need to be known very early, So We
 * will use this directly in TestNG.xml.
 * 
 * This Listener is for calling the TestRetryAnalyzer.class to reRun the Failed
 * Test cases.
 * 
 * @author pawan.garia
 *
 */
public class TestRetryAnalyzerListener implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(TestRetryAnalyzer.class);
	}
}