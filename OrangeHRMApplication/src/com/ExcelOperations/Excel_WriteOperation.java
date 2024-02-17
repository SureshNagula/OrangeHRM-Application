package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream testDataFile = new FileInputStream("./src/com/Excel/TestingExcel.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(testDataFile);
		
		XSSFSheet testDataSheet=workbook.getSheet("Sheet1");
		 
		
		 Row newTestDataRow=testDataSheet.createRow(4);
		
		Cell newTestDataRowOfCell=newTestDataRow.createCell(4);
		
		
		newTestDataRowOfCell.setCellValue("Functional Testing");
		
		FileOutputStream testResultFile = new FileOutputStream("./src/com/Excel/TestingExcel.xlsx");
		
		workbook.write(testResultFile);
		
		
		
	}

}
