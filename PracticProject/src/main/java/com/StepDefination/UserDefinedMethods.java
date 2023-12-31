package com.StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UserDefinedMethods {
	
	public static WebDriver driver;
	String RediffMailApplicationUrlAddress="https://mail.rediff.com/cgi-bin/login.cgi";
	
	@Given("^User Should Open Chrome browser in the System$")
	public void user_Should_Open_Chrome_browser_in_the_System() 
	{
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		driver= new ChromeDriver();
		
	    
	}

	@When("^User Enters RediffMail application URL Address$")
	public void user_Enters_RediffMail_application_URL_Address() 
	{
	    driver.get(RediffMailApplicationUrlAddress);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@Then("^User Should be Navigated To RediffMail application Login Page$")
	public void user_Should_be_Navigated_To_RediffMail_application_Login_Page() 
	{
	    String Actual_RediffMailTitle=driver.getTitle();
	    
	    String Expected_RediffMailTitle="Rediffmail";
	    
	    if(Actual_RediffMailTitle.equals(Expected_RediffMailTitle))
	    {
	    //	log.inf("RediffMail LogIn page is sucessfully Navigated- PASS");
	    }
	    else
	    {
	    	//Log.info("RediffMail LogIn page is not sucessfully Navigated- FAIL");
	    }
	}

	@Then("^User should Enter Username and Password and Click on SignIn button$")
	public void user_should_Enter_Username_and_Password_and_Click_on_SignIn_button()
	{
	   
		// id="login1"
		By UserNameProperty=By.id("login1");
		WebElement UserName=driver.findElement(UserNameProperty);
		UserName.sendKeys("Thasleem");
		
	
		//  //*[@id="password"]
		
		By PasswordProperty=By.xpath("//*[@id=\"password\"]");
		WebElement Password=driver.findElement(PasswordProperty);
		Password.sendKeys("Thasleem@07");
		
		//   /html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]
		
		By SignInButtonProperty=By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]");
		WebElement SignIn=driver.findElement(SignInButtonProperty);
		SignIn.click();
		
	}

	@Then("^User Should Close the 	RediffMail application along with the Browser$")
	public void user_Should_Close_the_RediffMail_application_along_with_the_Browser() 
	{
	    driver.quit();
	}

	
	
	
	
	
	
}
