package com.Gmail_Compose;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base_Test {
	
	WebDriver driver;
	String applicationurladress="https://demo.automationtesting.in/Register.html";

	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationurladress);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

@AfterTest
	public void teardown()
	{
		driver.quit();
	}

@Test
  public void login() throws InterruptedException, IOException {
	  ///html/body/section/div/div/div[2]/form/div[2]/div/textarea
	//<textarea rows="3" class="form-control ng-pristine ng-valid ng-touched" ng-model="Adress"> </textarea>
	  //<div class="col-md-4 col-xs-4 col-sm-4">               <input type="text" placeholder="First Name" class="form-control ng-pristine ng-untouched ng-invalid ng-invalid-required" ng-model="FirstName" required="">                </div>
	  //<input type="text" placeholder="First Name" class="form-control ng-pristine ng-untouched ng-invalid ng-invalid-required" ng-model="FirstName" required="">
	//<input id="imagesrc" type="file" style=" margin-top: 10px!important; " onchange="uploadimg()">
	  //<div class="col-xs-6 col-xs-offset-6">
     // <input id="imagesrc" type="file" style=" margin-top: 10px!important; " onchange="uploadimg()">
 // </div>
	  //<div class="col-xs-6 col-xs-offset-6">
     // <input id="imagesrc" type="file" style=" margin-top: 10px!important; " onchange="uploadimg()">
  //</div>
	//By usernameproperty=By.id("imagesrc");
	  //<img id="imagetrgt" style="width:120px !important;height:120px!important; " src="original.png">
	  By imageproperty=By.xpath("html/body/section/div/div/div[2]/form/div[2]/div/textarea");
	 WebElement image=driver.findElement(imageproperty);
	 
	// String hh=image.getText();
	 //System.out.println(hh);
	 image.click();
	 Actions keyboard = new Actions(driver);
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	keyboard.sendKeys(Keys.TAB).build().perform();
	   	Thread.sleep(10000);
	 	keyboard.sendKeys(Keys.ENTER).build().perform();
	 	java.lang.Runtime.getRuntime().exec("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\autoitscript\\autoit.exe");
	   	
	   	Thread.sleep(10000);
	   	keyboard.sendKeys(Keys.ENTER).build().perform();
	   	
	 //<div class="col-xs-6 col-xs-offset-6">
  //   <input id="imagesrc" type="file" style=" margin-top: 10px!important; " onchange="uploadimg()">
// </div>
  
    /*
    Actions keyboard = new Actions(driver);
   	keyboard.sendKeys(Keys.ENTER).build().perform();
   	
  // username.click();
   System.out.println("hhhhhhh");
   Actions keyboardj = new Actions(driver);
	keyboardj.sendKeys(Keys.TAB).build().perform();
	keyboard.sendKeys(Keys.TAB).build().perform();
	keyboard.sendKeys(Keys.TAB).build().perform();
	keyboard.sendKeys(Keys.ENTER).build().perform();
	
     */
    
}

public static void main(String[] args) throws InterruptedException, IOException {
	Base_Test drive = new Base_Test();
	drive.setup();
	drive.login();
}
}
