package com.pageexe;

import com.base.BaseClass;
import com.locate.SelectHotel_Locators_PageFactory;

public class SelectHotel_PageExe_PageFactory extends SelectHotel_Locators_PageFactory {
	
	public static void radioButton() {
		BaseClass.buttonClick(new SelectHotel_Locators_PageFactory().getRadioButton());
	}
	
	public static void continueBtn() {
		BaseClass.buttonClick(new SelectHotel_Locators_PageFactory().getcontinue());
	}

}
