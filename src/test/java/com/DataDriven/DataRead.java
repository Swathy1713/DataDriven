package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {

	public static void main(String[] args) throws Throwable {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\DataDriven\\DataDriven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		//create sheet
		Sheet createSheet = wb.createSheet("Data Sheet");
		
		//create row
		Row createRow = createSheet.createRow(0);
		
		//createcol
		Cell createCell = createRow.createCell(0);
		
		//set cell values
		createCell.setCellValue("User Name");
		
		wb.getSheet("Data Sheet").getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("Data Sheet").createRow(1).createCell(0).setCellValue("Swathy12");
		
		wb.getSheet("Data Sheet").getRow(1).createCell(1).setCellValue("Swa123");
		
		wb.getSheet("Data Sheet").createRow(2).createCell(0).setCellValue("Gowdha");
		
		wb.getSheet("Data Sheet").getRow(2).createCell(1).setCellValue("Gowdha123");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		wb.close();
		
		System.out.println("Data create successfully");
		

	}

}
