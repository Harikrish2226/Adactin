package com.workoutsample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Workout {

	public static void excelRead() {

		try {
			File file = new File(
					"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\TestExcel.xlsx");

			FileInputStream fis = new FileInputStream(file);

			Workbook wb = new XSSFWorkbook(fis);

			Sheet sheet = wb.getSheet("Hotel Booking");

			int pnor = sheet.getPhysicalNumberOfRows();

			for (int i = 0; i < pnor; i++) {
				Row row = sheet.getRow(i);

				int pnoc = row.getPhysicalNumberOfCells();
				for (int j = 0; j < pnoc; j++) {

					Cell cell = row.getCell(j);

					System.out.println(cell);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String excelRead(int i, int j, String path) {

		String value = null;
		try {
			File file = new File(
					"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\TestExcel.xlsx");

			FileInputStream fis = new FileInputStream(file);

			Workbook wb = new XSSFWorkbook(fis);

			Sheet sheet = wb.getSheet(path);

			Row row = sheet.getRow(i);

			Cell cell = row.getCell(j);

			@SuppressWarnings("deprecation")
			int cellType = cell.getCellType();
			if (cellType == 1) {

				value = cell.getStringCellValue();

				System.out.println(value);

			} else if (cellType == 0) {

				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCell = cell.getDateCellValue();

					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

					value = sdf.format(dateCell);

					System.out.println(value);
				} else {
					double db = cell.getNumericCellValue();

					long l = (long) db;

					value = String.valueOf(l);

					System.out.println(value);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}
	
	public static void excelWrite(int i, int j, String path) {
		
		try {
			File file = new File("C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\TestExcel.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			
		Sheet sheet =	wb.createSheet(path);
	Row row =	sheet.createRow(i);
	Cell cell =row.createCell(j);
	cell.setCellValue("Father");

	FileOutputStream fos = new FileOutputStream(file);
	wb.write(fos);
	wb.close();
	
	System.out.println("completed");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		//excelRead(0, 0, "Sheet2");
		// excelWrite(0, 0, "Sheet2");
		
	}

}
