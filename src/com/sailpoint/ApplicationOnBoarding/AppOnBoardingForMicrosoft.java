package com.sailpoint.ApplicationOnBoarding;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sailpoint.pages.CorrelationPage;
import com.sailpoint.pages.HomePage;
import com.sailpoint.pages.SchemaPage;
import com.object.LocatorObjects;
import com.object.SchemaAttributeObjects;
import com.sailpoint.pages.*;

import wrappers.TestSuite;

public class AppOnBoardingForMicrosoft extends TestSuite{
	
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname = "SailpointAllAppOnboarding";
		sheetnum =14;
		reportname = "FullAppOnBoardingMicrosoftReport";
		browsername = "chrome";
	}	
	
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner, String Apptype, String Checkbox,
			String url,String user,String drivername, String includedatabase, String status, 
			String nativeobject, String displayattribute, String identityattribute, 
			String groupnativeobject, String groupdisplayattribute, String groupidentityattribute, 
			String accountcorrelation, 
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
			String AppAttrValue5,String IdAttrValue5, String AppAttrValue6,String IdAttrValue6,
			String correlation, String creation, String customization, String manager, String entitement, 
			String AppOwner, String AppRevoker, String AppCertifier, 
			String taskname1, String taskname2) {
	
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
	.verifyURLforOracle(url)
	.verifyUsernameforOracle(user)
	.verifyDriverclassforOracle(drivername)
	.verifyIncludeDatabasesforMicrosoft(includedatabase)
	.clickTheTestConnection()
	.checkTestConnectionStatusAll(status)
	.clickSchema()
	.verifyNativeObjectType(nativeobject)
	.verifyDisplayAttribute(identityattribute)
	.verifyIdentityAttribute(identityattribute);
	
	

	int count = SchemaAttributeObjects.accountAttributesOrderDistributionSystemCountdownODS.length;
	for(int i=0; i<count;i++) {
		if((i%16==0)||(i==count-1)) {
			
			clickByXpath(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
			//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
			
			try {
				WebDriverWait wait=new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaAccountAttribute+i+":attrName')]")));
				logStatus("pass", "The screenshot of Schema attributes", true);
			}catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.out.println("Element not found");
			}catch (TimeoutException e) {
				System.out.println("Element not found");
			}
		}
		new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesOrderDistributionSystemCountdownODS[i], "string");
	}

	new SchemaPage(driver, test)
	.verifyGroupNativeObjectType(groupnativeobject)
	.verifyGroupDisplayAttribute(groupdisplayattribute)
	.verifyGroupIdentityAttribute(groupidentityattribute);
	

	int count1 = SchemaAttributeObjects.groupAttributesOrderDistributionSystemCountdownODS.length;
	for(int j=0; j<count1;j++) {
		if((j%7==0)||(j==count1-1)) {
			
			clickByXpath(LocatorObjects.SchemaGroupAttribute+j+":attrName')]");
			//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
			
			try {
				WebDriverWait wait=new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaGroupAttribute+j+":attrName')]")));
				logStatus("pass", "The screenshot of Schema attributes", true);
			}catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.out.println("Element not found");
			}catch (TimeoutException e) {
				System.out.println("Element not found");
			}
		}
		new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOrderDistributionSystemCountdownODS[j], "string");
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
	.clickOnReturnToTask();
	
	
	}
	
}