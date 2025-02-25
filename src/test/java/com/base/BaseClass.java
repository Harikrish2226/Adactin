	package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = null;
	public static Actions action = null;

	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void inputData(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void buttonClick(WebElement element) {
		element.click();
	}

	public static void ddByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public static void ddByText(WebElement element, String vtext) {
		Select sel = new Select(element);
		sel.selectByVisibleText(vtext);
	}

	public static void ddByindex(WebElement element, int ivalue) {
		Select sel = new Select(element);
		sel.selectByIndex(ivalue);
	}

	public static void clearAndInput(WebElement element, String data) {
		element.clear();
		element.sendKeys(data);
	}

	public static void mouseMovement(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).click().perform();
	}

	public static String attributeVal(WebElement element, String name) {
		String attval = element.getAttribute(name);
		System.out.println(attval);
		return attval;

	}

	public static void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void scrollBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Thread.sleep(5000);
		js.executeScript("window.scroll(0,3000)");
		// Thread.sleep(5000);

	}

	public static String readProp_reuseable(String data) {
		String value = null;
		try {
			File file = new File(
					"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\config.properties");

			FileReader reader = new FileReader(file);
			Properties prop = new Properties();
			prop.load(reader);
			value = prop.getProperty(data);
			// System.out.println(value);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static String excelAllData_reuseble(int i, int j) {
		String value = null;
		try {
			File file = new File(
					"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\TestExcel.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);

			Sheet sheet = wb.getSheet("Hotel Booking");

			Row row = sheet.getRow(i);

			Cell cell = row.getCell(j);

			int cellType = cell.getCellType();

			if (cellType == 1) {
				value = cell.getStringCellValue();
				// System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateVal = cell.getDateCellValue();
					SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
					value = sd.format(dateVal);
					// System.out.println(value);
				} else {
					double numVal = cell.getNumericCellValue();
					long l = (long) numVal;
					value = String.valueOf(l);
					// System.out.println(value);

				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void excelWrite(String sheetname, String attname) {

		try {
			File file = new File(
					"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\TestExcel.xlsx");

			FileInputStream fis = new FileInputStream(file);

			Workbook wb = new XSSFWorkbook(fis);

			Sheet sheet = wb.createSheet(sheetname);

			Row row = sheet.createRow(0);

			Cell cell = row.createCell(0);
			cell.setCellValue(attname);

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

}
