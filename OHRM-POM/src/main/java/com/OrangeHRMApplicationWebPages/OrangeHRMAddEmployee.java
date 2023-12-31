package com.OrangeHRMApplicationWebPages;

import java.io.IOException;

import org.apache.poi.poifs.storage.HeaderBlock;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Base_Test;
import com.ExcelOperationsTestDataFiles.Excel_InPut_OutPut;
import com.Utility.Log;

public class OrangeHRMAddEmployee extends Base_Test {
	
	
	Excel_InPut_OutPut excel = new Excel_InPut_OutPut();
	
	Actions keyboard = new Actions(driver);
	
	
	public OrangeHRMAddEmployee()
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

	//<div id="logInPanelHeading">LOGIN Panel</div>
	
	@FindBy(id="logInPanelHeading")
	WebElement loginpanel;
	
	public void Loginpaneltextvalidation() throws IOException
	{
		String loginpanelName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 0);
		
		String expected_OrangeHRMApplicationLogInPageText=loginpanelName;
		
		Log.info(" The expected Text of the OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);


		String actual_OrangeHRMApplicationLogInPageText=loginpanel.getText();
		
		
		excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 1, actual_OrangeHRMApplicationLogInPageText);
		
		Log.info(" The actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPageText);
		
		if(actual_OrangeHRMApplicationLogInPageText.equals(actual_OrangeHRMApplicationLogInPageText))
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 2, " OrangeHRM Application LogIn Page Text Validation Successfull - PASS ");
			
