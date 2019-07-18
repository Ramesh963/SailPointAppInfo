package com.sailpoint.testcase;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sailpoint.pages.HomePage;


import wrappers.TestSuite;

public class SailpointAppInfoAndConfig extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="sailpointAppInfo";
		sheetnum=0;
		reportname="DelimitedFileRport";
		browsername="chrome";
		
	}

	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String Checkbox,String path,String type,String status) {
		startTest("Application details and configuration of  "+Appname);
		new HomePage(driver, test)
		.clickOnApplications()
		.clickOnAppDefinition()
		.enterAppName(Appname)
		.clickOnSearchIcon()
		.clickOnApplication(Appname)
		.verifyAppName(Appname1)
		.verifyTheRevoker(revoker)
		.verifyTheOwner(owner)
		.verifyTheAppType(Apptype)
		.checkForAuthoritative(Checkbox)
		.clickOnConfiguration()
		.verifyTheFilePath(path)
		.checkForParsingType(type)
		.clickTheTestConnection()
		.checkTestConnectionStatus(status);

	}
}
