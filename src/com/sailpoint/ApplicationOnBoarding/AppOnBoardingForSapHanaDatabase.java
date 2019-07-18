package com.sailpoint.ApplicationOnBoarding;

import java.sql.Driver;

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

public class AppOnBoardingForSapHanaDatabase extends TestSuite{

	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=16;
		reportname="FullAppOnBoardingSAPHANA Database";
		browsername="chrome";
	}
	
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname, String Appname1, String revoker, String owner, String Apptype,String Checkbox, 
			String Username, String Database, String Driver, String pagesize, String status, 
			String nativeobject, String displayattribute, String identityattribute,
			String groupnativeobject, String groupdisplayattribute, String groupidentityattribute ,
			String roleNativeoject, String roleDisplayattribute, String roleIdentityattribute, 
			String accountcorrelation, 
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
			String AppAttrValue5,String IdAttrValue5, String AppAttrValue6,String IdAttrValue6,
			String correlation, String creation, String customization, String manager, String entitement, 
			String AppOwner, String AppRevoker, String AppCertifier,
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
		.getDescription()
		.checkForAuthoritative(Checkbox)
		.clickOnConfiguration()
		.verifySapusername(Username)
		.verifyDatabaseURL(Database)
		.verifyDriver(Driver)
		.verifyPageSize_SAPHANA(pagesize)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		
		
	
		int count = SchemaAttributeObjects.accountAttributeSAPHanadatabase.length;
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
			new SchemaPage(driver, test).verifyAttributeForAccount(SchemaAttributeObjects.accountAttributeSAPHanadatabase[i], "string");
		}
	

		
		
		new SchemaPage(driver, test)
		.verifyRoleNativeObjectType(groupnativeobject)
		.verifyRoleDisplayAttribute(groupdisplayattribute)
		.verifyRoleIdentityAttribute(groupidentityattribute);
		
		
         
		
		int count1=SchemaAttributeObjects.roleAttributeSAPHanadatabase.length;
	
		for(int j=0;j<count1;j++) {
			if((j%5==0)||(j==count1-1)) {
				
				clickByXpath(LocatorObjects.SchemaRoleAttribute+j+":attrName')]");
				//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaRoleAttribute+j+":attrName')]")));
					logStatus("pass", "The screenshot of Schema attributes", true);
				}catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}catch (TimeoutException e) {
					System.out.println("Element not found");
				}
			}
			new SchemaPage(driver, test)
			.verifyAttributeForRole(SchemaAttributeObjects.roleAttributeSAPHanadatabase[j],"string");
		}
		
		new SchemaPage(driver, test)
		.verifyGroupNativeObjectForSwow(roleNativeoject)
		.verifyGroupDisplayAttributeForSwow(roleDisplayattribute)
		.verifyGroupIdentityAttributeForSwow(roleIdentityattribute);
	
		
		
		int count2 = SchemaAttributeObjects.groupAttributeSAPHanadatabase.length;
		for(int k=0; k<count2;k++) {
			if((k%5==0)||(k==count2-1)) {
				
				clickByXpath(LocatorObjects.SchemaGroupAttributeForSwow+k+":attrName')]");
				//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaGroupAttributeForSwow+k+":attrName')]")));
					logStatus("pass", "The screenshot of Schema attributes", true);
				}catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}catch (TimeoutException e) {
					System.out.println("Element not found");
				}
			}
			new SchemaPage(driver, test).verifyGroupAttributeForSwow(SchemaAttributeObjects.groupAttributeSAPHanadatabase[k], "string");
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
