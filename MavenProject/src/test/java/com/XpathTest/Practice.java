package com.XpathTest;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class Practice implements ITestListener{
	@Test
	public void bery() {
	String expected="Google";
	String actual= "google";
	 
	Assert.assertEquals(expected, actual, "Passed");
	}
	
	

}
