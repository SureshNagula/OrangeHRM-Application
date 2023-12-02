package com.EmployeeList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
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

public class Employeetest extends Base_Test {

	FileInputStream propertiesFile;
	Properties properties;
	 WebElement welComeAdmin;
	@Test(priority=1,description="Employee List Test")
	public void employeelist() throws IOException
	{
		FileInputStream testdatafile = new FileInputStream("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\ExcelInputFile\\EmployeeList.xlsx");
	   	XSSFWorkbook workbook = new XSSFWorkbook(testdatafile);
	   	XSSFSheet testdatasheet=workbook.createSheet("webtable2");
	   	
	   	propertiesFile = new FileInputStream("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\Config\\orangeHRM.properties");
		properties = new Properties();
		properties.load(propertiesFile);
		
	   	
		FileInputStream orangeHRMApplicationLogInTestDataFile =new FileInputStream("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\ExcelInputFile\\OrangeHRMExcel.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile );
		XSSFSheet logInTestDataSheet =Workbook.getSheet("sheet1");
		
		Row LogInTestDataRow=logInTestDataSheet.getRow(1);
		
		Cell logInTestDataRowOfUserNameCell=LogInTestDataRow.getCell(0);
		
		String userNameTestData=logInTestDataRowOfUserNameCell.getStringCellValue();
		
		// id=txtUsername
		
		// String usernameTestData="Admin";
		
		By usernameProperty=By.id(properties.getProperty("orangeHRMApplicationLogInPageUserNameProperty"));
		WebElement username=driver.findElement(usernameProperty);
		username.sendKeys(userNameTestData);
		
		Log.info(userNameTestData);
		
		Cell logInTestDataRowOfPasswordCell=LogInTestDataRow.getCell(1);
		String passwordTestData=logInTestDataRowOfPasswordCell.getStringCellValue();
		

		By passwordProperty=By.name(properties.getProperty("orangeHRMApplicationLogInPagePasswordProperty"));
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		Log.info(passwordTestData);
		
		By logInButtonProperty=By.className(properties.getProperty("orangeHRMApplicationLogInPageLogInButtonProperty"));
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();

		Log.info("successfully loged in");
	// id="menu_pim_viewPimModule"
		//<b>PIM</b>
		By PIMproperty=By.id(properties.getProperty("orangeHRMApplicationPIMProperty"));
		WebElement PIM=driver.findElement(PIMproperty);
		PIM.click();
		
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>

       By employeelistproperty=By.linkText(properties.getProperty("orangeHRMApplicationEmployeeListProperty"));
       WebElement employeelist=driver.findElement(employeelistproperty);
       
       
       employeelist.click();
       
       
       ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[8]
       
       
       By webTableProperty=By.xpath(properties.getProperty("tablexpathproperty"));
   	WebElement webTable=driver.findElement(webTableProperty);

   	By rowProperty=By.tagName(properties.getProperty("TableRowProperty"));
   	
   	List<WebElement>rows=webTable.findElements(rowProperty);
	
   	for(int rowIndex=0;rowIndex<rows.size();rowIndex++)
   	{
   		Row row=testdatasheet.createRow(rowIndex);
   	WebElement webTableRow=rows.get(rowIndex);
   	By rowOfCellProperty=By.tagName(properties.getProperty("TableRowOfCellProperty"));

   	
   	List<WebElement>rowOfCells=webTableRow.findElements(rowOfCellProperty);

   	
   	for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCells.size();rowOfCellIndex++)
   	{
   	WebElement rowOfCell=rowOfCells.get(rowOfCellIndex);
   	String data=rowOfCell.getText();
   
   	
   	Log.info(data+" | ");
   	
   	
   	Cell cellll=row.createCell(rowOfCellIndex);
   	cellll.setCellValue(data);
   	
   	}
   	
   	}	
   	FileOutputStream res = new FileOutputStream("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\ExcelInputFile\\EmployeeList.xlsx");
   	workbook.write(res);
   	
  
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
