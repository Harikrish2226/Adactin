package com.sam;

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

public class ExcelRead {

	public static void readExcel() {

		try {
			File file = new File(
					"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\TestExcel.xlsx");

			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(2);
			System.out.println(cell);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void dateFormat() {

		Date d = new Date();
		System.out.println("Before format: " + d);
		SimpleDateFormat sm = new SimpleDateFormat("dd.MM.yyyy");
		String format = sm.format(d);
		System.out.println("After Format: " + format);
	}

	public static void excelAllData() {

		try {
			File file = new File(
					"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\TestExcel.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);

			Sheet sheet = wb.getSheet("Sheet1");

			int pnor = sheet.getPhysicalNumberOfRows();

			for (int i = 0; i < pnor; i++) {
				Row row = sheet.getRow(i);
				int pnoc = row.getPhysicalNumberOfCells();

				for (int j = 0; j < pnoc; j++) {
					Cell cell = row.getCell(j);

					int cellType = cell.getCellType();

					if (cellType == 1) {
						String stringcellVal = cell.getStringCellValue();
						System.out.println(stringcellVal);
					} else if (cellType == 0) {
						if (DateUtil.isCellDateFormatted(cell)) {
							Date dateVal = cell.getDateCellValue();
							SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
							String date = sd.format(dateVal);
							System.out.println(date);
						} else {
							double numVal = cell.getNumericCellValue();
							long l = (long) numVal;
							String num = String.valueOf(l);
							System.out.println(num);
						}

					}
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String excelAllData_reuseble(int i, int j) {
		String value = null;
		try {
			File file = new File(
					"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\TestExcel.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);

			Sheet sheet = wb.getSheet("Sheet1");

			Row row = sheet.getRow(i);

			Cell cell = row.getCell(j);

			int cellType = cell.getCellType();

			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateVal = cell.getDateCellValue();
					SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
					value = sd.format(dateVal);
					System.out.println(value);
				} else {
					double numVal = cell.getNumericCellValue();
					long l = (long) numVal;
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

	public static void excelWrite() {

		try {
			File file = new File(
					"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\TestExcel.xlsx");

			FileInputStream fis = new FileInputStream(file);

			Workbook wb = new XSSFWorkbook(fis);

			Sheet sheet = wb.createSheet("Hari");

			Row row = sheet.createRow(0);

			Cell cell = row.createCell(0);
			cell.setCellValue("Krish");

			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			wb.close();
			System.out.println("completed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void excelCellVal_modify() {
		
		try {
			File file = new File("C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\TestExcel.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Hari");
	Row row =	sheet.getRow(0);
	Cell cell = row.getCell(0);
	String cellVal = cell.getStringCellValue();
	if(cellVal.equals("Krish"))
		cell.setCellValue("Chezhiyan");
	
	FileOutputStream fos = new FileOutputStream(file);
	wb.write(fos);
	wb.close();
	System.out.println("Modified");
	
	
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		// readExcel();
		// excelAllData();
		// excelAllData_reuseble(1, 2);
		//excelWrite();
		excelCellVal_modify();

	}
}
