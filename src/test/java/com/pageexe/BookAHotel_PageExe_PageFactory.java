package com.pageexe;

import com.base.BaseClass;
import com.locate.BookAHotel_Locators_PageFactory;
import com.locate.SelectHotel_Locators_PageFactory;

public class BookAHotel_PageExe_PageFactory extends BookAHotel_Locators_PageFactory  {

	public static void firstName() {

		BaseClass.inputData(new BookAHotel_Locators_PageFactory().getFirstName(), BaseClass.excelAllData_reuseble(8, 1));
	}

	public static void lastName() {
		BaseClass.inputData(new BookAHotel_Locators_PageFactory().getLastName(), BaseClass.excelAllData_reuseble(9, 1));
	}

	public static void address() {
		BaseClass.inputData(new BookAHotel_Locators_PageFactory().getAddress(), BaseClass.excelAllData_reuseble(10, 1));
	}

	public static void cardNo() {
		BaseClass.inputData(new BookAHotel_Locators_PageFactory().getNum(), BaseClass.readProp_reuseable("cardnumber"));
	}

	public static void cardType() {
		BaseClass.ddByValue(new BookAHotel_Locators_PageFactory().getccType(), BaseClass.readProp_reuseable("cardtype"));
	}

	public static void expiryDate() {
		BaseClass.ddByValue(new BookAHotel_Locators_PageFactory().getccExp(), BaseClass.readProp_reuseable("expirymonth"));
	}

	public static void expiryYear() {
		BaseClass.ddByValue(new BookAHotel_Locators_PageFactory().getExpYr(), BaseClass.readProp_reuseable("expiryyear"));

	}

	public static void cvvNo() {
		BaseClass.inputData(new BookAHotel_Locators_PageFactory().getccCvv(), BaseClass.readProp_reuseable("cvvnumber"));
	}

	public static void book() {
		BaseClass.buttonClick(new BookAHotel_Locators_PageFactory().getRegButton());
	}
	
	public static void scroll() {
		BaseClass.scrollBy();
	}
	
	public static void waitt() {
		BaseClass.wait(5000);
	}
	
	public static void orderId() {
		BaseClass.excelWrite("god13", BaseClass.attributeVal(new BookAHotel_Locators_PageFactory().getOrderId(), "value"));
	}
	

}
