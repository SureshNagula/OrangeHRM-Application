package com.Base_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SalesForce_BaseTest {


	 public static WebDriver driver;
	String applicationurladdress="https://www.salesforce.com/in/?ir=1";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./browserfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//Log.info(applicationurladdress);
		
		driver.navigate().to(applicationurladdress);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		
	}
	
	/*
@AfterTest
	public void teardown()
	{
	driver.quit();	
	}

*/
	
}
