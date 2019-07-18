package com.sailpoint.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sailpoint.pages.HomePage;

import utilsFiles.ReadDataFromExcel;
import wrappers.TestSuite;

public class AppInfoAndConfigForJDBC extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="sailpointAppInfo";
		sheetnum=1;
		reportname="JDBCFileReport";
		browsername="chrome";
		
	}
@Test(dataProvider="fetchdata")
	public void appInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String Checkbox,String connectionuser,String databaseUrl,String JDBCdriver) {
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
		.verifyConnectionUser(connectionuser)
		.verifyDataBaseUrl(databaseUrl)
		.verifyJDBCdriver(JDBCdriver);
		
	}
}
