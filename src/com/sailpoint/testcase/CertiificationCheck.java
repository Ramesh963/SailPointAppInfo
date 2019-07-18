package com.sailpoint.testcase;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sailpoint.pages.HomePage;

import wrappers.TestSuite;

public class CertiificationCheck extends TestSuite{
	@BeforeSuite
	public void BeforeClass(){
		reportname = "FullAppOnBoardingAzureReport";
		browsername = "chrome";
	}
	
	
@Test

	public void check() {
	startTest("user");
		 new HomePage(driver, test).clickSetup().clickOnCertifications().clickOnNewCertification().clickOnApplicationOwner().enterApplicationName("alh"); 
	
	}
}
