package com.EchoEchoPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class EchoEchoPage extends BaseTest {
	
	
	public EchoEchoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td")
	WebElement tagname;

	@FindBy(xpath="/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]")
	WebElement milkProperty;
	public void milkFunctionality()
	{
		milkProperty.click();
		
	}
	
	@FindBy(xpath="/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[2]")
    WebElement butterProperty;
	public void butterFunctionality()
	{
		butterProperty.click();
		
	}
	
	@FindBy(xpath="/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[3]")
    WebElement cheesProperty;
	public void cheesFunctionality()
	{
		cheesProperty.click();
		
	}
	
	
	@FindBy(xpath="/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[4]")
	WebElement waterProperty;
    public void waterFunctionality()
    {
	waterProperty.click();
			
	}
	
    
	@FindBy(xpath="/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[5]")
	WebElement beerProperty;
    public void beerFunctionality()
    {
	beerProperty.click();
			
	}
	
    
    @FindBy(xpath="/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[6]")
	WebElement wineProperty;
    public void wineFunctionality()
    {
	wineProperty.click();
			
	}
	
    
    
    
    
    
    
    //<input type="radio" name="group1" value="Milk">
    //<input type="radio" name="group1" value="Butter" checked="">
  
   
	
	
	
	
	
	
	
	
	
	
}
