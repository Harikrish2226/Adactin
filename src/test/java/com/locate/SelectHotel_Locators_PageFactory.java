package com.locate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageexe.SearchHotels_PageExe_PageFactory;

public class SelectHotel_Locators_PageFactory extends  SearchHotels_PageExe_PageFactory {
	
	public SelectHotel_Locators_PageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continu;
	
	public WebElement getRadioButton() {
	return radiobutton;
	}

	public WebElement getcontinue() {
		return continu;
		}
}
