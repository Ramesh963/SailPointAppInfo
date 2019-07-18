package com.sailpoint.ApplicationOnBoarding;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sailpoint.pages.SchemaPage;
import com.object.LocatorObjects;
import com.object.SchemaAttributeObjects;
import com.sailpoint.pages.CorrelationPage;
import com.sailpoint.pages.HomePage;

import wrappers.TestSuite;

public class AppOnBoardingForGoogleApps extends TestSuite{

	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=6;
		reportname="FullAppOnBoardingGoogleAppsReport";
		browsername="chrome";
	}
	
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname, String Appname1, String revoker, String owner, String Apptype,String Checkbox, String ClientID, 
			String ClientSecret, String Readgroup, String pagesize, String status, String nativeobject, String displayattribute, 
			String identityattribute, String roleNativeoject, String roleDisplayattribute, String roleIdentityattribute, 
			String groupnativeobject, String groupdisplayattribute, String groupidentityattribute, String accountcorrelation, 
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
			String AppAttrValue5,String IdAttrValue5, String AppAttrValue6,String IdAttrValue6,
			String correlation, String creation, String customization, String manager, String entitement, String AppOwner, 
			String AppRevoker, String AppCertifier, String taskname1, String taskname2, String taskname3, String taskname4) {
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
		.getDescription()
		.checkForAuthoritative(Checkbox)
		.clickOnConfiguration()
		.verifyClientID_GoogleApps(ClientID)
		.verifyClientSecret_GoogleApps(ClientSecret)
		.verifyReadGroupDetails_GoogleApps(Readgroup)
		.verifyPageSize_GoogleApps(pagesize)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		
		
	
		int count = SchemaAttributeObjects.accountAttributesGoogleApps.length;
		for(int i=0; i<count;i++) {
			
			new SchemaPage(driver, test)
			.SchemaAccountScreenshot(i, 10)
			.verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesGoogleApps[i], "string");
		}
	

		new SchemaPage(driver, test)
		.verifyRoleNativeObjectType(roleNativeoject)
		.verifyRoleDisplayAttribute(roleDisplayattribute)
		.verifyRoleIdentityAttribute(roleIdentityattribute);
		
		
		
		int count1 = SchemaAttributeObjects.roleAttributesGoogleApps.length;
		for(int i=0; i<count1;i++) {
			
			new SchemaPage(driver, test)
			.SchemaRoleScreenshot(i, 6)
			.verifyAttributeForRole(SchemaAttributeObjects.roleAttributesGoogleApps[i], "string");
		}
		
		new SchemaPage(driver, test)
		.verifyGroupNativeObjectForSwow(groupnativeobject)
		.verifyGroupDisplayAttributeForSwow(groupdisplayattribute)
		.verifyGroupIdentityAttributeForSwow(groupidentityattribute);
	
		
		int count2 = SchemaAttributeObjects.groupAttributesGoogleApps.length;
		for(int i=0; i<count2;i++) {
			
			new SchemaPage(driver, test)
			.SchemaGroupForSWOWScreenshot(i, 16)
			.verifyGroupAttributeForSwow(SchemaAttributeObjects.groupAttributesGoogleApps[i], "string");
		}
		
		new CorrelationPage(driver, test)
		.clickOnCorrelation()
		.verifyAccountCorrelationForAccountBasedCorrelation(accountcorrelation)
		.verifyAttributeCorrelationValue1(AppAttrValue1, IdAttrValue1)
		.verifyAttributeCorrelationValue2ForAD(AppAttrValue2, IdAttrValue2)
		.verifyAttributeCorrelationValue3(AppAttrValue3, IdAttrValue3)
		.verifyAttributeCorrelationValue4(AppAttrValue4, IdAttrValue4)
		.verifyAttributeCorrelationValue5(AppAttrValue5, IdAttrValue5)
		.verifyAttributeCorrelationValue6ForGoogleApps(AppAttrValue6, IdAttrValue6)
		.clickOnRule()
		.verifyCorrelationRule(correlation)
		.verifyCreationRule(creation)
		.verifyCustomizationRule(customization)
		.verifyManagerCorrelationRule(manager)
		.verifyEntitlementCustomizationRule(entitement)
		.clickSetup()
		.clickOnGroups()
		.clickOnWorkgroups()
		.verifyAppOwner(AppOwner)
		.verifyAppCertifiers(AppCertifier)
		.verifyAppRevokers(AppRevoker);
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
		.enterTaskName(taskname4)
		.verifyTheTaskname(taskname4)
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
		.clickOnReturnToTask()
		.enterResultName(taskname4)
		.verifyResults(taskname4)
		.getStartDate()
		.getCompletedDate()
		.clickOnReturnToTask();
		
		
	}
}
