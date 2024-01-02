package com.XpathTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base_Test.Gmail_Sign_In_BaseTest;

public class Gmail_Login_Test extends Gmail_Sign_In_BaseTest{
	
	
	//<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" 
	//spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" value="" 
	//aria-disabled="false" autocapitalize="none" 
	//id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">

	//input[@class='whsOnd zHQkBf']
	@Test
    public void signInTest() throws InterruptedException
    {
    	By loginNameProperty=By.xpath("//input[@class='whsOnd zHQkBf']");
    	WebElement userName=driver.findElement(loginNameProperty);
    	userName.sendKeys("Suresh");
    	
    	//<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
    	
    	//tagname[text()='textvalue']
    	
    	//span[text()='Next']
    	
    	By loginProperty=By.xpath("//span[text()='Next']");
    	WebElement login=driver.findElement(loginProperty);
    	login.click();
    	Thread.sleep(5000);
    	
    	
    	
    	
    }
	
	
	
	
	
	
	
}
