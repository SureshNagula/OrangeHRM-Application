package com.XpathTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base_Test.FaceBookBase_Test;

public class FaceBookLoginTest extends FaceBookBase_Test{

	@Test
	public void loginTest() throws InterruptedException
	{
		
	/*
	<input type="text"
	data-testid="royal_email" placeholder="Email address or phone number"
	autofocus="1" aria-label="Email address or phone number">

	<input type="text" class="inputtext _55r1 _6luy" name="email"
	id="email" data-testid="royal_email" placeholder="Email address or phone number"
	 autofocus="1" aria-label="Email address or phone number">

	*/
	// By emailIdProperty=By.id("email");
	// //*[@id="email"]
	// locator - Xpath  
	// selector - an xpath expression created based on the "available Properties"

	// Relative Xpath
	// Syntax for Xpath expression Creation - Single Property
	// //tagname[@attribute='attributeValue']

	//input[@aria-label='Email address or phone number'] - xpath Expression
	//*[@aria-label='Email address or phone number']

		// //tagname[@attributename1='attributevalue1' and @attributename2='attributevalue2' and ........]

     //input["data-testid1='royal_email' and @placeholder2='Email address or phone number']
		//By emailIdProperty=By.xpath("//*[@data-testid='royal_email' and @placeholder='Email address or phone number']");
     By emailProperty=By.xpath("//input[@data-testid='royal_email' and @placeholder='Email address or phone number']");
	WebElement email=driver.findElement(emailProperty);
	email.sendKeys("Suresh");
	
	//<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" 
	//id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">
	
	//input[@data-testid='royal_pass'
	
	
	  By passwordProperty=By.xpath("//*[@aria-label='Password']");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys("Suresh");
		//By passwordProperty=By.xpath("//*[@data-testid='royal_pass']");
		
	
	//<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" 
    //name="login" data-testid="royal_login_button" type="submit" id="u_0_5_by">Log in</button>
	
	//button[@name='login']
	
		By loginButtonProperty=By.xpath("//button[@name='login']");
		WebElement login=driver.findElement(loginButtonProperty);
		login.click();
	Thread.sleep(5000);
	
	
	
	
	
	}

}
