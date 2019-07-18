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

public class AppOnBoardingForAzure extends TestSuite {

	@BeforeSuite
	public void BeforeClass(){
		testdatasheetname = "SailpointAllAppOnboarding";
		sheetnum =17;
		reportname = "FullAppOnBoardingAzureReport";
		browsername = "chrome";
	}
	
	@Test(dataProvider = "fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner, String Apptype,String Checkbox, 
			String ClientID,String domainname, String status, 
			String nativeobject, String displayattribute, String identityattribute, 
			String resourcegroupnative, String resourcegroupid, 
			String resourcenative, String resourceid, String subnative, String subid, 
			String groupnativeobject, String groupdisplayattribute, String groupidentityattribute,
			String accountcorrelation, String correlation, String creation, String customization, String manager, 
			String entitement, String AppOwner, String AppRevoker, String AppCertifier, 
			String taskname1, String taskname2, String taskname3, String taskname4) {
		
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
		.verifyClientID_GoogleApps(ClientID)
		.verifyDomainNameforAzure(domainname)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		

		

		int count = SchemaAttributeObjects.accountAttributesAzure.length;
		for(int i=0; i<count;i++) {
			if((i%18==0)||(i==count-1)) {
				
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
			new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesAzure[i], "string");
		}
		
		new SchemaPage(driver, test)
		.verifyResourceGroupNativeObjectTypeForAzure(resourcegroupnative)
		.verifyResourceGroupIdentityAttribute(resourcegroupid);
		


		int count1 = SchemaAttributeObjects.resourcegroupAttributesAzure.length;
		for(int j=0; j<count1;j++) {
			if((j%13==0)||(j==count1-1)) {
				
				clickByXpath(LocatorObjects.SchemaResourceGroupAttribute+j+":attrName')]");
				//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaResourceGroupAttribute+j+":attrName')]")));
					logStatus("pass", "The screenshot of Schema attributes", true);
				}catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}catch (TimeoutException e) {
					System.out.println("Element not found");
				}
			}
			new SchemaPage(driver, test).verifyAttributeForRole(SchemaAttributeObjects.resourcegroupAttributesAzure[j], "string");
		}
		
		new SchemaPage(driver, test)
		.verifyResourceNativeObjectForAzure(resourcenative)
		.verifyResourceIdentityAttributeForAzure(resourceid);
		
		

		int count2 = SchemaAttributeObjects.resourceAttributesAzure.length;
		for(int k=0; k<count2;k++) {
			if((k%13==0)||(k==count2-1)) {
				
				clickByXpath(LocatorObjects.SchemaResourceAttribute+k+":attrName')]");
				//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaResourceAttribute+k+":attrName')]")));
					logStatus("pass", "The screenshot of Schema attributes", true);
				}catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}catch (TimeoutException e) {
					System.out.println("Element not found");
				}
			}
			new SchemaPage(driver, test).verifyResourceAttributeForAzure(SchemaAttributeObjects.resourceAttributesAzure[k], "string");
		}
		
		new SchemaPage(driver, test)
		.verifySubscriptionNativeObjectForAzure(subnative)
		.verifySubscriptionIdentityAttributeForAzure(subid);
		


		int count3 = SchemaAttributeObjects.subscriptionAttributeAzure.length;
		for(int l=0; l<count3;l++) {
			if((l%13==0)||(l==count3-1)) {
				
				clickByXpath(LocatorObjects.SchemaSubscriptionAttribute+l+":attrName')]");
				//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaSubscriptionAttribute+l+":attrName')]")));
					logStatus("pass", "The screenshot of Schema attributes", true);
				}catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}catch (TimeoutException e) {
					System.out.println("Element not found");
				}
			}
			new SchemaPage(driver, test).verifySubscriptionAttributeForAzure(SchemaAttributeObjects.subscriptionAttributeAzure[l], "string");
		}
		
		new SchemaPage(driver, test)
		.verifyGroupNativeObjectForAzure(groupnativeobject)
		.verifyGroupDisplayAttributeForAzure(groupdisplayattribute)
		.verifyGroupIdentityAttributeForAzure(groupidentityattribute);
		
	

		int count4 = SchemaAttributeObjects.groupAttributesAzure.length;
		for(int m=0; m<count4;m++) {
			if((m%14==0)||(m==count4-1)) {
				
				clickByXpath(LocatorObjects.SchemaGroupAttributeForAzure+m+":attrName')]");
				//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaGroupAttributeForAzure+m+":attrName')]")));
					logStatus("pass", "The screenshot of Schema attributes", true);
				}catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}catch (TimeoutException e) {
					System.out.println("Element not found");
				}
			}
			new SchemaPage(driver, test).verifyGroupAttributeForAzure(SchemaAttributeObjects.groupAttributesAzure[m], "string");
		}
		
		new CorrelationPage(driver, test)
		.clickOnCorrelation()
		.verifyAccountCorrelation(accountcorrelation)
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
