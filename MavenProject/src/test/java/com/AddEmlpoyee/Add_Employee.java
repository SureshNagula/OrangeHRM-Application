package com.AddEmlpoyee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Base_Test.Base_Test;
import com.FileInput.ExcelInput;
import com.FileInput.Excel_Iput_Path;
import com.Utility.Log;

public class Add_Employee extends Base_Test {
	
	
	FileInputStream propertiesFile;
	Properties properties;
	
	WebElement welComeAdmin;
	
  @Test(priority=1,description="logindatafrom excel file")
	public void logintest() throws IOException 
	{
	  Excel_Iput_Path ExcelFile= new Excel_Iput_Path();
	  
	  Excel_Iput_Path save= new Excel_Iput_Path();
	  
	  String usernametestdata=ExcelFile.getRowOfCellValue("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\ExcelInputFile\\OrangeHRMExcel.xlsx", "Sheet1", 1, 0);
	  
	 	
	  
		propertiesFile = new FileInputStream("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\Config\\orangeHRM.properties");
		properties = new Properties();
		properties.load(propertiesFile);
		
		// <input name="txtUsername" id="txtUsername" type="text">

		By userNameProperty=By.id(properties.getProperty("orangeHRMApplicationLogInPageUserNameProperty"));
		
		WebElement userName=driver.findElement(userNameProperty);
		
		userName.sendKeys(usernametestdata);
		 
		Log.info(usernametestdata);
		
		// <input name="txtPassword" autocomplete="off" type="password">
		
		String passwordtestdata=ExcelFile.getRowOfCellValue("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\ExcelInputFile\\OrangeHRMExcel.xlsx", "Sheet1", 1, 1);
		By passwordProperty=By.name(properties.getProperty("orangeHRMApplicationLogInPagePasswordProperty"));
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordtestdata);
		
		Log.info(passwordtestdata);
		
		// <input type="submit"  class="button"  value="LOGIN">
		
		By loginButtonProperty=By.className(properties.getProperty("orangeHRMApplicationLogInPageLogInButtonProperty"));
		
		WebElement loginButton=driver.findElement(loginButtonProperty);
		loginButton.click();
	
		String expected_OrangeHRMApplicationHomePageText="Admin";
		
     Log.info(expected_OrangeHRMApplicationHomePageText);
		// id="welcome" - Property of WelCome Admin Element
		By welComeAdminProperty=By.id(properties.getProperty("ornagehRMApplicationHomePageWelComAdminProperty"));
		 welComeAdmin=driver.findElement(welComeAdminProperty);
	    
		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		
	   Log.info(actual_OrangeHRMApplicationHomePageText);
		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
			Log.info(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
				save.setRowOfCellValue("C:\\\\Users\\\\rajalingam\\\\Desktop\\\\OrangeHRMApplication\\\\MavenProject\\\\src\\\\main\\\\java\\\\com\\\\ExcelInputFile\\\\OrangeHRMExcel.xlsx", "Sheet1", 1, 2, " Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		}
		else
		{
			Log.info("Failed to Navigat to OrangeHRM Application HomePage - FAIL");
			save.setRowOfCellValue("C:\\\\Users\\\\rajalingam\\\\Desktop\\\\OrangeHRMApplication\\\\MavenProject\\\\src\\\\main\\\\java\\\\com\\\\ExcelInputFile\\\\OrangeHRMExcel.xlsx", "Sheet1", 1, 2, " UnSuccesfullydoes NOT Navigated to OrangeHRM Application HomePage - Fail");

		}
		
	}
     @Test(priority=2,description="addEmployee Test")
       public void addEmployee() throws IOException
     {

    	 By PIMproperty=By.id(properties.getProperty("orangeHRMApplicationPIMProperty"));
 		WebElement PIM=driver.findElement(PIMproperty);
 		PIM.click();
 		
	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	By addemployeeproperty=By.linkText(properties.getProperty("orangeHRMApplicationAddEmployeeProperty"));
	WebElement addemployee=driver.findElement(addemployeeproperty);
	addemployee.click();
	
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">

	By firstnameproperty=By.id(properties.getProperty("orangeHRMApplicationFirstNameProperty"));
	WebElement firstname=driver.findElement(firstnameproperty);
	
	firstname.click();
	firstname.sendKeys("suresh");
	
	Actions keyboard = new Actions(driver);
	keyboard.sendKeys(Keys.TAB).build().perform();
	
	keyboard.sendKeys(Keys.TAB).build().perform();
	
	keyboard.sendKeys(Keys.TAB).build().perform();
	
	keyboard.sendKeys(Keys.TAB).build().perform();
	
	keyboard.sendKeys(Keys.ENTER).build().perform();
	
	
	java.lang.Runtime.getRuntime().exec("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\autoitscript\\mavenimage.exe");
	
	
		//<input type="button" class="" id="btnSave" value="Save">
	By saveproperty=By.id(properties.getProperty("savebuttonproperty"));
	WebElement save=driver.findElement(saveproperty);
	save.click();
	   
	//<img alt="Employee Photo" 
	//src="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPhoto/empNumber/0060" border="0" id="empPic" width="177" height="200">
	   
	By photoproperty=By.id(properties.getProperty("pictureproperty"));
	WebElement photo=driver.findElement(photoproperty);
	boolean pic=photo.isDisplayed();
	if(pic)
	{
		Log.info("Successfully uploaded the photo = Pass");
	}
	else
	{
		Log.info("UnSuccessfull Photo uplodad = Fail");
	}
	
	}

    @Test(priority=3,description="welcome admin click")
      public void wecomeadmintest()
     {
	welComeAdmin.click();
     }


     @Test(priority=4,description="logout click")
     public void logouttest()
     {
		By logOutProperty=By.linkText(properties.getProperty("ornagehRMApplicationHomePageLogOutProperty"));

	WebElement logOut=driver.findElement(logOutProperty);
	logOut.click();

	

}



}
