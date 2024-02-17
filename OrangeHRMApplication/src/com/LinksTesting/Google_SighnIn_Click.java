package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SighnIn_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String applicationUrlAdress="http://google.com";
		
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(applicationUrlAdress);
		
		// Identifying the properties of Sign In Element
		// <a  href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
		//continue=https://www.google.com/&amp;ec=GAZAmgQ"
		// target="_top"><span >Sign in</span></a>

		//By signInProperty=By.linkText("Sign in");
		//or
		//By signInProperty=By.partialLinkText("Sign");
		//or
		By signInProperty=By.partialLinkText("in");
		WebElement signIn=driver.findElement(signInProperty);
		
		signIn.click();
		
		driver.quit();
		
		
		
	}

}
