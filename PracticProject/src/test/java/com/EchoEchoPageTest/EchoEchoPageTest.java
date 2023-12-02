package com.EchoEchoPageTest;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.EchoEchoPage.EchoEchoPage;

public class EchoEchoPageTest extends BaseTest{
	
	@Test(priority = 1)
	public void milkFunctionalityTest()
	{
		EchoEchoPage click= new EchoEchoPage();
		click.milkFunctionality();
	}
	
	@Test(priority = 2)
	public void butterFunctionalityTest()
	{
		EchoEchoPage click= new EchoEchoPage();
		click.butterFunctionality();
	}
	
	
	@Test(priority = 3)
	public void cheesFunctionalityTest()
	{
		EchoEchoPage click= new EchoEchoPage();
		click.cheesFunctionality();
	}
	
	@Test(priority = 4)
	public void waterFunctionalityTest()
	{
		EchoEchoPage click= new EchoEchoPage();
		click.waterFunctionality();
	}
	
	
	@Test(priority = 5)
	public void beerFunctionalityTest()
	{
		EchoEchoPage click= new EchoEchoPage();
		click.beerFunctionality();
	}
	
	@Test(priority = 6)
	public void wineFunctionalityTest()
	{
		EchoEchoPage click= new EchoEchoPage();
		click.wineFunctionality();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
