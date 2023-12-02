package com.WebTable_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Log;

public class WebTable_AllCountryNames extends Base_Test_WebTable{
	@Test
	public void webtable()
	{

		By webtableproperty=By.xpath("html/body/div[5]/section[1]/div");
		WebElement webtabless=driver.findElement(webtableproperty);
		
		By testdataofrow=By.tagName("tr");
		List<WebElement>webtable=webtabless.findElements(testdataofrow);
	
		
		for(int rowindex=1;rowindex<=webtable.size();rowindex++)
		{
			WebElement table=webtable.get(rowindex);

		
		By testdataofrowcell=By.tagName("td");
		
		List<WebElement>testdataofrowofcell=table.findElements(testdataofrowcell);
		
		for(int rowofcell=1;rowofcell<=testdataofrowofcell.size();rowofcell++)
		{
			By countryproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+rowofcell+"]");
			WebElement testdatanames=driver.findElement(countryproperty);
			String names=testdatanames.getText();
			Log.info(names);
			
				
		}
      
		Log.info("|");
		}

	}

}
