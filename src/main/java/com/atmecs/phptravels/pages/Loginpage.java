package com.atmecs.phptravels.pages;

import java.util.Properties;

import com.atmecs.phptravels.constants.Constants;
import com.atmecs.phptravels.helpers.Helperclass;
import com.atmecs.phptravels.testsuit.Baseclass;
import com.atmecs.phptravels.utils.PropertyReader;

public class Loginpage extends Baseclass {
	Properties locators;
	Properties testData;
	
	public void doLogin() {
		locators = PropertyReader.readProperties(Constants.locators_file);
		testData = PropertyReader.readProperties(Constants.test_data_file);
		Helperclass.clickElement(driver, locators.getProperty("Login"));
		
	}

}
