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

public class AppOnBoardingForADDirect extends TestSuite {

	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=2;
		reportname="FullAppOnBoardingADDirectRport";
		browsername="chrome";
	}
	
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname, String Appname1, String revoker,String owner,String Apptype,String Checkbox,
			String domain, String user, String accountDN, String accountFilter, String groupDN, String groupFilter, 
			String status,String nativeobject,String displayattribute,String identityattribute, 
			String groupnativeobject, String groupdisplayattribute, String groupidentityattribute, String accountcorrelation, 
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
			String AppAttrValue5,String IdAttrValue5, String AppAttrValue6,String IdAttrValue6,
			String AppAttrValue7,String IdAttrValue7, String AppAttrValue8,String IdAttrValue8,
			String correlation,String creation,String customization,
			String manager,String entitement, String AppOwner, String AppRevoker, String AppCertifier, String taskname1, 
			String taskname2, String taskname3)
	{
		System.out.println("Entry 1");
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
		.verifyDomainForAD(domain)
		.verifyUserForAD(user)
		.verifyAccountSearchAttributesForAD(accountDN, accountFilter)
		.verifyGroupSearchAttributesForAD(groupDN, groupFilter)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		
		if (Appname.equalsIgnoreCase("Active Directory - BigW")){
			
			
			
			int count = SchemaAttributeObjects.accountAttributesActiveDirectoryBigW.length;
			for(int i=0; i<count;i++) {
				if((i%17==0)||(i==count-1)) {
					
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
				new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesActiveDirectoryBigW[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("Active Directory - Corp Dir")){
			
				int count = SchemaAttributeObjects.accountAttributesActiveDirectoryCorpDir.length;
				for(int i=0; i<count;i++) {
					if((i%15==0)||(i==count-1)) {
						
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
					new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesActiveDirectoryCorpDir[i], "string");
				}
			
		}
		
		else if(Appname.equalsIgnoreCase("Active Directory - NSWRO")){
			
			int count = SchemaAttributeObjects.accountAttributesActiveDirectoryNSWRO.length;
			for(int i=0; i<count;i++) {
				if((i%15==0)||(i==count-1)) {
					
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
				new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesActiveDirectoryNSWRO[i], "string");
			}
		
		}
		
		else if(Appname.equalsIgnoreCase("Active Directory - PelCorp")){
			
			int count = SchemaAttributeObjects.accountAttributesActiveDirectoryPelCorp.length;
			for(int i=0; i<count;i++) {
				if((i%15==0)||(i==count-1)) {
					
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
				new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesActiveDirectoryPelCorp[i], "string");
			}
		
		}
		
		else if(Appname.equalsIgnoreCase("Active Directory - Wowcorp")){
			
			int count = SchemaAttributeObjects.accountAttributesActiveDirectoryWowCorp.length;
			for(int i=0; i<count;i++) {
				if((i%15==0)||(i==count-1)) {
					
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
				new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesActiveDirectoryWowCorp[i], "string");
			}
		
		}
		
		new SchemaPage(driver, test)
		.verifyGroupNativeObjectType(groupnativeobject)
		.verifyGroupDisplayAttribute(groupdisplayattribute)
		.verifyGroupIdentityAttribute(groupidentityattribute);
		
		if (Appname.equalsIgnoreCase("Active Directory - BigW")){
			
			int count = SchemaAttributeObjects.groupAttributeactiveDirectoryBigW.length;
			for(int i=0; i<count;i++) {
				if((i%14==0)||(i==count-1)) {
					
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
				new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributeactiveDirectoryBigW[i], "string");
			}
			
		}
		else if(Appname.equalsIgnoreCase("Active Directory - Corp Dir")){
			
					
		
			int count1 = SchemaAttributeObjects.groupAttributesActiveDirectoryCorpDir.length;
			for(int i=0; i<count1;i++) {
				if((i%14==0)||(i==count1-1)) {
					
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
				new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributesActiveDirectoryCorpDir[i], "string");
			}
		}
		else if(Appname.equalsIgnoreCase("Active Directory - NSWRO")){
			
			
			
			int count1 = SchemaAttributeObjects.groupAttributesActiveDirectoryNSWRO.length;
			for(int i=0; i<count1;i++) {
				if((i%14==0)||(i==count1-1)) {
					
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
				new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributesActiveDirectoryNSWRO[i], "string");
			}
		}
		else if(Appname.equalsIgnoreCase("Active Directory - PelCorp")){
			
			
			
			int count1 = SchemaAttributeObjects.groupAttributesActiveDirectoryPelCorp.length;
			for(int i=0; i<count1;i++) {
				if((i%14==0)||(i==count1-1)) {
					
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
				new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributesActiveDirectoryPelCorp[i], "string");
			}
		}
		else if(Appname.equalsIgnoreCase("Active Directory - Wowcorp")){
			
			
			
			int count1 = SchemaAttributeObjects.groupAttributesActiveDirectoryWowCorp.length;
			for(int i=0; i<count1;i++) {
				if((i%14==0)||(i==count1-1)) {
					
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
				new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributesActiveDirectoryWowCorp[i], "string");
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
		.verifyAttributeCorrelationValue6(AppAttrValue6, IdAttrValue6)
		.verifyAttributeCorrelationValue7(AppAttrValue7, IdAttrValue7)
		.verifyAttributeCorrelationValue8(AppAttrValue8, IdAttrValue8)
		.clickOnRuleForADDirect()
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
