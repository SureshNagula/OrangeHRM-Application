package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertWindowClick {

	WebDriver driver;
	String tsrtc ="https://www.tsrtconline.in/oprs-web/";
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./broserDriveFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(tsrtc);
	}
	
	public void  popwindow() {
		
		//<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
		
		By checkavalabilityproperty=By.id("searchBtn");
		WebElement check=driver.findElement(checkavalabilityproperty);	
		check.click();
	}
	
	public void popupwindoclick() {
		
		Alert alertwindow=driver.switchTo().alert();
		
		String expectedalerttext="please select start place.";
	
		String actualalerttext=alertwindow.getText();
		System.out.println("the actual text of alert window"+actualalerttext);
		if(actualalerttext.equals(expectedalerttext))
		{
			System.out.println("the expected text  matching with actual text");
		}
		else
		{
			System.out.println("the expected text not matching with actual text");
		}
		
		alertwindow.accept();
	}

	public static void main(String[] args) {
		AlertWindowClick click = new AlertWindowClick();
		click.setup();
		click.popwindow();
		click.popupwindoclick();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
