package com.FileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Base_Test.Base_Test;
import com.Utility.Log;

public class ExcelInput {

	public void tst() throws IOException
	{
		Excel_Iput_Path excel = new Excel_Iput_Path();
		excel.getRowOfCellValue(null, null, 1, 0);
	}
	
	
	
	/*
 * 
 * 
 * 
	public static Logger ad=Logger.getLogger("ExcelInput");
	
	public  void some(String file,String workbook,String sheet)
	{
		
		PropertyConfigurator.configure("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\ExcelInputFile\\OrangeHRMExcel.xlsx");
		
		ad.info(file);
		ad.info(sheet);
		ad.info(workbook);
		
	}
	
	
	@SuppressWarnings("resource")
	public static void some(FileInputStream testfile,XSSFWorkbook workbook,XSSFSheet testdatasheet) throws IOException
	{
		
	   new FileInputStream("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\ExcelInputFile\\OrangeHRMExcel.xlsx");
		new XSSFWorkbook(testfile);
		 workbook.getSheet("Sheet1");
		 //Logger testdata=Logger.getLogger("ExcelInput");
		//	PropertyConfigurator.configure("hh");
			//testdata.info(testdata);
		 //ExcelInput ex=new ExcelInput();
		 
		
	}

*/
public static void some(FileInputStream testfile,XSSFWorkbook workbook,XSSFSheet testdatasheet) throws IOException 
{
	 new FileInputStream("C:\\Users\\rajalingam\\Desktop\\OrangeHRMApplication\\MavenProject\\src\\main\\java\\com\\ExcelInputFile\\OrangeHRMExcel.xlsx");
	 new XSSFWorkbook(testfile);
	 workbook.getSheet("Sheet1");
	 
	 ExcelInput ex=new ExcelInput();
	
	ExcelInput.some(testfile, workbook, testdatasheet);
	ExcelInput.some(testfile, workbook, testdatasheet);
	
}
public void some(XSSFWorkbook workbook) throws IOException 
{
	ExcelInput ex=new ExcelInput();
	ex.some(workbook);
	
}

//public void some(XSSFSheet testdatasheet) throws IOException 
{
	//ExcelInput ex=new ExcelInput();
	//ex.some(testdatasheet);
	
}
}
/*
public static void info(String message)
{
	Logger log=Logger.getLogger("Log");
	PropertyConfigurator.configure("Log4j.properties");
	log.info(message);
	
*/