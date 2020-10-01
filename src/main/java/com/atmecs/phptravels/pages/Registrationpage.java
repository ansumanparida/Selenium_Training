package com.atmecs.phptravels.pages;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.atmecs.phptravels.constants.Constants;
import com.atmecs.phptravels.helpers.Helperclass;
import com.atmecs.phptravels.testsuit.Baseclass;
import com.atmecs.phptravels.utils.PropertyReader;

public class Registrationpage extends Baseclass {
	Properties locators;
	Properties testData;
	
	public void doRegistartion() throws Exception {
		locators = PropertyReader.readProperties(Constants.locators_file);
		testData = PropertyReader.readProperties(Constants.test_data_file);
		Helperclass.clickElement(driver, locators.getProperty("Login"));
		//Handling Child Window
		Set<String> mainWindow = driver.getWindowHandles();
		Iterator<String> itr = mainWindow.iterator();
		while(itr.hasNext()){
		String childWindow = itr.next();
		String childWindow2 = itr.next();
		if(!mainWindow.equals(childWindow)) {
			driver.switchTo().window(childWindow2);
		}
	
		
		Helperclass.clickElement(driver, locators.getProperty("Register_link"));
		Helperclass.sendKeys(driver, locators.getProperty("Firstname"), testData.getProperty("Name"));
		Helperclass.sendKeys(driver,locators.getProperty("Lastname"), testData.getProperty("Lastname"));
		Helperclass.sendKeys(driver,locators.getProperty("Email"), testData.getProperty("Email"));
		Helperclass.clickElement(driver, locators.getProperty("Selectcode"));
		Helperclass.clickElement(driver, locators.getProperty("code"));
//		Select country = new Select(driver.findElement(By.xpath(locators.getProperty("Selectcode"))));
//		country.selectByVisibleText(testData.getProperty("code"));
		Helperclass.sendKeys(driver,locators.getProperty("Mobilephone"), testData.getProperty("Mobile"));
		Helperclass.sendKeys(driver,locators.getProperty("Companyname"), testData.getProperty("Company"));
		Helperclass.sendKeys(driver, locators.getProperty("Address1"), testData.getProperty("Street"));
		Helperclass.sendKeys(driver, locators.getProperty("Address2"), testData.getProperty("Street2"));
		Helperclass.sendKeys(driver, locators.getProperty("City"), testData.getProperty("City"));
		Helperclass.sendKeys(driver, locators.getProperty("State"), testData.getProperty("State"));
		Helperclass.sendKeys(driver, locators.getProperty("Postcode"), testData.getProperty("Pincode"));
		Helperclass.sendKeys(driver, locators.getProperty("Country"),testData.getProperty("Country"));
		Helperclass.sendKeys(driver, locators.getProperty("Findus"), testData.getProperty("Where"));
		Helperclass.sendKeys(driver, locators.getProperty("whatsapp"), testData.getProperty("Whatsapp"));
		Helperclass.sendKeys(driver, locators.getProperty("Password1"),testData.getProperty("Password"));
		Helperclass.sendKeys(driver, locators.getProperty("Password2"), testData.getProperty("Repassword"));
		Helperclass.clickElement(driver, locators.getProperty("Mailinglist"));
		Thread.sleep(5000);
		Helperclass.clickElement(driver, locators.getProperty("Recaptcha"));
		Helperclass.clickElement(driver, locators.getProperty("Registerbutton"));
		}
		
	}

}
