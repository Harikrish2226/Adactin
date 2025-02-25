package com.exe;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.base.BaseClass;
import com.pageexe.BookAHotel_PageExe_PageFactory;

public class EXE_PageFactory extends BookAHotel_PageExe_PageFactory {

	public static void main(String[] args) {
		BaseClass.browserLaunch(BaseClass.readProp_reuseable("url"));
		userName();
		password();
		logIn();
		location();
		hotel();
		roomType();
		noOfRoom();
		checkIn();
		checkOut();
		adultsCount();
		childsCount();
		search();
		radioButton();
		continueBtn();
		firstName();
		lastName();
		address();
		cardNo();
		cardType();
		expiryDate();
		expiryYear();
		cvvNo();
		book();
		scroll();
		waitt();
		orderId();
		waitt();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	
		  Date d = new Date();
		  SimpleDateFormat sd = new   SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		 
		 String date = sd.format(d);
		 
		
		File des= new File("D:\\Java\\snap" + date +".jpeg");
		
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
