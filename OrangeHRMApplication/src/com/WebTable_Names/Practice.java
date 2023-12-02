package com.WebTable_Names;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

public class Practice {

	
	
	WebDriver driver;
	String applicatinurladdress="https://www.timeanddate.com/worldclock/";
	
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./broserDriveFiles/chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.MINUTES);
		driver.get(applicatinurladdress);
	}
	
	
	
	public void test() throws IOException
	{
		
	for(int rowindex=1;rowindex<=36;rowindex++)
	{
		System.out.println("22222");
		
		for(int rowofcell=1;rowofcell<=8;rowofcell++)
		{
			///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
			
		By countryproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+rowofcell+"]");
			WebElement testdatanames=driver.findElement(countryproperty);
			String names=testdatanames.getText();
			Log.info(names+" | ");
			//System.out.print(names+" | ");
		/*
			FileInputStream testdatafile= new FileInputStream("./src/com/WebTable_Country_Name_Excel/country names.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(testdatafile);
			XSSFSheet testdatasheet =workbook.getSheet("Sheet1");
			Row testdataofrow=testdatasheet.getRow(rowindex);
			Cell rowofcellvalue=testdataofrow.createCell(rowofcell);
			
		     rowofcellvalue.setCellValue(names);
			
		     FileOutputStream w = new FileOutputStream("./src/com/WebTable_Country_Name_Excel/country names.xlsx");
			workbook.write(w);
		*/
		}
		System.out.println();
		
		}
}
	
	public static void main(String[] args) throws IOException {
		CpaturingAllCountry_Names names= new CpaturingAllCountry_Names();
		names.launchbrowser();
		names.test();
			
	}
	

}
