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

public class AppOnBoardingForRuleFileParser extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=12;
		reportname="FullAppOnBoardingRuleFileParser";
		browsername="chrome";
		
	}
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String Checkbox,
			String Filetransport, String File1,String filterEmptyR, String Partitionmode,String Parserule,String status,
			String nativeobject,String displayattribute,String identityattribute,
			String groupnativeobject,String groupdisplayattribute,String groupidentityattribute,
			String accountcorrelation,
			String correlation,String creation,String customization,String manager, String entitlement,
			String AppOwner, String AppRevoker, String AppCertifier,
			String taskname1, String taskname2, String taskname3, String taskname4, String taskname5, String taskname6) {
		
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
		.verifyFiletransport(Filetransport)
		.verifyFile(File1)
		.checkForFilterEmptyRecords(filterEmptyR)
		.verifyPartitionmode(Partitionmode)
	    .verifyparserule(Parserule)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
	    
			
		if(Appname.equalsIgnoreCase("CA Introscope")) {
			
			int count=SchemaAttributeObjects.accountAttributecaIntroscope.length;
		
			for(int i=0;i<count;i++) {
				if((i%1==0)||(i==count-1)) {
					
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
				new SchemaPage(driver, test)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributecaIntroscope[i], "string");
			}
		
		}
		new SchemaPage(driver, test)
		.verifyGroupNativeObjectType(groupnativeobject)
		.verifyGroupDisplayAttribute(groupdisplayattribute)
		.verifyGroupIdentityAttribute(groupidentityattribute);
		if(Appname.equalsIgnoreCase("CA Introscope")) {
			
		
			int count1=SchemaAttributeObjects.groupAttributecaIntrocope.length;
		
			for(int k=0;k<count1;k++) {
				if((k%14==0)||(k==count1-1)) {
					
					clickByXpath(LocatorObjects.SchemaGroupAttribute+k+":attrName')]");
					//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
					
					try {
						WebDriverWait wait=new WebDriverWait(driver, 10);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaGroupAttribute+k+":attrName')]")));
						logStatus("pass", "The screenshot of Schema attributes", true);
					}catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
						System.out.println("Element not found");
					}catch (TimeoutException e) {
						System.out.println("Element not found");
					}
				}
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributecaIntrocope[k], "string");
			}
		}
		
			new CorrelationPage(driver, test)
		
		.clickOnCorrelation()
		.verifyAccountCorrelation(accountcorrelation)
		.clickOnRule()
		.verifyCorrelationRule(correlation)
		.verifyCreationRule(creation)
		.verifyManagerCorrelationRule(manager)
		.verifyCustomizationRule(customization)
        .verifyEntitlementCustomizationRule(entitlement)
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
			.enterTaskName(taskname4)
			.verifyTheTaskname(taskname4)
			.enterTaskName(taskname5)
			.verifyTheTaskname(taskname5)
			.enterTaskName(taskname6)
			.verifyTheTaskname(taskname6)
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
			.clickOnReturnToTask()
			.enterResultName(taskname5)
			.verifyResults(taskname5)
			.getStartDate()
			.getCompletedDate()
			.clickOnReturnToTask()
			.enterResultName(taskname6)
			.verifyResults(taskname6)
			.getStartDate()
			.getCompletedDate()
			.clickOnReturnToTask();
		
		
		
	}
}
