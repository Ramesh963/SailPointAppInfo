package com.sailpoint.testcaseforTestConnection;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sailpoint.pages.HomePage;

import wrappers.TestSuite;

public class TestconnectionForNonAuth extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAppTestconnection";
		sheetnum=1;
		reportname="TestconnectionforNonAuth";
		browsername="chrome";
		
	}
@Test(dataProvider="fetchdata")
	public void appInfo(String Appname,String testconnection) {
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
