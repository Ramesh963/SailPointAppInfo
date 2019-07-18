package com.sailpoint.testcase;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sailpoint.pages.HomePage;
import com.sailpoint.pages.SchemaPage;

import wrappers.TestSuite;

public class Demo extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="Demo";
		sheetnum=0;
		reportname="DemoReport";
		browsername="chrome";
	}
@Test(dataProvider="fetchdata")
	public void getWork(String Appname,String Checkbox,String attributename,String attributename2,String attributename3,String attributename4,String attributename5) {
	startTest(Appname);
		new HomePage(driver, test)
		.clickOnApplications()
		.clickOnAppDefinition()
		.enterAppName(Appname)
		.clickOnSearchIcon()
		.clickOnApplication(Appname)
		.checkForAuthoritative(Checkbox)
		.clickOnConfiguration()
		.clickTheTestConnection()
		.checkTestConnectionStatusAll("Test connection")
		.clickSchema();
		String[] attributes= new String[] {"STATUS","USERID","Username","First Name","Last Name","Middle Name","Manager","Human Resource","Area","Job Code","Division","Store / Site / Department","Time Zone",
				"Hire Date","Employee Id","Title","Business Phone","Business Fax","Address 2","City","State","Post Code","Country","Review Frequency",
				"Last Review Date","Position Id","FT/PT Casual","Cost Center","Line Manager","Employment Type","HR Level","Grade","Customizable Field 9",
				"Customizable Field 10","Customizable Field 11","Customizable Field 12","Customizable Field 13","Customizable Field 14","HRCode","Matrix Manager","Default Locale","Custom Manager","Second Manager","Division_ID","Area_ID"};
		
		int count=attributes.length;
		
		for(int i=0;i<count;i++) {
		new SchemaPage(driver, test).verifyAttributeFor(attributes[i], "string");
		}
	}
}
