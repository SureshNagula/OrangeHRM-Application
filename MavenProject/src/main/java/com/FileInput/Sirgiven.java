package com.FileInput;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.crypto.Data;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Sirgiven extends Excel_Iput_Path {

	       // Creating a UserDefined Method - with parameters

	       public static String getData(String fileName,int row, int cell) throws IOException{

	       // Identifying the path of the Location of the File - saving into a variable

	              String filePath="./src/main/java/com/ExcelInputFile/"+fileName+".xlsx";

	              // Identifying the file of the System

	              FileInputStream file = new FileInputStream(filePath);

	              // Identifying the workBook of the file

	              XSSFWorkbook workBook = new XSSFWorkbook(file);

	              // Identify the Sheet of the workBook

	              XSSFSheet sheet = workBook.getSheet("Sheet1");

	              // from the sheet getting the row of a cell value - saved into a variable

	              String testData=sheet.getRow(row).getCell(cell).getStringCellValue();

	              // method returns a string value - testData

	              return testData;

	       }

	       public static void main(String[] args) throws IOException {

	              // using the class - getting single Test data

	              String data=Sirgiven.getData("OrangeHRMExcel", 1, 1);

	              System.out.println(data);    

	       }

	 
	       
	}



