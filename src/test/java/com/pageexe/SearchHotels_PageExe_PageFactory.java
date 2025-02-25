package com.pageexe;

import com.base.BaseClass;

import com.locate.SearchHotels_Locators_PageFactory;



public class SearchHotels_PageExe_PageFactory extends SearchHotels_Locators_PageFactory {
	
	public static void location() {
		BaseClass.ddByValue(new SearchHotels_Locators_PageFactory().getLocation(), BaseClass.excelAllData_reuseble(0, 1));
	}

	public static void hotel() {
		BaseClass.ddByValue(new SearchHotels_Locators_PageFactory().getHotel(), BaseClass.excelAllData_reuseble(1, 1));
	}
	
	public static void roomType() {
		BaseClass.ddByValue(new SearchHotels_Locators_PageFactory().getRoomType(), BaseClass.excelAllData_reuseble(2, 1));
	}
	
	public static void noOfRoom() {
		BaseClass.ddByValue(new SearchHotels_Locators_PageFactory().getNoOfRooms(), BaseClass.excelAllData_reuseble(3, 1));
	}
	public static void checkIn() {
	BaseClass.clearAndInput(new SearchHotels_Locators_PageFactory().getCheckIn(), BaseClass.excelAllData_reuseble(4, 1));
	}
	
	public static void checkOut() {
		BaseClass.clearAndInput(new SearchHotels_Locators_PageFactory().getCheckOut(), BaseClass.excelAllData_reuseble(5, 1));
	}
	
	public static void adultsCount() {
		BaseClass.ddByValue(new SearchHotels_Locators_PageFactory().getAdultCount(), BaseClass.excelAllData_reuseble(6, 1));
	}
	
	public static void childsCount() {
		BaseClass.ddByValue(new SearchHotels_Locators_PageFactory().getChildCount(), BaseClass.excelAllData_reuseble(7, 1));
	}
	
	public static void search() {
		BaseClass.buttonClick(new SearchHotels_Locators_PageFactory().getsearch());
	}
	
}
