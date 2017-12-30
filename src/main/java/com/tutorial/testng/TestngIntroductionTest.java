package com.tutorial.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.tutorial.testng.Addition;

public class TestngIntroductionTest {

	@Test
	public void verifyAdditionOfIntegers() {
		
		Addition obj = new Addition();
		int additionResult = obj.addValues(5, 4);

		Assert.assertNotNull(additionResult);
		Assert.assertEquals(additionResult, 9);
	}
}
