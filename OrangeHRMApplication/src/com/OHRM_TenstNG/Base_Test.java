package com.OHRM_TenstNG;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class Base_Test {
	
	WebDriver driver;
	String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		Log.info(applicationurladdress);
		
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
