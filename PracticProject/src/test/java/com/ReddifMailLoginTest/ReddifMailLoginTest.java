

package com.ReddifMailLoginTest;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.BaseTest.Base_Test;
import com.ReddifMailLogin.ReddifMailLogin;

public class ReddifMailLoginTest extends Base_Test {

	
	@Test(priority = 1)
	public void userNameLoginFunctionalityTest()
	{
		ReddifMailLogin login = new ReddifMailLogin();
		login.userNameLoginFunctionality();
		
	}
	

	@Test(priority = 2)
	public void passwordNameLoginFunctionalityTest()
	{
		ReddifMailLogin login = new ReddifMailLogin();
		login.passwordNameLoginFunctionality();
		
	}
	
	
	@Test(priority = 3)
	public void sighnInFunctionality()
	{
		ReddifMailLogin login = new ReddifMailLogin();
		login.sighnInFunctionality();
	}
	
}
