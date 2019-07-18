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

public class AppOnBoardingForOpenLdap extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding"; 
		sheetnum=15;
		reportname="FullAppOnBoardingOpen LDAP - Direct";
		browsername="chrome";
		
	}
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String Checkbox,
			String usetls, String authtype, String user, String Host2,String port,String Pagesize,String Authsearch,
			String groupObjType, String groupDN, String status,
			String nativeobject,String displayattribute,String identityattribute,
			String groupnative,String groupdisplay,String groupidentity,
			String accountcorrelation,
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
			String correlation,String creation,String manager,String customization,String entitement,
			String AppOwner, String AppRevoker, String AppCertifier,
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
		.verifyUseTLS(usetls)
		.verifyAuthenticationType(authtype)
		.verifyUser(user)
	    .verifyHost2(Host2)
	    .verifyPortforOPenLDAP(port)
	    .verifyPagesize(Pagesize)
	    .Authsearch(Authsearch)
	    .verifyGroupSearchScopeForOpenLDAP(groupObjType, groupDN)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		
		if(Appname.equalsIgnoreCase("RedHat LDAP")) {
		
			int count=SchemaAttributeObjects.accountAttributesRedHatLDAP.length;
		
			for(int i=0;i<count;i++) {
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
				new SchemaPage(driver, test)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesRedHatLDAP[i], "string");
			}
		}
		
		new SchemaPage(driver, test)
		.verifyGroupNativeObjectType(groupnative)
		.verifyGroupDisplayAttribute(groupdisplay)
		.verifyGroupIdentityAttribute(groupidentity);
		
		if(Appname.equalsIgnoreCase("RedHat LDAP")) {
			
		
			int count1=SchemaAttributeObjects.groupAttributesRedHatLDAP.length;
		
			for(int j=0;j<count1;j++) {
				if((j%4==0)||(j==count1-1)) {
					
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
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesRedHatLDAP[j], "string");
				
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


