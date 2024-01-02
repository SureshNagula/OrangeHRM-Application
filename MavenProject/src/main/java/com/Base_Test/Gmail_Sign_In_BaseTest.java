package com.Base_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Gmail_Sign_In_BaseTest {
	

	 public static WebDriver driver;
	String applicationurladdress="https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F1%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F1%2F&ifkv=ASKXGp1W9z5f6aOVcEvAYF7QNSL4MUaSjYpJSJbkDhjt9OVV7cAAeEpfhRp9XSGrtgBywA6JL0Mxng&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-855327228%3A1701867553561742&theme=glif";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./browserfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//Log.info(applicationurladdress);
		
		driver.navigate().to(applicationurladdress);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
	}
	
@AfterTest
	public void teardown()
	{
	driver.quit();	
	}





}
