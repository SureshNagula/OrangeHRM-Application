package com.OrangeHRMApplicationTestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BaseTest.Base_Test;
import com.ExcelOperationsTestDataFiles.Excel_InPut_OutPut;
import com.OrangeHRMApplicationWebPages.OrangeHRMLoginPage;

public class OrangeHRMLoginPageTest extends Base_Test{
	
	@Test(priority=1)
	public void currentURLFunctionalityTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.currentURLFunctionality();
	}
	
	@Test(priority=2)
	public void OrangeHRMLoginPageTitleTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.OrangeHRMLoginPageTitle();
	}
	
	@Test(priority=3)
	public void LoginpaneltextvalidationTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
	
		loginpagetest.Loginpaneltextvalidation();
	}
	
	@Test(priority=4)
	public void orangeHRMLogoValidationTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.orangeHRMLogoValidation();
		
	}
	
	
	@Test(priority=13)
	public void userNameFunctionalTest() throws IOException
	{
		
		Excel_InPut_OutPut excel = new Excel_InPut_OutPut();
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		String name=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/OrangeHRMExcel.xlsx", "Sheet1", 1, 0);
		loginpagetest.userNameFunctional(name);
		
	}
	@Test(priority=14)
	public void passwordfunctionalityTest() throws IOException
	{
		Excel_InPut_OutPut excel = new Excel_InPut_OutPut();
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		String password=excel.getRowOfCellValue("./src/main/java/com/ExcelFiles/OrangeHRMExcel.xlsx", "Sheet1", 1, 1);
		loginpagetest.passwordfunctionality(password);
		
	}
	
	@Test(priority=15)
	public void loginclickfunctionalityTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.loginclickfunctionality();
	}
	
	@Test(priority=16)
	public void tabfunctionalityTest() {
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.tabfunctionality();
	}
	
	@Test(priority=8)
	public void alternateLoginFunctionaitytext(){
		{
			OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
			loginpagetest.alternateLoginFunctionaitytext();
		}
	}
	
	@Test(priority=9)
	public void selectfunchtionalityTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.selectfunchtionality();
		
		
	}

	@Test(priority=10)
	
	public void downlevelLoginTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.downlevelLogin();
	}
	
	@Test(priority=11)
	public void urllingbottomloginpageTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.urllingbottomloginpage();
	}
	
	@Test(priority=12)
	public void linkdinLinkFunctionalityTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.linkdinLinkFunctionality();
	}
	
	
	@Test(priority=5)
	public void faceBookLinkFunctionalityTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.faceBookLinkFunctionality();
	}
	
	
	@Test(priority=6)
	public void twitterlinkFunctionalityTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.twitterlinkFunctionality();
	}
	
	@Test(priority=7)
	public void youTubelinkFunctionalityTest()
	{
		OrangeHRMLoginPage loginpagetest = new OrangeHRMLoginPage();
		loginpagetest.youTubelinkFunctionality();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
