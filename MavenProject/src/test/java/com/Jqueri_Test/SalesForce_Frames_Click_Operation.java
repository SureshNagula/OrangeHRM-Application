package com.Jqueri_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Base_Test.SalesForce_BaseTest;

public class SalesForce_Frames_Click_Operation extends SalesForce_BaseTest{


	@Test
	public void dragAndDropTest()
	{

/*
	// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
	// Identifying the Frame of the WebPage
	By webPageFrameProperty=By.xpath("//div[@class='form-container-v2 sfdc-form-day sfdc-form-closed sfdc-form-small bg-default ']");
	WebElement webPageFrame=driver.findElement(webPageFrameProperty);

	// getting into the Frame of the WebPage - to identify the element in the Frame

	driver.switchTo().frame(webPageFrame);
*/
	By firstnameProperty=By.name("CompanyCountry");
	WebElement first=driver.findElement(firstnameProperty);
      
	Select languageselection = new Select(first);
	languageselection.selectByIndex(2);
	
	By linkstagproperty=By.tagName("option");
	List<WebElement> alllanguages=first.findElements(linkstagproperty);
	//List<WebElement> alllanguages=option.getAllSelectedOptions();
	int namescount=alllanguages.size();
	
	System.out.println(namescount);
	

	
	
	}
	
}
