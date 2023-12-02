package com.StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.Utility.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationUserDefinedMethods {

	WebElement welcomeadminlink;
	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
@Given("^User Should Open Chrome Browser in The System$")
public void user_Should_Open_Chrome_Browser_in_The_System() 
{
	System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
	driver = new ChromeDriver();
	
	Log.info(" Successfully launched Chrome Browser ");

	
}

@When("^User Enters OrangeHRM Application URL Address$")
public void user_Enters_OrangeHRM_Application_URL_Address() 
{
    
    driver.get(applicationUrlAddress);
    Log.info("Successfull Navigategint to Application");
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}

@Then("^User Should be Navigated To OrangeHRM Application Login WebPage$")

public void user_Should_be_Navigated_To_OrangeHRM_Application_Login_WebPage() 
{
	
	By logInPanelTextProperty=By.id("logInPanelHeading");
	WebElement logInPanel=driver.findElement(logInPanelTextProperty);

	String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	Log.info(" The expected Text of the OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);


	String actual_OrangeHRMApplicationLogInPageText=logInPanel.getText();
	Log.info(" The actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPageText);

	if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	Log.info(" OrangeHRM Application LogIn Page Text Validation Successfull - PASS ");
	}
	else
	{
	Log.info(" OrangeHRM Application LogIn Page Text Validation UNSuccessfull - FAIL ");
	}

   
}

@Then("^User Should Close the OrangeHRM Application along with the Browser$")
public void user_Should_Close_the_OrangeHRM_Application_along_with_the_Browser() 
{
   
    driver.quit();
    Log.info("Successfully Closed The Browser");
}


@Then("^User Should Enter \"([^\"]*)\" and \"([^\"]*)\" and click on Login button$")
public void user_Should_Enter_and_and_click_on_Login_button(String UserName, String Password) 
{

	By userNameProperty=By.id("txtUsername"); 
	
	WebElement userName=driver.findElement(userNameProperty);
	
	userName.sendKeys(UserName);

	By passwordProperty=By.name("txtPassword");
	// 
	WebElement password=driver.findElement(passwordProperty);
	
	password.sendKeys(Password);

	// <input type="submit"  class="button"  value="LOGIN">
	By logInButtonProperty=By.className("button");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();


   
}


@Then("^User should navigate PIM and Should Click on AddEmployee Functionality$")
public void user_should_navigate_PIM_and_Should_Click_on_AddEmployee_Functionality() {
    
	  //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		By pimProperty=By.id("menu_pim_viewPimModule");
	   WebElement pim = driver.findElement(pimProperty);
	   Actions mose = new Actions(driver);
	   mose.moveToElement(pim).build().perform();
	   
	   
	   //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	   By addEmployeeProperty=By.id("menu_pim_addEmployee");
	   WebElement addEmployee = driver.findElement(addEmployeeProperty);
	   addEmployee.click();

}



@Then("^User Should Pass the Test Data Into \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\" and Get Employee Id$")
public void user_Should_Pass_the_Test_Data_Into_and_and_Get_Employee_Id(String fistName, String middleName, String lastName) 
{
	for(int i=0;i<=2;i++)
	{
	 //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	 By firstNameProperty=By.id("firstName");
	   WebElement firstname = driver.findElement(firstNameProperty);
	   firstname.sendKeys(fistName);
	   
	   //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
	   By middleNameProperty=By.id("middleName");
	   WebElement middlename = driver.findElement(middleNameProperty);
	   middlename.sendKeys(middleName);
	   
	   //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
	   By lastNameProperty=By.id("lastName");
	   WebElement lastname = driver.findElement(lastNameProperty);
	   lastname.sendKeys(lastName);
	 
	   By saveButtonProperty=By.id("btnSave");
	   WebElement save=driver.findElement(saveButtonProperty);
	   save.click();
	  
	   driver.navigate().back();
	}
	
}


@Then("^Save The New Employee Details$")
public void save_The_New_Employee_Details()
{
   By saveButtonProperty=By.id("btnSave");
   WebElement save=driver.findElement(saveButtonProperty);
   save.click();
  
}




@Then("^User Should Enter UserName and Password and Click on Login button$")
public void user_Should_Enter_UserName_and_Password_and_Click_on_Login_button() 
{
	
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

}



@Then("^User Should be Navigating to orangeHRM Home Page Validation Test$")
public void user_Should_be_Navigating_to_orangeHRM_Home_Page_Validation_Test() 
{
String expectedWelcomeAdminLinkText="Admin";
	
	Log.info("The Expected Name of WelcomeAdmin Text is ="+expectedWelcomeAdminLinkText);
	
	//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
By welcomeAdminProperty=By.linkText("Welcome Admin");
	
	welcomeadminlink=driver.findElement(welcomeAdminProperty);
	
	
	String actualWelComeAdminText=welcomeadminlink.getText();
	
	Log.info("The Actual Name of WelcomeAdmin Text is ="+actualWelComeAdminText);
	
	
	if(actualWelComeAdminText.contains(expectedWelcomeAdminLinkText))
	{
		Log.info("The Expected WeccomeAdmin text Contain in ActualWelcomeAdmin Text = Pass");
		
	}
	else
	{
		Log.info("The Expected WeccomeAdmin text does NOT Contain in ActualWelcomeAdmin Text = Fail");
		
	}

   
}




@Then("^User Should be Navigating to orangeHRM Home Page Application$")
public void user_Should_be_Navigating_to_orangeHRM_Home_Page_Application() 
{
	String expectedWelcomeAdminLinkText="Admin";
	
	Log.info("The Expected Name of WelcomeAdmin Text is ="+expectedWelcomeAdminLinkText);
	
	//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
By welcomeAdminProperty=By.linkText("Welcome Admin");
	
	welcomeadminlink=driver.findElement(welcomeAdminProperty);
	
	
	String actualWelComeAdminText=welcomeadminlink.getText();
	
	Log.info("The Actual Name of WelcomeAdmin Text is ="+actualWelComeAdminText);
	
	
	if(actualWelComeAdminText.contains(expectedWelcomeAdminLinkText))
	{
		Log.info("The Expected WeccomeAdmin text Contain in ActualWelcomeAdmin Text = Pass");
		
	}
	else
	{
		Log.info("The Expected WeccomeAdmin text does NOT Contain in ActualWelcomeAdmin Text = Fail");
		
	}
	
	welcomeadminlink.click();
	
}




@Then("^User should click on welcome admin and click on logout$")
public void user_should_click_on_welcome_admin_and_click_on_logout()
{
      
	
	
	By logoutProperty=By.linkText("Logout");
	
	
	WebElement logout=driver.findElement(logoutProperty);
	logout.click();
	
}

@Then("^user should close the OrangeHRM Application along with browser$")
public void user_should_close_the_OrangeHRM_Application_along_with_browser()
{
 
	driver.close();
 
}







}
