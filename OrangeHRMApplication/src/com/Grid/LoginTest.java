package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Parameters("Browser")
	
	@Test
	public void loginTest(String browserName) throws MalformedURLException, InterruptedException

	{
		
		System.out.println("The name of the browser is"+browserName);
		
		DesiredCapabilities capabilities=null;
		
		if(browserName.equals("chrome"))
		{
			capabilities=DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
		}
		
		else
	   if(browserName.equals("firefox"))
		{
		   capabilities=DesiredCapabilities.firefox();
		   capabilities.setBrowserName("firefox");
		   capabilities.setPlatform(Platform.WINDOWS);
		   
		}
		
		
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.45.54:4444/wd/hub"), capabilities);
		
		
		
		
		
	}

}
