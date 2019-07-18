package com.sailpoint.ApplicationOnBoarding;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.object.LocatorObjects;
import com.object.SchemaAttributeObjects;
import com.sailpoint.pages.CorrelationPage;
import com.sailpoint.pages.HomePage;
import com.sailpoint.pages.SchemaPage;

import wrappers.TestSuite;

public class AppOnBoardingForUnix extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=10;
		reportname="FullAppOnBoardingUnix";
		browsername="chrome";
		
	}
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String Checkbox,
			String File,String Host1,String Transport,String Passwd,String group,String auto1,String status,
			String nativeobject,String displayattribute,String identityattribute,
			String groupnativeobject, String groupdisplayattribute, String groupidentityattribute,
			String accountcorrelation,
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
			String correlation,String creation,String manager,String customization,String entitement,
			String AppOwner, String AppRevoker, String AppCertifier,
			String taskname1, String taskname2, String taskname3) {
		
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
		//.getDescription()
		.checkForAuthoritative(Checkbox)
		.clickOnConfiguration()
		.verifyFiletransport(File)
	    .verifyHost1(Host1)
	    .verifyTransportuser(Transport)
	    .verifypasswd(Passwd)
	    .verifygroup(group)
	    .verifypartition(auto1)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		
		if(Appname.equalsIgnoreCase("Central Database - BigW")) {
			
		
			int count=SchemaAttributeObjects.accountAttributecentraldatabase.length;
		
			for(int i=0;i<count;i++) {
					
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 8)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributecentraldatabase[i], "string");
		}
		}else if(Appname.equalsIgnoreCase("Cross Dock Management XDOCK Hoxton Park DC")){
			
		
			
				int count=SchemaAttributeObjects.accountAttributecrossdockmanagement.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 8)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributecrossdockmanagement[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("WMS 3-3 Broadmeadows DC")){
			
			
			
			int count=SchemaAttributeObjects.accountAttributeWMS3_3BroadmeadowsDC.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 7)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributeWMS3_3BroadmeadowsDC[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("WMS 3-3 Minchinbury DC")){
			
			
			
			int count=SchemaAttributeObjects.accountAttributeWMS3_3MinchinburyDC.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 7)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributeWMS3_3MinchinburyDC[i], "string");
			}
		}
		
		new SchemaPage(driver, test)
		.verifyGroupNativeObjectType(groupnativeobject)
		.verifyGroupDisplayAttribute(groupdisplayattribute)
		.verifyGroupIdentityAttribute(groupidentityattribute);
		
		if(Appname.equalsIgnoreCase("Central Database - BigW")) {
			
		
			int count=SchemaAttributeObjects.groupAttributecentraldatabase.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaGroupScreenshot(i, 2)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributecentraldatabase[i], "string");
		}
		}else if(Appname.equalsIgnoreCase("Cross Dock Management XDOCK Hoxton Park DC")) {
			
			
				int count=SchemaAttributeObjects.groupAttributecrossdockmanagement.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaGroupScreenshot(i, 2)
					.verifyGroupAttribute(SchemaAttributeObjects.groupAttributecrossdockmanagement[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("WMS 3-3 Broadmeadows DC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributeWMS3_3BroadmeadowsDC.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaGroupScreenshot(i, 2)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributeWMS3_3BroadmeadowsDC[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("WMS 3-3 Minchinbury DC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributeWMS3_3MinchinburyDC.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaGroupScreenshot(i, 2)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributeWMS3_3MinchinburyDC[i], "string");
			}
		}
		
		
		new CorrelationPage(driver, test)
		
		.clickOnCorrelation()
		.verifyAccountCorrelationForAccountBasedCorrelation(accountcorrelation)
		.verifyAttributeCorrelationValue1(AppAttrValue1, IdAttrValue1)
		.verifyAttributeCorrelationValue2ForAD(AppAttrValue2, IdAttrValue2)
		.verifyAttributeCorrelationValue3(AppAttrValue3, IdAttrValue3)
		.verifyAttributeCorrelationValue4For_OpenLDAP(AppAttrValue4, IdAttrValue4)
     	.clickOnRule()
		.verifyCorrelationRule(correlation)
		.verifyCreationRule(creation)
		.verifyManagerCorrelationRule(manager)
		.verifyCustomizationRule(customization)
		.verifyEntitlementCustomizationRule(entitement)
		.clickSetup()
		.clickOnGroups()
		.clickOnWorkgroups()
		.verifyAppOwner(AppOwner)
		.verifyAppRevokers(AppRevoker)
		.verifyAppCertifiers(AppCertifier);
		driver.navigate().refresh();
			
			new HomePage(driver, test)
			.clickSetup()
			.clickOnTasks()
			.enterTaskName(taskname1)
			.verifyTheTaskname(taskname1)
			.enterTaskName(taskname2)
			.verifyTheTaskname(taskname2)
			.enterTaskName(taskname3)
			.verifyTheTaskname(taskname3)
			.clickOnTaskResults()
			.enterResultName(taskname1)
			.verifyResults(taskname1)
			.getStartDate()
			.getCompletedDate()
			.clickOnReturnToTask()
			.enterResultName(taskname2)
			.verifyResults(taskname2)
			.getStartDate()
			.getCompletedDate()
			.clickOnReturnToTask()
			.enterResultName(taskname3)
			.verifyResults(taskname3)
			.getStartDate()
			.getCompletedDate()
			.clickOnReturnToTask();
		
		
	}
}


