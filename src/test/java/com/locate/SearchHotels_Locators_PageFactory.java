package com.locate;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageexe.LoginPage_PageExe_PageFactory;

public class SearchHotels_Locators_PageFactory extends LoginPage_PageExe_PageFactory {

	public SearchHotels_Locators_PageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement noOfRooms;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkIn;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkOut;

	@FindBy(id = "adult_room")
	private WebElement adultCount;

	@FindBy(id = "child_room")
	private WebElement childCount;

	@FindBy(id = "Submit")
	private WebElement submitBtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomtype;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultCount() {
		return adultCount;
	}

	public WebElement getChildCount() {
		return childCount;
	}

	public WebElement getsearch() {
		return submitBtn;
	}

}
