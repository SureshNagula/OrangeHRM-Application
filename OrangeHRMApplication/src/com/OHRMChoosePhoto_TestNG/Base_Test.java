package com.OHRMChoosePhoto_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class Base_Test {
	
	 WebDriver driver;
	  String applicationurl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	  
	@BeforeTest
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationurl);
		Log.info("Successfully navigated to OrangeHrm Application");
		driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@AfterTest
public void tearDown()
	{
		driver.quit();
	}

}
