package com.OrangeHRMApplicationTestCases;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.Base_Test;
import com.ExcelOperationsTestDataFiles.Excel_InPut_OutPut;
import com.OrangeHRMApplicationWebPages.OrangeHRMAddEmployee;
import com.OrangeHRMApplicationWebPages.OrangeHRMLoginPage;
import com.Utility.Log;

public class OrangeHRMAddEmployeeTest extends Base_Test {
	
	Excel_InPut_OutPut excel = new Excel_InPut_OutPut();
	
	
	@Test(priority=1)
	public void currentURLFunctionalityTest()
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.currentURLFunctionality();
		
	}
	
	@Test(priority=2)
	public void LoginpaneltextvalidationTest() throws IOException
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.Loginpaneltextvalidation();
	}
	
	
	@Test(priority=3)
	public void OrangeHRMLoginPageTitleTest() throws IOException
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.OrangeHRMLoginPageTitle();
	}
	
	

	@Test(priority=4)
	public void userNameFunctionalTest() throws IOException
	{
	
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		
		addEmployee.userNameFunctional(null);
		
	}
		
	@Test(priority=5)
	public void passwordfunctionalityTest() throws IOException
	{

		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		
		addEmployee.passwordfunctionality(null);
		
	}
	
	@Test(priority=6)
	public void loginclickfunctionalityTest()
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.loginclickfunctionality();
	}
	
	@Test(priority=7)
	public void orangeHRMAddEmployeeLogoValidation()
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.orangeHRMAddEmployeeLogoValidation();
	}
	
	@Test(priority=8)
	public void welcomeAdmintextFunctionalityTest() throws IOException
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.welcomeAdmintextFunctionality();
	}
	
	@Test(priority=9)
	public void addEmployeeURLFunctionality()
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.addEmployeeURLFunctionality();
	}
	
	@Test(priority=10)
	public void OrangeHRMAddEmployeePageTitle()
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.OrangeHRMAddEmployeePageTitle();
	}
	
	@Test(priority=11)
	public void headerblocksFunctionality()
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.headerblocksFunctionality();
	}
	
	@Test(priority=12)
	public void pimLinkFunctionalityTest()
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.pimLinkFunctionality();
	}
	
	@Test(priority=13)
	public void addEmployeeLinkFunctionalityTest()
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.addEmployeeLinkFunctionality();
	}
	
	@Test(priority=14)
	public void addEmployeeTextFunctionalityTest() throws IOException
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.addEmployeeTextFunctionality();
	}
	
	@Test(priority=15)
	public void firstNameFunctionalityTest() throws IOException, InterruptedException
	{

		for(int rowofindex=1;rowofindex<=3;rowofindex++)
		{
		
		Excel_InPut_OutPut excel = new Excel_InPut_OutPut();
		
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		
	String firstName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", rowofindex, 14);
	  
	   String middleneme=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", rowofindex, 15);
	 
	    String lastname=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", rowofindex, 16);
	    
	    addEmployee.firstNameFunctionality(firstName, middleneme, lastname);
	    addEmployee.employeeIdFunctionality();
	    addEmployee.savebuttonfunctionnality();
	    addEmployee.personalDetailsFunctionality();
	    addEmployee.profilePictureNameFunctionality();
	    addEmployee.firstNameDetailsFunctionality();
	    addEmployee.middleNameDetailsFunctionality();
	    addEmployee.lastNameDetailsFunctionality();
	    addEmployee.employeeIdDetailsFunctionality();
	   driver.navigate().back();
	    
	    
		}
		
	}
	
	@Test(priority=16)
	public void wecomeAdminFunctionalityTest()
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.wecomeAdminFunctionality();
	}
	
	@Test(priority=17)
	public void logoutFunctionalityTest()
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.logoutFunctionality();
	}

	@Test(priority=18)
	public void afterLogoutLoginPanelTextFunctionalityTest() throws IOException
	{
		OrangeHRMAddEmployee addEmployee = new OrangeHRMAddEmployee();
		addEmployee.afterLogoutLoginPanelTextFunctionality();
	}

	
	
	
	

	
	
	
}
