package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// to read a file
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\DataDriven\\DataDriven.xlsx");

		// to read file data value
		FileInputStream fis = new FileInputStream(f);

		// to read excel sheet
		Workbook wb = new XSSFWorkbook(fis);
		
		//create sheet
		Sheet createSheet = wb.createSheet("Data");
		
		//create row
		Row createRow = createSheet.createRow(0);
		
		//createcell
		Cell createCell = createRow.createCell(0);
		
		//set cell values
		createCell.setCellValue("User Data");
		
		//set value sin secound cell
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("User Password");
		
		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("Swathy");
		
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue("Swa123");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		//write
		wb.write(fos);
		
		//close
		wb.close();
		
		System.out.println("Data Sheet createed successfully");
		
		
		

	}

}
