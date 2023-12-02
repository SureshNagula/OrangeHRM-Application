package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadMultipleDta {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub

	FileInputStream testdata = new FileInputStream("./src/com/Excel/TestingExcel.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(testdata);
		
		
		
		XSSFSheet testDataSheet =workbook.getSheet("Sheet2");
		
		int testDataRowCount=testDataSheet.getLastRowNum();
		
		for(int rowindex=0;rowindex<=testDataRowCount;rowindex++)
		{
			Row testdataRow=testDataSheet.getRow(rowindex);
			
			int testDataCellCount =testdataRow.getLastCellNum();
			
			for(int cellindex=0;cellindex<testDataCellCount;cellindex++)
			{
				Cell testDataOfCell=testdataRow.getCell(cellindex);		
				
				String testData=testDataOfCell.getStringCellValue();
				
				System.out.print(testData);
				
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
	}
