package com.LoginFunctionality;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base_Test.Base_Test;
import com.Utility.Log;

public class Login_With_Valid_Data extends Base_Test {
	

		FileInputStream propertiesFile;
		Properties properties;
		
		WebElement welComeAdmin;
		//Log logfiles; 
		
		@Test
		public void loginTest() throws IOException
		{
			
			//logfiles= new Log();
			
		FileInputStream testDataFile = new FileInputStream("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\ExcelInputFile\\OrangeHRMExcel.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(testDataFile);
			
			XSSFSheet testDataSheet =workbook.getSheet("Sheet1");
			
			propertiesFile = new FileInputStream("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\Config\\orangeHRM.properties");
			properties = new Properties();
			properties.load(propertiesFile);
			
			/*
			
			 FileInputStream propertiesFile = new FileInputStream("./src/com/Config/OHRM.Properties");
			 Properties properties= new Properties();
			 properties.load(propertiesFile);
			*/
			Row testDataRow=testDataSheet.getRow(1);
			
			
			Cell testDataCell=testDataRow.getCell(0);
			
			String userNameTestData=testDataCell.getStringCellValue();
			
			// <input name="txtUsername" id="txtUsername" type="text">

			By userNameProperty=By.id(properties.getProperty("orangeHRMApplicationLogInPageUserNameProperty"));
			
			WebElement userName=driver.findElement(userNameProperty);
			
			userName.sendKeys(userNameTestData);
			 
			
			Log.info(userNameTestData);
			
			Row testDataRowpassword=testDataSheet.getRow(1);
			
			
			Cell testDataCellpassword=testDataRow.getCell(1);
			
			String passwordTestData=testDataCellpassword.getStringCellValue();
			
			// <input name="txtPassword" autocomplete="off" type="password">
			
			
			By passwordProperty=By.name(properties.getProperty("orangeHRMApplicationLogInPagePasswordProperty"));
			WebElement password=driver.findElement(passwordProperty);
			password.sendKeys(passwordTestData);
			
			Log.info(passwordTestData);
			
			// <input type="submit"  class="button"  value="LOGIN">
			
			By loginButtonProperty=By.className(properties.getProperty("orangeHRMApplicationLogInPageLogInButtonProperty"));
			
			WebElement loginButton=driver.findElement(loginButtonProperty);
			loginButton.click();
			
			
				
			String expected_OrangeHRMApplicationHomePageText="Admin";
			System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

			Log.info(expected_OrangeHRMApplicationHomePageText);
			
			// id="welcome" - Property of WelCome Admin Element
			By welComeAdminProperty=By.id(properties.getProperty("ornagehRMApplicationHomePageWelComAdminProperty"));
			 welComeAdmin=driver.findElement(welComeAdminProperty);
		    
			String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
			
			Log.info(actual_OrangeHRMApplicationHomePageText);
		    
			if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
			{
				Log.info("Succesfully Navigated to OrangeHRM Application HomePage - PASS");
				
				Cell testDataCellResult=testDataRow.createCell(2);
				
				testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
				
					
			}
			else
			{
				Log.info("Failed to Navigat to OrangeHRM Application HomePage - FAIL");
			
				
				Cell logInTestResultRowOfCell=testDataRow.createCell(2);
				logInTestResultRowOfCell.setCellValue("Failed to Navigat to OrangeHRM Application HomePage - FAIL");

			}
			
			FileOutputStream testdataresult=new FileOutputStream("C:\\\\Users\\\\rajalingam\\\\Desktop\\\\OrangeHRMApplication\\\\MavenProject\\\\src\\\\main\\\\java\\\\com\\\\ExcelInputFile\\\\OrangeHRMExcel.xlsx");
			
			workbook.write(testdataresult);
			
		}
		
		@Test(priority=2,description="welcome admin click")
		public void wecomeadmintest()
		{
			welComeAdmin.click();
		}
		
		
		@Test(priority=3,description="logout click")
		public void logouttest()
		{
				By logOutProperty=By.linkText(properties.getProperty("ornagehRMApplicationHomePageLogOutProperty"));

			WebElement logOut=driver.findElement(logOutProperty);
			logOut.click();

			

		}

	
	
	}
