package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static void main(String[] args) throws Throwable {
		
		//to read a file
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\DataDriven\\DataDriven.xlsx");
		
		//to read file data values
		FileInputStream fis = new FileInputStream(f);
		
		//to read a excel sheet
		Workbook wb = new XSSFWorkbook(fis);
		
		//table/th/tr/tc
		//sheet//rows/columns//data
		Sheet sheetAt = wb.getSheetAt(0);
		int row = sheetAt.getPhysicalNumberOfRows();
		
		//get data using nested for loop
		for (int i = 0; i < row; i++) {
			Row row2 = sheetAt.getRow(i);
			int col = row2.getPhysicalNumberOfCells();
			
			for (int j = 0; j < col; j++) {
				Cell cell = row2.getCell(j);
				//Cell cell = row2.getCell(1)
				
				CellType cellType = cell.getCellType();
				 if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				 else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int value = (int) numericCellValue;
					System.out.println(value);
			
					/*double a = 10; - narrowing
					int b = (int) a;
					int b = double of int a;*/
				}
				
			}
			
			
			
		}
		
		
	}
	

}
