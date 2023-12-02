package com.OrangeHRMCompleteValidation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver;
		
		String applicationUrlAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "./broserDriveFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

		String userNameTestData="suri";
		By userNameProperty=By.id("txtUsername");
		
		WebElement userName=driver.findElement(userNameProperty);
		
		userName.sendKeys(userNameTestData);

		String passwordTestData="ns";
		
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		
		
		By loginButtonProperty=By.className("button");
		
		WebElement loginButton=driver.findElement(loginButtonProperty);
		loginButton.click();


		//<span id="spanMessage">Invalid credentials</span>
		//<div id="divLoginButton">
		  //          <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		    //                    <span id="spanMessage">Invalid credentials</span>
		      //              </div>
		//<div id="divLoginHelpLink"></div>

		System.out.println("%%%%%%%%%");
		By invalidproperty=By.id("spanMessage");
		WebElement invalid=driver.findElement(invalidproperty);
		
		String in=invalid.getText();
		System.out.println("in"+in);
		File invalidScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(invalidScreenShot, new File("./screenshots/"+in+".png"));
		
	}

}