			Log.info(" OrangeHRM Application LogIn Page Text Validation Successfull - PASS ");
		}
		else
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 2, " OrangeHRM Application LogIn Page Text Validation UNSuccessfull - FAIL ");
			
		Log.info(" OrangeHRM Application LogIn Page Text Validation UNSuccessfull - FAIL ");
		}
		
	}

	public void OrangeHRMLoginPageTitle() throws IOException
	{
		String titleName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 3);
		
		String expected_actual_TitleOfLoginPage=titleName;
		
		String actual_TitleOfLoginPage=driver.getTitle();
		
		excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 4, actual_TitleOfLoginPage);
		
		Log.info(actual_TitleOfLoginPage);
		
		if(actual_TitleOfLoginPage.contains(actual_TitleOfLoginPage))
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 5, "OrangeHRM Login Page Title is contais Expected Title = Pass");
			
			Log.info("OrangeHRM Login Page Title is contais Expected Title = Pass");
		}
		else
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 5, "OrangeHRM Login Page Title is contais Expected Title = Pass");
			
			Log.info("OrangeHRM Login Page Title is does NOT contais Expected Title = Fail");
		}
	}
	
	
	//<input name="txtUsername" id="txtUsername" type="text">
	@FindBy(id="txtUsername")
	WebElement usernameProperty;
	
	public  void userNameFunctional(String Username) throws IOException
	{
		String userName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 6);
		
		usernameProperty.sendKeys(userName);
	}
	
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	@FindBy(name="txtPassword")
	WebElement passwordProperty;
	
	public void passwordfunctionality(String password) throws IOException
	{
		String passwordTestdata=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 7);
		
		passwordProperty.sendKeys(passwordTestdata);
	}
	
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	@FindBy(className="button")
	WebElement loginbuttonProperty;
	
	public void loginclickfunctionality()
	{
		loginbuttonProperty.click();
	}
	
	
	///html/body/div[1]/div[1]/a[1]/img
	
	@FindBy(xpath="/html/body/div[1]/div[1]/a[1]/img")
	WebElement logoProperty;
	
	public void orangeHRMAddEmployeeLogoValidation()
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
	
	
	
	public void addEmployeeURLFunctionality()
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

	public void OrangeHRMAddEmployeePageTitle()
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

	//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
	@FindBy(id="welcome")
	WebElement welcomeAdminText;
	
	public void welcomeAdmintextFunctionality() throws IOException
	{
		String welcoAdmin=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 8);
		
		String expected_WelComeAdminText=welcoAdmin;
		
	    String actual_WelComeAdminText=welcomeAdminText.getText();
	    
	    excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 9, "OrangeHRM Login Page Title is contais Expected Title = Pass");
	     
	     if(actual_WelComeAdminText.equals(actual_WelComeAdminText))
	     {
	    	   excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 10, " The Actual Home Page Text Is Equals to Expected Text = Pass");
	    	 
	    	 Log.info(" The Actual Home Page Text Is Equals to Expected Text = Pass");
	     }
	     else
	     {
	    	 excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 10, " The Actual Home Page Text Is NOT Equals to Expected Text = Fail");
	     
	    	 Log.info(" The Actual Home Page Text Is Equals to Expected Text = Fail");
	     }
		
	}
	
	///html/body/div[1]/div[2]/ul
	@FindBy(xpath="/html/body/div[1]/div[2]/ul")
     WebElement headerblock;
	@FindBy(tagName="a")
	WebElement links;
	public void headerblocksFunctionality()
	{
		String linksName=links.getText();
		Log.info(linksName);
	}
	
	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimProperty;
	
	public void pimLinkFunctionality()
	{
		keyboard.moveToElement(pimProperty).build().perform();
	}
	
	////<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	@FindBy(id="menu_pim_addEmployee")
	WebElement addemployeeproperty;
	
	public void addEmployeeLinkFunctionality()
	{
		addemployeeproperty.click();
		
	}
	
	//<h1>Add Employee</h1>
	///html/body/div[1]/div[3]/div/div[1]/h1
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div[1]/h1")
	WebElement addEmployeeText;
	
	public void addEmployeeTextFunctionality() throws IOException
	{
		String addEmployeetext=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 11);
		
		String expected_addEmployeeText=addEmployeetext;
		
		String actual_addEmployeeText=addEmployeeText.getText();
		
		 excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 12, actual_addEmployeeText);
		 
		 if(actual_addEmployeeText.equals(employeeidDetailsProperty))
		 {
			 excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 13, "AddEmployee Text is equals To Actual AddEmployee Text= Pass");
		 }
		 else
		 {
			 excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 13, "AddEmployee Text is NOT equals To Actual AddEmployee Text= Fail");
		 }
		 
	}
	
	
	
	//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	@FindBy(id="firstName")
	WebElement firstNameProperty;
	
	//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
	@FindBy(id="middleName")
	WebElement middleNameProperty;

	//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
	@FindBy(id="lastName")
	WebElement lastNameProperty;

	
	public void  firstNameFunctionality(String firstname,String MiddleName,String lastName) throws IOException
	{
		//String firstName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", rowofindex, 14);
		firstNameProperty.sendKeys(firstname);
		
		//String middleName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", rowofindex, 15);
		middleNameProperty.sendKeys(MiddleName);
		
		//String lastNames=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", rowofindex, 16);
		lastNameProperty.sendKeys(lastName);
		
		//String employeeId=employeeidProperty.getAttribute("value");
		//Log.info(employeeId);
		//saveButtonProperty.click();
		
		
		//driver.navigate().back();
		
		
		
	}
	
	//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0061" id="employeeId">
	
	@FindBy(id="employeeId")
	WebElement employeeidProperty;
	
	public void employeeIdFunctionality() throws IOException, InterruptedException
	{
		String employeeId=employeeidProperty.getAttribute("value");
		Log.info(employeeId);
		
		excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 17, employeeId);
		//employeeId.sendKeys(Keys.TAB).build().perform();
	
	//	keyboard.sendKeys(Keys.ENTER).build().perform();
		//choosephotoProperty.sendKeys(Keys.ENTER).
		
	//java.lang.Runtime.getRuntime().exec("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\OHRM-POM\\AutoItScripts\\SuriPOM.exe");
	//Thread.sleep(10000);
	}
	
	
	//<input type="button" class="" id="btnSave" value="Save">
	@FindBy(id="btnSave")
	WebElement saveButtonProperty;
	
	public void savebuttonfunctionnality()
	{
		saveButtonProperty.click();
	}
	
	
	
	//<h1>Personal Details</h1>
	///html/body/div[1]/div[3]/div/div[2]/div[1]/h1
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div[1]/div/h1")
    WebElement profilepictureNameProperty;	
	
	public void profilePictureNameFunctionality() throws IOException
	{
		String personalName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 14);
		String expected_PersonalDetailsTesx=personalName;
		Log.info(expected_PersonalDetailsTesx);
		
		String actual_PersonalDetailsText=profilepictureNameProperty.getText();
		
		Log.info(actual_PersonalDetailsText);
		
		if(actual_PersonalDetailsText.equals(actual_PersonalDetailsText))
		{
			
			Log.info("Actual Personal Details Page contains Expected Text= Pass");
		}
		else
		{
			
			Log.info("Actual Personal Details Page does NOT contains Expected Text= Fail");
		}
		
	}
	
	//<div class="head">
  
	@FindBy(className="head")
    WebElement personalDetailsProperty;	
	
	public void personalDetailsFunctionality() throws IOException
	{
		String personalName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 18);
		String expected_PersonalDetailsTesx="personalName";
		Log.info(expected_PersonalDetailsTesx);
		String actual_PersonalDetailsText=personalDetailsProperty.getText();
		excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 19, actual_PersonalDetailsText);
		Log.info(actual_PersonalDetailsText);
		
		if(actual_PersonalDetailsText.equals(actual_PersonalDetailsText))
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 19, "Actual Text Is Equal To Expected Text");
			Log.info("Actual Personal Details Page contains Expected Text= Pass");
		}
		else
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 19, "Actual Text Is NOT Equal To Expected Text");
			Log.info("Actual Personal Details Page does NOT contains Expected Text= Fail");
		}
		
	}
	
	//<input value="Akhli" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">

	
	@FindBy(id="personal_txtEmpFirstName")
	WebElement firstNameDetailsProperty;
	
	public void firstNameDetailsFunctionality() throws IOException
	{
		String firstName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 14);
		String expected_FirstNameDetailsText=firstName;
		Log.info(expected_FirstNameDetailsText);
		String actual_FirstNameDetailsText=firstNameDetailsProperty.getText();
		excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 21, actual_FirstNameDetailsText);
		Log.info(actual_FirstNameDetailsText);
		
		if(actual_FirstNameDetailsText.equals(expected_FirstNameDetailsText))
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 22, "Actual name Match with Expected Name");
		 Log.info("Actual firstName ContIns Expected FirstName = Pass");
		}
		else
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 22, "Actual name NOT Match with Expected Name");
			 Log.info("Actual firstName does NOT ContIns Expected FirstName = Fail");
		}
		
		
	}
	
	//<input value="Puligari" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
	@FindBy(id="personal_txtEmpMiddleName")
	WebElement middleNameDetailsPropery;
	
	public void middleNameDetailsFunctionality() throws IOException
	{
		String middleName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 15);
		String expected_middleNameDetailsText=middleName;
		Log.info(expected_middleNameDetailsText);
		String actual_middleNameDetailsText=middleNameDetailsPropery.getText();
		excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 24, actual_middleNameDetailsText);
		Log.info(actual_middleNameDetailsText);
		
		if(actual_middleNameDetailsText.equals(expected_middleNameDetailsText))
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 25, "Actual name Match with Expected Name");
		 Log.info("Actual middleName ContIns Expected middleName = Pass");
		}
		else
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 25, "Actual name Match with Expected Name");
			 Log.info("Actual middleName does NOT ContIns Expected middleName = Fail");
		}
		
	}
	
	
	//<input value="Akhi" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
	
	@FindBy(id="personal_txtEmpLastName")
