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

public class AppOnBoardingForSuccessFactor extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=5;
		reportname="FullAppOnBoardingSuccessFactor";
		browsername="chrome";
		
	}
	@Test(dataProvider="fetchdata")
	public void appInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String checkbox,
			String serviceURL,String username,String Accountentity,String customFilter, String MetadataList,String pageNo,
			String status,String nativeobject,String identityattribute,String accountcorrelation, String appAttrValue1,
			String IdAttrValue1, String appAttrValue2, String IdAttrValue2,
			String correlation,String creation,String manager,String customization,String entitement,String AppOwner,
			String AppRevoker,String AppCertifier,String taskname1, String taskname2){
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
		.checkForAuthoritative(checkbox)
		.clickOnConfiguration()
		.verifyServiceURL(serviceURL)
		.verifyUserName(username)
		.verifyAccountEntity(Accountentity)
		.verifyCustomFilter(customFilter)
		.verifyMetadataList(MetadataList)
		.verifyAccountPageSize(pageNo)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyIdentityAttribute(identityattribute);
		
		
			int count=SchemaAttributeObjects.accountAttributeSucessfactor.length;
		
			for(int i=0;i<count;i++) {
				if((i%15==0)||(i==count-1)) {
					
					clickByXpath(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
					//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
					
					try {
						WebDriverWait wait=new WebDriverWait(driver, 10);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaAccountAttribute+i+":attrName')]")));
						logStatus("pass", "The screenshot of Schema attributes", true);
					} catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
						System.out.println("Element not found");
					}catch (TimeoutException e) {
						System.out.println("Element not found");
					}
				}
				new SchemaPage(driver, test)
				.verifyAttribute(SchemaAttributeObjects.accountAttributeSucessfactor[i], "string");
		}
			new CorrelationPage(driver, test)
		
		.clickOnCorrelation()
		.verifyAccountCorrelationForAccountBasedCorrelation(accountcorrelation)
		.verifyAttributeCorrelationValue1(appAttrValue1, IdAttrValue1)
		.verifyAttributeCorrelationValue2(appAttrValue2, IdAttrValue2)
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
