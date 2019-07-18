package com.sailpoint.testcase;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sailpoint.pages.HomePage;


import wrappers.TestSuite;

public class ApplicationInfo extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="sailpointAppInfo";
		sheetnum=2;
		reportname="ApplicationInfoAndTestconnectionReport";
		browsername="chrome";
		
	}
@Test(dataProvider="fetchdata")
	public void appInfo(String Appname,String Appname1,String testconnection) {
	startTest("Application of  "+" '"+Appname+""+"' ");
	
		new HomePage(driver, test)
		.clickOnApplications()
		.clickOnAppDefinition()
		.enterAppName(Appname)
		.clickOnSearchIcon()
		.clickOnApplication(Appname)
		.verifyAppNameForTestConnection(Appname)
		//.checkForAuthoritative()
		.clickOnConfiguration()
		.clickTheTestConnection()
		.checkTestConnectionStatus(testconnection);
	}
}
