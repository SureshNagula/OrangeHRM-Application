package com.TSRTCLinksTesting;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinksTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		String applicationUrlAdress = "https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver", ".");
		
		driver =new ChromeDriver();
		
		driver.get(applicationUrlAdress);
		
		// <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		
		//By enquiryProperty=By.linkText("Enquiry");
		/*
		By enquiryProperty=By.partialLinkText("Enqui");
		
		WebElement enquiry=driver.findElement(enquiryProperty);
		
		enquiry.click();
		
		// To find the Number of links on the Current WebPage
        */
		/*

		<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		<a href="#" onclick="populateSearch('5231', 'Hyderabad', '1386430615487', 'Bangalore');"> Hyderabad - Bangalore</a>
		<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
		<a href="/oprs-web/home/contactus.do" title="Contact Us">Contact Us</a>



		<input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">

		<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">

		*/


		// Whenever we work on a Group of Similar Type of Elements - look for a common property
		//  existing in the Elements Properties

		//the common property which is found in Group of similar Type of elements-links is anchor tag (a)

		By linksCommonProperty=By.tagName("a");
		//srini is arrayList
		List<WebElement>tSRTC_HomePageLinks=driver.findElements(linksCommonProperty);
		
	
         
		
        int tsrtc_HomePageLinksCount=tSRTC_HomePageLinks.size();		
       System.out.println(" The number of links on the TSRTC Application HomePage are :- "+tsrtc_HomePageLinksCount);
  
       /*
      String tSRTC_HomePageLinkName0= tSRTC_HomePageLinks.get(0).getText();
      
      System.out.println(tSRTC_HomePageLinkName0);
      
      
      String tSRTC_HomePageLinkName1 =tSRTC_HomePageLinks.get(1).getText();       

      System.out.println(tSRTC_HomePageLinkName1);
      */
       
       // for(int index=0;index<tsrtc_HomePageLinksCount;index++)
        //using tsrtc_HomePageLinksCount or tSRTC_HomePageLinks.size(); this also anything we can use
       for(int index=0;index<tSRTC_HomePageLinks.size();index++)
        {
        	String tSRTC_HomePageLinkName=tSRTC_HomePageLinks.get(index).getText();
        	System.out.println(index +"-"+tSRTC_HomePageLinkName);
        }
        driver.quit();
	}

}
