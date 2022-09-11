package com.norka.Excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	
	public static XSSFWorkbook ExcelWorkBook;
	public static XSSFSheet	ExcelSheet;
	
	public static String getcelldata(int rowno,int cellno) throws IOException {
		FileInputStream Sheet = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources"+"/testData.xlsx");
		ExcelWorkBook= new XSSFWorkbook(Sheet);
		ExcelSheet= ExcelWorkBook.getSheetAt(0);
		return ExcelSheet.getRow(rowno).getCell(cellno).getStringCellValue();
		
	}
	public static double getcelldata1(int rowno,int cellno) throws IOException {
		FileInputStream Sheet = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources"+"/testData.xlsx");
		ExcelWorkBook= new XSSFWorkbook(Sheet);
		ExcelSheet= ExcelWorkBook.getSheetAt(0);
		return ExcelSheet.getRow(rowno).getCell(cellno).getNumericCellValue();
		
	}

}