WebElement lastNameDetailsPropery;
	
	public void lastNameDetailsFunctionality() throws IOException
	{
		String lastName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 16);
		String expected_lastNameDetailsText=lastName;
		Log.info(expected_lastNameDetailsText);
		String actual_lastNameDetailsText=middleNameDetailsPropery.getText();
		excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 26, actual_lastNameDetailsText);
		Log.info(actual_lastNameDetailsText);
		
		if(actual_lastNameDetailsText.equals(expected_lastNameDetailsText))
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 27, "Actual name Match with Expected Name");
		 Log.info("Actual lastName ContIns Expected lastName = Pass");
		}
		else
		{
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 27, "Actual name Match with Expected Name");
			 Log.info("Actual lastName does NOT ContIns Expected lastName = Fail");
		}
		
	}
	
	
	//<input value="0062" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
	
	@FindBy(id="personal_txtEmployeeId")
	WebElement employeeidDetailsProperty;
	
	public void employeeIdDetailsFunctionality() throws IOException
	{
		String employeeID=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 17);
		String expected_EmployeeIdDetails=employeeID;
		Log.info(expected_EmployeeIdDetails);
		String actual_EmployeeIdDetails=employeeidDetailsProperty.getAttribute("value");
		excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 28, actual_EmployeeIdDetails);
		Log.info(actual_EmployeeIdDetails);
	  if(actual_EmployeeIdDetails.equals(actual_EmployeeIdDetails)) 
	   {
		  excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 29, "Actual name Match with Expected Name");
		Log.info("Actual Employee ID is Matched With expected ID=Pass");
	   }
	   else   
	   {
		   excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 27, "Actual name NOT Match with Expected Name");
		   Log.info("Actual Employee ID is NOT Matched With expected ID=Pass");
		
	    }
	
	}
	
	
	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	
	@FindBy(id="welcome")
	WebElement welcomeAdminProperty;
	
	public void wecomeAdminFunctionality()
	{
		welcomeAdminProperty.click();
	}
	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	
	@FindBy(linkText="Logout")
	WebElement logoutProperty;
	
	public void logoutFunctionality()
	{
		logoutProperty.click();
	}
	
	
	//<div id="logInPanelHeading">LOGIN Panel</div>
	
		@FindBy(id="logInPanelHeading")
		WebElement loginpanelText;
		
		public void afterLogoutLoginPanelTextFunctionality() throws IOException
		{
			String loginpanelName=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 0);
			
			String expected_OrangeHRMApplicationLogInPageText=loginpanelName;
			
			Log.info(" The expected Text of the OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);


			String actual_OrangeHRMApplicationLogInPageText=loginpanelText.getText();
			
			
			excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 28, actual_OrangeHRMApplicationLogInPageText);
			
			Log.info(" The actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPageText);
			
			if(actual_OrangeHRMApplicationLogInPageText.equals(actual_OrangeHRMApplicationLogInPageText))
			{
				excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 29, " OrangeHRM Application LogIn Page Text Validation Successfull - PASS ");
				
				Log.info(" OrangeHRM Application LogIn Page Text Validation Successfull - PASS ");
			}
			else
			{
				excel.setRowOfCellValue("./src/main/java/com/ExcelFiles/AddEmployee.xlsx", "Sheet1", 1, 29, " OrangeHRM Application LogIn Page Text Validation UNSuccessfull - FAIL ");
				
			Log.info(" OrangeHRM Application LogIn Page Text Validation UNSuccessfull - FAIL ");
			}
			
		}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
