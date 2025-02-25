package com.locate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage_Locators_PageFactory extends BaseClass {
	
	public LoginPage_Locators_PageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	private WebElement userName;
	
	
	@FindBy(id ="password")
	
	private WebElement passWord; 
	
	@FindBy(id ="login")
	private WebElement logIn;
	
	
	public WebElement getuserName() {
		return userName;
	}
	
	public WebElement getPassword() {
		return passWord;
	}
	
	public WebElement getLogin() {
		return logIn;
	}
	
	
	/*
	 * public static WebElement getContiue() { return
	 * driver.findElement(By.id("continue")); }
	 */


	

}
