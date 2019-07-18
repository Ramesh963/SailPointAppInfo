package com.sailpoint.testcaseforTestConnection;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sailpoint.pages.HomePage;

import wrappers.TestSuite;

public class TestconnectionForAllConnectorType extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAppTestconnection";
		sheetnum=2;
		reportname="TestconnectionforAllConnectorType";
		browsername="chrome";
		
	}
@Test(dataProvider="fetchdata")
	public void appInfo(String Appname,String testconnection, String Type) {
	startTest("Application of  "+" '"+Appname+"- (Connector Type:" +Type+") ");
	
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
