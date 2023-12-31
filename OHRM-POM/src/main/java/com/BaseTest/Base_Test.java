package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class Base_Test {
	

	 public static WebDriver driver;
	String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./browserfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		Log.info("Successfully launched the browser");
		
		driver.navigate().to(applicationurladdress);
		
		Log.info(applicationurladdress);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
	}
	
   @AfterTest
	public void teardown()
	{
	driver.quit();
	
	Log.info("Successfully closed the browser");
	}

}
