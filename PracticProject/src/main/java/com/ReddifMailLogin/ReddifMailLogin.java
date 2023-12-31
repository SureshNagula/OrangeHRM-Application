package com.ReddifMailLogin;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.BaseTest.Base_Test;

public class ReddifMailLogin extends Base_Test{

	public ReddifMailLogin()
	{
		PageFactory.initElements(driver, this);
	}
	
	Actions keybord = new Actions(driver);
	
	//<input type="text" id="login1" maxlength="100" name="login" value="" tabindex="1">
	
	@FindBy(name="login")
	WebElement userNameProperty;
	
	public void userNameLoginFunctionality()
	{
		userNameProperty.click();
		userNameProperty.sendKeys("suresh");
	}
	
	//<input type="password" id="password" name="passwd" value="" tabindex="2">
	

	@FindBy(id="password")
	WebElement passwordNameProperty;
	
	public void passwordNameLoginFunctionality()
	{
		passwordNameProperty.click();
		passwordNameProperty.sendKeys("suresh");
	}
	
	//<input type="submit" name="proceed" value="Sign in" title="Sign in" tabindex="4" class="signinbtn">
	
	@FindBy(name="proceed")
	WebElement signInProperty;
	
	public void sighnInFunctionality()
	{
		signInProperty.click();
		keybord.sendKeys(Keys.ENTER).build().perform();
	}

	
	
	
	
	
	
	
}
