package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Base_Test;
import com.Utility.Log;

public class OrangeHRMLoginPage extends Base_Test{
	
	public OrangeHRMLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void currentURLFunctionality()
	{
		String expected_CurrentURL="orangehrm-4.2.0.1";
		
		String actual_CurrentURL=driver.getCurrentUrl();
		Log.info(actual_CurrentURL);
		
		if(actual_CurrentURL.equals(actual_CurrentURL))
		{
			Log.info("The Expected URL Contains Actual URL=Pass");
		}
		else
		{
			Log.info("The Expected URL does NOT Contains Actual URL=Fail");
		}
	}
	
	public void tabfunctionality()
	{
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		
	}
	
	public void OrangeHRMLoginPageTitle()
	{
		String expected_actual_TitleOfLoginPage="OrangeHRM";
		
		String actual_TitleOfLoginPage=driver.getTitle();
		
		Log.info(actual_TitleOfLoginPage);
		
		if(actual_TitleOfLoginPage.contains(actual_TitleOfLoginPage))
		{
			Log.info("OrangeHRM Login Page Title is contais Expected Title = Pass");
		}
		else
		{
			Log.info("OrangeHRM Login Page Title is does NOT contais Expected Title = Fail");
		}
	}
	
	
	//<div id="logInPanelHeading">LOGIN Panel</div>
	
	@FindBy(id="logInPanelHeading")
	WebElement loginpanel;
	
	public void Loginpaneltextvalidation()
	{
		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		Log.info(" The expected Text of the OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);


		String actual_OrangeHRMApplicationLogInPageText=loginpanel.getText();
		Log.info(" The actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPageText);
		
		if(actual_OrangeHRMApplicationLogInPageText.equals(actual_OrangeHRMApplicationLogInPageText))
		{
			Log.info(" OrangeHRM Application LogIn Page Text Validation Successfull - PASS ");
		}
		else
		{
		Log.info(" OrangeHRM Application LogIn Page Text Validation UNSuccessfull - FAIL ");
		}
		
	}
	
	///html/body/div[1]/div/div[2]/div/img
	
	@FindBy(xpath="html/body/div[1]/div/div[2]/div/img")
	WebElement logoProperty;
	
	public void orangeHRMLogoValidation()
	{
		 boolean flag=logoProperty.isDisplayed();
		 if(flag)
		 {
			 Log.info("OrangeHRM Applicaiton LogIn WebPage Contains Logo - PASS ");
		 }
		 else
		 {
		 Log.info("OrangeHRM Applicaiton LogIn WebPage doesn Contain Logo - Fail ");
		 }
     }
	
	//<input name="txtUsername" id="txtUsername" type="text">
	@FindBy(id="txtUsername")
	WebElement usernameProperty;
	
	public  void userNameFunctional(String Username)
	{
		usernameProperty.sendKeys(Username);
	}
	
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	@FindBy(name="txtPassword")
	WebElement passwordProperty;
	
	public void passwordfunctionality(String password)
	{
		passwordProperty.sendKeys(password);
	}
	
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	@FindBy(className="button")
	WebElement loginbuttonProperty;
	
	public void loginclickfunctionality()
	{
		loginbuttonProperty.click();
	}
	
	
	//
	////*[@id="openIDForm"]/text()
	//Alternative Login : 
	///html/body/div[1]/div/div[3]/div/form/text()
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/form")
	WebElement alternatelogin;
	
	public void alternateLoginFunctionaitytext()
	{
		
		String expected_alternateloginText="Alternate Login";
		
		String actuala_alternateloginText=alternatelogin.getText();
		
		Log.info(actuala_alternateloginText);
		
		if(actuala_alternateloginText.equals(actuala_alternateloginText))
	    {
			Log.info("OrangeHRM Login Page Cointain Alternate Login Text = Pass");
	    }
		else
		{
			Log.info("OrangeHRM Login Page does Not Cointain Alternate Login Text = Fail");
		}
	}
	
	
	//<select name="openIdProvider" id="openIdProvider">
	//<option value="" selected="selected">-- Select --</option>
	//</select>
	@FindBy(name="openIdProvider")
	WebElement selectoptionProperty;
	
	public void selectfunchtionality()
	{
		selectoptionProperty.click();
		 String select=selectoptionProperty.getText();
		 Log.info(select);
	}
	
	
	//<input type="button" value="Login" name="openIdLogin" id="openIdLogin" disabled="disabled">
	
	@FindBy(id="openIdLogin")
	WebElement login;
	
	public void downlevelLogin()
	{
		String loge=login.getAttribute("value");
		Log.info(loge);
	}
	
	//<div>
   // OrangeHRM 4.2.0.1<br>
//© 2005 - 2023 <a href="http://www.orangehrm.com" target="_blank">OrangeHRM, Inc</a>. All rights reserved.
 //   </div>
	@FindBy(tagName="a")
	WebElement urlofbottom;
	public void urllingbottomloginpage()
	{
		urlofbottom.click();
	}
	
	///html/body/div[1]/div/div[4]/div[2]/a[1]/img
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[1]/img")
	WebElement linkdinProperty;
	
	public void linkdinLinkFunctionality()
	{
		linkdinProperty.click();
	}
	
	
	///html/body/div[1]/div/div[4]/div[2]/a[2]/img
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[2]/img")
	WebElement facebookLinkProperty;
	
	public void faceBookLinkFunctionality()
	{
		facebookLinkProperty.click();
	}
	
	
	///html/body/div[1]/div/div[4]/div[2]/a[3]/img
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[3]/img")
	WebElement twitterLinkProperty;
	
	public void twitterlinkFunctionality()
	{
		twitterLinkProperty.click();
	}
	
	///html/body/div[1]/div/div[4]/div[2]/a[4]/img
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[4]/img")
	WebElement youTubeLinkProperty;
	
	public void youTubelinkFunctionality()
	{
		youTubeLinkProperty.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
