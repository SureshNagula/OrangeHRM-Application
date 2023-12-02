package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePurpose {
  public static void main(String[] args) throws InterruptedException {
	

	   WebDriver driver;
	   
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		
		 driver.navigate().to("https://echoecho.com/htmlforms10.htm");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   //<input type="radio" name="group1" value="Milk">
	   //<input type="radio" name="group1" value="Butter" checked="">
		//<input type="radio" name="group2" value="Water">
		
		By group1RadioButtonsProperty=By.name("group1");
		List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonsProperty);
		
		By group2RadioButtonsProperty=By.name("group2");
		List<WebElement>group1RadioButtonss=driver.findElements(group2RadioButtonsProperty);
		

		
		for(int group1RadioButtonsindexClick=0;group1RadioButtonsindexClick<group1RadioButtons.size();group1RadioButtonsindexClick++)
		{
			group1RadioButtonss.get(group1RadioButtonsindexClick).click();
		group1RadioButtons.get(group1RadioButtonsindexClick).click();

		 Thread.sleep(5000);
		
		for(int group1RadioButtonsStatusIndex=0;group1RadioButtonsStatusIndex<group1RadioButtons.size();group1RadioButtonsStatusIndex++)
		{
		 System.out.print(group1RadioButtons.get(group1RadioButtonsStatusIndex).getAttribute("value")+" - ");
		 System.out.println(group1RadioButtons.get(group1RadioButtonsStatusIndex).getAttribute("checked"));
		 
		 System.out.println();

		 System.out.print(group1RadioButtonss.get(group1RadioButtonsStatusIndex).getAttribute("value")+" - ");
		 System.out.println(group1RadioButtonss.get(group1RadioButtonsStatusIndex).getAttribute("checked"));
		

		
		}

		System.out.println();
	
		}

		
		}

		}

/*
		
	   By group1property=By.name("group1");
	   List<WebElement>names=chromeBrowser.findElements(group1property);
	   
	   int radiobutton=names.size();
	   
	   for(int linkindex=0;linkindex<=radiobutton;linkindex++)
	   {
		   names.get(linkindex).click();
		   
		   Thread.sleep(5000);
		
		  
		 for(int radio=0;radio<radiobutton;radio++)
		 {
			  String  buttonnames=names.get(radio).getAttribute("value");
			 names.get(linkindex).getAttribute("checked");
		 }
		  
		  System.out.println();
	   }
	   
	   
	   
}

}
*/