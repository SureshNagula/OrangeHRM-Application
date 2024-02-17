package com.WebTable_Names;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CpaturingAllCountry_Names {

	
	WebDriver driver;
	String applicatinurladdress="https://www.timeanddate.com/worldclock/";
	
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.MINUTES);
		driver.get(applicatinurladdress);
	}
	
	
	
	public void test() throws IOException
	{
		
		//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[8]
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[8]
		///html/body/div[5]/section[1]/div
		///html/body/div[5]/section[1]/div/section/div[1]/div
		///html/body/div[5]/section[1]/div/section/div[1]/div/table
		///html/body/div[5]/section[1]/div/section/div[1]
		
		
		///html/body/div[5]/section[1]/div/section
		
		By webtableproperty=By.xpath("html/body/div[5]/section[1]/div");
		WebElement webtabless=driver.findElement(webtableproperty);
		
		By testdataofrow=By.tagName("tr");
		List<WebElement>webtable=webtabless.findElements(testdataofrow);
		int tablesize=webtable.size();
		
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
			System.out.print(names+" | ");
			
			
		}
System.out.println();
		
		}
		/*
		
	for(int rowindex=1;rowindex<=ttt;rowindex++)
	{
		System.out.println("22222");
		
			
		By countryproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+rowofcell+"]");
			WebElement testdatanames=driver.findElement(countryproperty);
			String names=testdatanames.getText();
			System.out.print(names+" | ");
		
		}
		System.out.println();
		
		}
		*/
		
}
	
	public static void main(String[] args) throws IOException {
		CpaturingAllCountry_Names names= new CpaturingAllCountry_Names();
		names.launchbrowser();
		names.test();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
