package com.sailpoint.pages;



import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.object.LocatorObjects;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BaseTest;

public class LoginPage extends BaseTest {
	public LoginPage(RemoteWebDriver driver1,ExtentTest test1) {
		this.driver=driver1;
		this.test=test1;
	}
	
public LoginPage enterUserName() {
	EnterDataByXpath(LocatorObjects.enterUserName, prob.getProperty("userName"));
	return this;
}
public LoginPage enterPassword() {
	EnterDataByXpath(LocatorObjects.enterPassword, prob.getProperty("passWord"));
	
	return this;
}
public HomePage clickTheLoginButton() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	try {
		clickByXpath(LocatorObjects.clickTheLoginButton);
	} 
	catch (TimeoutException e) {
		
		System.out.println("Test case failed due to Time out Exception");
		logStatus("fail", "Test case failed due to Time out Exception ", true);
	}
	
	return new HomePage(driver, test);
}

}
