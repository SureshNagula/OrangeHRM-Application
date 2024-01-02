package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver;
		String applicationUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		
		driver = new ChromeDriver();
		System.out.println(" ***** Successfully launched Chrome Browser ******* ");
		
		driver.get(applicationUrlAdress);
		System.out.println(" successfully navigate to OrangeHRM Application");
		
		// <input name="txtUsername" id="txtUsername" type="text">

		// id - locator
		// txtUsername - selector
		//driver.findElement(By.id("txtUsername")).sendKeys("laddu");
		
		String userNameTestData="Suresh";
		By userNameProperty=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameProperty);
		userName.sendKeys(userNameTestData);
		
		// <input name="txtPassword" autocomplete="off" type="password">
		
		String passwordTestData="Suresh#1234";
		
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		
		
		// <input type="submit"  class="button"  value="LOGIN">
		
		By loginButtonProperty=By.className("button");
		
		WebElement loginButton=driver.findElement(loginButtonProperty);
		loginButton.click();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
