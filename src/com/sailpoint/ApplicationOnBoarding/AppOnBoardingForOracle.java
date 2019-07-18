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

public class AppOnBoardingForOracle extends TestSuite {

	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=13;
		reportname="FullAppOnBoardingOracleReport";
		browsername="chrome";

	}

		@Test(dataProvider="fetchdata")
		public void AppInfo(String Appname, String Appname1, String revoker,String owner,String Apptype,String Checkbox,
				String username, String url, String driverclass, String status,
				String nativeobject,String displayattribute,String identityattribute, 
				String groupnativeobject, String groupdisplayattribute, String groupidentityattribute,String accountcorrelation,
				String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
				String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
				String AppAttrValue5,String IdAttrValue5, String AppAttrValue6,String IdAttrValue6,
				String correlation,String creation,String customization,String manager,String entitement,
				String AppOwner,String AppRevoker,String AppCertifier, 
				String taskname1, String taskname2, String taskname3){
			
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
		.verifyUsernameforOracle(username)
		.verifyURLforOracle(url)
		.verifyDriverclassforOracle(driverclass)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
			
		if(Appname.equalsIgnoreCase("Human Resource Master Data")) {
			
			
			int count=SchemaAttributeObjects.accountAttributeHumanResource.length;
			for(int i=0;i<count;i++) {
				if((i%12==0)||(i==count-1)) {
					
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
				.verifyAttributeForAccount(SchemaAttributeObjects.accountAttributeHumanResource[i],"string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("Customer Master Data Management CMDM")) {
			
			
			int count=SchemaAttributeObjects.accountAttributeCustomerMasterDataManagementCMDM.length;
			
			for(int i=0;i<count;i++) {
				if((i%8==0)||(i==count-1)) {
					
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
				.verifyAttributeForAccount(SchemaAttributeObjects.accountAttributeCustomerMasterDataManagementCMDM[i],"string");
			}
	}
		else if(Appname.equalsIgnoreCase("Customer Loyalty Central System")) {
			
			
			int count=SchemaAttributeObjects.accountAttributeCustomerLoyaltyCentralSystem.length;
			
			for(int i=0;i<count;i++) {
				if((i%8==0)||(i==count-1)) {
					
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
				.verifyAttributeForAccount(SchemaAttributeObjects.accountAttributeCustomerLoyaltyCentralSystem[i],"string");
			}
	}
		
		new SchemaPage(driver, test)
		.verifyGroupNativeObjectType(groupnativeobject)
		.verifyGroupDisplayAttribute(groupdisplayattribute)
		.verifyGroupIdentityAttribute(groupidentityattribute);
		
		if (Appname.equalsIgnoreCase("Human Resource Master Data")){
			
			int count2 = SchemaAttributeObjects.groupAttributeHumanResource.length;
			for(int i=0; i<count2;i++) {
				if((i%4==0)||(i==count2-1)) {
					
					clickByXpath(LocatorObjects.SchemaGroupAttribute+i+":attrName')]");
					//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
					
					try {
						WebDriverWait wait=new WebDriverWait(driver, 10);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaGroupAttribute+i+":attrName')]")));
						logStatus("pass", "The screenshot of Schema attributes", true);
					}catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
						System.out.println("Element not found");
					}catch (TimeoutException e) {
						System.out.println("Element not found");
					}
				}
				new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributeHumanResource[i], "string");
			}
			
		}
		else if(Appname.equalsIgnoreCase("Customer Master Data Management CMDM")){
			
			int count1 = SchemaAttributeObjects.groupAttributeCustomerMasterDataManagementCMDM.length;
			for(int i=0; i<count1;i++) {
				if((i%4==0)||(i==count1-1)) {
					
					clickByXpath(LocatorObjects.SchemaGroupAttribute+i+":attrName')]");
					//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
					
					try {
						WebDriverWait wait=new WebDriverWait(driver, 10);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaGroupAttribute+i+":attrName')]")));
						logStatus("pass", "The screenshot of Schema attributes", true);
					}catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
						System.out.println("Element not found");
					}catch (TimeoutException e) {
						System.out.println("Element not found");
					}
				}
				new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributeCustomerMasterDataManagementCMDM[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("Customer Loyalty Central System")){
			
			int count1 = SchemaAttributeObjects.groupAttributeCustomerLoyaltyCentralSystem.length;
			for(int i=0; i<count1;i++) {
				if((i%4==0)||(i==count1-1)) {
					
					clickByXpath(LocatorObjects.SchemaGroupAttribute+i+":attrName')]");
					//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
					
					try {
						WebDriverWait wait=new WebDriverWait(driver, 10);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaGroupAttribute+i+":attrName')]")));
						logStatus("pass", "The screenshot of Schema attributes", true);
					}catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
						System.out.println("Element not found");
					}catch (TimeoutException e) {
						System.out.println("Element not found");
					}
				}
				new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributeCustomerLoyaltyCentralSystem[i], "string");
			}
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