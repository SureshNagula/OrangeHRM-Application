package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadSingleTestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		FileInputStream testDataFile = new FileInputStream("./src/com/Excel/TestingExcel.xlsx.");
		
		XSSFWorkbook workbook = new XSSFWorkbook(testDataFile);
		
		XSSFSheet testDataSheet =workbook.getSheet("Sheet1");
		
		Row testDataRow=testDataSheet.getRow(0);
		
		Cell testDatarowOfCell=testDataRow.getCell(0);
		
		String testData=testDatarowOfCell.getStringCellValue();
		
		System.out.println(testDatarowOfCell);
		
		Row secondTestDataRow=testDataSheet.getRow(2);
		
		 Cell secondtestDatarowOfCell=secondTestDataRow.getCell(2);
		 
		 String secondTestData=secondtestDatarowOfCell.getStringCellValue();
		 
		 
		 System.out.println(secondTestData);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
