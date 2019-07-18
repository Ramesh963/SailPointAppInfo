package com.sailpoint.ApplicationOnBoarding;

import java.awt.Checkbox;

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

public class AppOnBoardingForIBM extends TestSuite{
	
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=9;
		reportname="FullAppOnBoardingIBMReport";
		browsername="chrome";
	}
	
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner, String Apptype,String Checkbox, 
			String authType,String user,String host,String port, String authSearchattributes, 
			String accountDN, String accountFilter, String groupDN, String groupFilter,
			String status,String nativeobject,String displayattribute,String identityattribute,
			String groupnativeobject, String groupdisplayattribute, String groupidentityattribute, 
			String accountcorrelation,
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
			String correlation,String creation,String customization,String manager,String entitement,
			String AppOwner,String AppRevoker,String AppCertifier, String taskname1, String taskname2, String taskname3) {
		
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
		.verifyAuthTypeforIBM(authType)
		.verifyUserforIBM(user)
		.verifyHostforIBM(host)
		.verifyPort(port)
		.verifyAuthenticationSearchAttributesforIBM(authSearchattributes)
		.verifyAccountSearchAttributesForIBM(accountDN, accountFilter)
		.verifyGroupSearchAttributesForIBM(groupDN, groupFilter)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		
		if (Appname.equalsIgnoreCase("B2C TAM LDAP")){
			
			
			int count = SchemaAttributeObjects.accountAttributesB2CTAMLDAP.length;
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
				new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesB2CTAMLDAP[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("Business Objects EBI Replenishment")){
			
			
				int count = SchemaAttributeObjects.accountAttributesBusinessObjectsEBIReplenishment.length;
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
					new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesBusinessObjectsEBIReplenishment[i], "string");
				}
		}
		
		else if(Appname.equalsIgnoreCase("Business Objects EBI WoWlink")){
			
			
				int count = SchemaAttributeObjects.accountAttributesBusinessObjectsEBIWowLink.length;
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
					new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributesBusinessObjectsEBIWowLink[i], "string");
				}
		}

				new SchemaPage(driver, test)
				.verifyGroupNativeObjectType(groupnativeobject)
				.verifyGroupDisplayAttribute(groupdisplayattribute)
				.verifyGroupIdentityAttribute(groupidentityattribute);
				
				if (Appname.equalsIgnoreCase("B2C TAM LDAP")){
					
					
					int count2 = SchemaAttributeObjects.groupAttributesB2CTAMLDAP.length;
					for(int i=0; i<count2;i++) {
						if((i%5==0)||(i==count2-1)) {
							
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
						new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributesB2CTAMLDAP[i], "string");
					}
					
				}
				else if(Appname.equalsIgnoreCase("Business Objects EBI Replenishment")){
					
					int count1 = SchemaAttributeObjects.groupAttributesBusinessObjectsEBIReplenishment.length;
					for(int i=0; i<count1;i++) {
						if((i%5==0)||(i==count1-1)) {
							
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
						new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributesBusinessObjectsEBIReplenishment[i], "string");
					}
				}
				
				else if(Appname.equalsIgnoreCase("Business Objects EBI WoWlink")){
					
					int count1 = SchemaAttributeObjects.groupAttributesBusinessObjectsEBIWowLink.length;
					for(int i=0; i<count1;i++) {
						if((i%5==0)||(i==count1-1)) {
							
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
						new SchemaPage(driver, test).verifyGroupAttribute(SchemaAttributeObjects.groupAttributesBusinessObjectsEBIWowLink[i], "string");
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

