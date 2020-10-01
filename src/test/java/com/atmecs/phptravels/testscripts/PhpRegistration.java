package com.atmecs.phptravels.testscripts;

import org.testng.annotations.Test;

import com.atmecs.phptravels.pages.Registrationpage;
import com.atmecs.phptravels.testsuit.Baseclass;

public class PhpRegistration extends Baseclass {
	@Test(priority = 1)
	public void register() throws Exception{
		
		Registrationpage rg = new Registrationpage();
		rg.doRegistartion();
	}
	
	
}
