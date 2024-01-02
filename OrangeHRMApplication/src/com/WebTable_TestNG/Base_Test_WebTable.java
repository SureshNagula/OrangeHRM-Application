package com.WebTable_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class Base_Test_WebTable {
	
	WebDriver driver;
	String applicatinurladdress="https://www.timeanddate.com/worldclock/";
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\newbrowser\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.get(applicatinurladdress);
		Log.info("Successfully Navigated to TimeandDate Application");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.MINUTES);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
		Log.info("Successfully closed the browser");
	}
}
