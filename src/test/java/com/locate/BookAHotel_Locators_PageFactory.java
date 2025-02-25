package com.locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageexe.SelectHotel_PageExe_PageFactory;

public class BookAHotel_Locators_PageFactory extends SelectHotel_PageExe_PageFactory {
	
	public BookAHotel_Locators_PageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccNum;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(className = "reg_button")
	private WebElement regbutn;

	@FindBy(xpath = "//input[@id='order_no']")
	private WebElement orderid;
	
	
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	public  WebElement getLastName() {
		return lastName;
	}
	
		
	public  WebElement getAddress() {
		return address;
	}
	
	public  WebElement getNum() {
		return ccNum;
	}
	
	public  WebElement getccType() {
		return cctype;
	}
	
	public  WebElement getccExp() {
		return expmonth;
	}
	public  WebElement getExpYr() {
		return expYear;
	}
	
	public  WebElement getccCvv() {
		return cvv;
	}
	public  WebElement getRegButton() {
		return regbutn;
	}
	public  WebElement getOrderId() {
		return orderid;
	}
}
