package com.OHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LougoutTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		
		String applicationUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver", ".");
		 
		driver =new ChromeDriver();
		
		driver.get(applicationUrlAdress);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		By userNameProperty=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameProperty);
		
		
		userName.sendKeys("Suresh");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		By passwordProperty=By.id("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		
		password.sendKeys("Suresh#1234");
		
		
		
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By loginProperty=By.id("btnLogin");
		WebElement login=driver.findElement(loginProperty);
		login.click();
		
		//Thread.sleep(5000); for this check notes
		
		String expectedWelcomeAdminLinkText="Admin";
		System.out.println("The Expected Name of WelcomeAdmin Text is ="+expectedWelcomeAdminLinkText);
		
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		
		By welcomeAdminProperty=By.linkText("Welcome Admin");
		
		WebElement welcomeadminlink=driver.findElement(welcomeAdminProperty);
		
		welcomeadminlink.click();
		
		String actualWelComeAdminText=welcomeadminlink.getText();
		
		System.out.println("The Actual Name of WelcomeAdmin Text is ="+actualWelComeAdminText);
		
		if(actualWelComeAdminText.contains(expectedWelcomeAdminLinkText))
		{
			System.out.println("The Expected WeccomeAdmin text Contain in ActualWelcomeAdmin Text = Pass");
		}
		else
		{
			System.out.println("The Expected WeccomeAdmin text does NOT Contain in ActualWelcomeAdmin Text = Fail");
		}
		
		
		//<li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>
		
		By logoutProperty=By.linkText("Logout");
		
		//check Notes
		
		WebDriverWait suresh = new WebDriverWait(driver, 10);
		suresh.until(ExpectedConditions.visibilityOfElementLocated(logoutProperty));
		
		WebElement logout=driver.findElement(logoutProperty);
		logout.click();
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
