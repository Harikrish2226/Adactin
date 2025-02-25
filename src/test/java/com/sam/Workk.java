package com.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Workk {

	public static  void excelRead() throws IOException {

			File file = new File("C:\\Users\\Hari\\Downloads\\New folder (6)\\MyFirstProjet_PageFactory\\TestData\\Book1.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			Sheet sheet = wb.getSheet("Sheet1");

			int lastrow = sheet.getLastRowNum();

			short lastcell = sheet.getRow(0).getLastCellNum();

			String[][] val = new String[lastrow][lastcell];

			for (int i = 1; i < lastrow; i++) {
				Row row = sheet.getRow(i);

				for (int j = 0; j < lastcell; j++) {
					Cell cell = row.getCell(j);

					DataFormatter df = new DataFormatter();
					String data = df.formatCellValue(cell);
					//val[i - 1][j] = data;
					System.out.println(data);
				}
			}
	}

	public static void main(String[] args) throws IOException {
		// upload.click();
		excelRead();

	}

}
