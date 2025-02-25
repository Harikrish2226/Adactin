package com.pageexe;

import com.base.BaseClass;

import com.locate.LoginPage_Locators_PageFactory;

public class LoginPage_PageExe_PageFactory extends LoginPage_Locators_PageFactory {

	public static void userName() {
		BaseClass.inputData(new LoginPage_Locators_PageFactory().getuserName(), BaseClass.readProp_reuseable("username"));
	}

	public static void password() {
		BaseClass.inputData(new LoginPage_Locators_PageFactory().getPassword(), BaseClass.readProp_reuseable("password"));
	}

	public static void logIn() {
		BaseClass.buttonClick(new LoginPage_Locators_PageFactory().getLogin());
	}
}
