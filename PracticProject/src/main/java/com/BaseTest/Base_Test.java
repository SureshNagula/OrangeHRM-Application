package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_Test {


	 public static WebDriver driver;
	String applicationurladdress="https://mail.rediff.com/cgi-bin/login.cgi";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\PracticProject\\browserfiles\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//Log.info("Successfully launched the browser");
		
		driver.navigate().to(applicationurladdress);
		
		//Log.info(applicationurladdress);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
	}
	
 @AfterTest
	public void teardown()
	{
	driver.quit();
	
	//Log.info("Successfully closed the browser");
	}

	
}
