package com.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goodle_SignIn_GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String applicationUrlAddress="http://google.com";

		// Automating the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Navigating to Google Home Page
		driver.get(applicationUrlAddress);

		// Identifying the properties of Sign In Element
		// <a  href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
		//continue=https://www.google.com/&amp;ec=GAZAmgQ"
		// target="_top"><span >Sign in</span></a>

		/*
		  a -  an anchor Tag
		href - an attribute

		  Then the element is of Type - link

		  To Automate the link using WebDriver
		-----------------------------------------------

		 locator - linkText
		 Selector - Sign in
		*/

		// Identifying the Property of the element
		By signInProperty=By.linkText("Sign in");
		WebElement signIn=driver.findElement(signInProperty);
		
		String expected_GoogleHomePageSignInText="Sign in";
		System.out.println(" The Expected Text of the SignIn of Google Home Page is :- "+expected_GoogleHomePageSignInText);

		
		String actual_GoogleHomePageSignInText=signIn.getText();
		System.out.println(" The actual Text of the SignIn of Google Home Page is :- "+actual_GoogleHomePageSignInText);
		
		
		if(actual_GoogleHomePageSignInText.equals(expected_GoogleHomePageSignInText))
		{
		System.out.println(" Google Home Page SignIn Text matched - PASS ");
		}
		else
		{
		System.out.println("Google Home Page SignIn Text NOT matched - FAIL ");
		}


		driver.quit();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
