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

public class AppOnboardingForSalesForce extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=8;
		reportname="FullAppOnBoardingSalesForceReport";
		browsername="chrome";
		
	}

	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner, String Apptype,String Checkbox, 
			String URL, String Username, String query,String status,
			String nativeobject,String displayattribute,String identityattribute, 
			String groupnativeobject, String groupdisplayattribute, String groupidentityattribute, 
			String accountcorrelation,
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String correlation,String creation,String customization,String manager,String entitement,
			String AppOwner,String AppRevoker,String AppCertifier, 
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
		.verifyURLforSaleforce(URL)
		.verifyUsernameforSaleforce(Username)
		.verifySearchQueryForUser_Saleforce(query)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
	
		if (Appname.equalsIgnoreCase("Salesforce 1QA Product Quality Assurance")){
			
			
			
			int count = SchemaAttributeObjects.accountAttributeSalesforce1QAProductQualityAssurance.length;
			for(int i=0; i<count;i++) {
				if((i%14==0)||(i==count-1)) {
					
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
				new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributeSalesforce1QAProductQualityAssurance[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("Salesforce Bunch")){
			
				int count = SchemaAttributeObjects.accountAttributeSalesforceBunch.length;
				for(int i=0; i<count;i++) {
					if((i%14==0)||(i==count-1)) {
						
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
					new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributeSalesforceBunch[i], "string");
				}
		}
		
		else if(Appname.equalsIgnoreCase("Salesforce eBusiness Case Management")){
			
			int count = SchemaAttributeObjects.accountAttributesSalesforceEbusiness.length;
			for(int i=0; i<count;i++) {
				if((i%14==0)||(i==count-1)) {
					
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
				new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesSalesforceEbusiness[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("Salesforce HR People Services Contact Centre")){
			
			int count = SchemaAttributeObjects.accountAttributesSalesforceHR.length;
			for(int i=0; i<count;i++) {
				if((i%14==0)||(i==count-1)) {
					
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
				new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesSalesforceHR[i], "string");
			}
		}

				new SchemaPage(driver, test)
				.verifyGroupNativeObjectType(groupnativeobject)
				.verifyGroupDisplayAttribute(groupdisplayattribute)
				.verifyGroupIdentityAttribute(groupidentityattribute);
				
				if (Appname.equalsIgnoreCase("Salesforce 1QA Product Quality Assurance")){
					
					int count2 = SchemaAttributeObjects.groupAttributeSalesforce1QAProductQualityAssurance.length;
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
						new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributeSalesforce1QAProductQualityAssurance[i], "string");
					}
					
				}
				else if(Appname.equalsIgnoreCase("Salesforce Bunch")){
					
					int count1 = SchemaAttributeObjects.groupAttributeSalesforceBunch.length;
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
						new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributeSalesforceBunch[i], "string");
					}
				}
				
				else if(Appname.equalsIgnoreCase("Salesforce eBusiness Case Management")){
					
					int count1 = SchemaAttributeObjects.groupAttributeSalesforceEbusiness.length;
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
						new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributeSalesforceEbusiness[i], "string");
					}
				}
				
				else if(Appname.equalsIgnoreCase("Salesforce HR People Services Contact Centre")){
					
					int count1 = SchemaAttributeObjects.groupAttributeSalesforceHR.length;
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
						new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributeSalesforceHR[i], "string");
					}
				}
				
				
				new CorrelationPage(driver, test)
				.clickOnCorrelation()
				.verifyAccountCorrelationForAccountBasedCorrelation(accountcorrelation)
				.verifyAttributeCorrelationValue1(AppAttrValue1, IdAttrValue1)
				.verifyAttributeCorrelationValue2(AppAttrValue2, IdAttrValue2)
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
