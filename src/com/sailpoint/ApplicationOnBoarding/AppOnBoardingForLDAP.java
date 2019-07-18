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

public class AppOnBoardingForLDAP extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=7;
		reportname="FullAppOnBoardingLDAP";
		browsername="chrome";
		
	}
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String Checkbox,
			String useTLS, String Authtype,String user,String Host,String Port,String pagesize, String authsearchAttributes, 
			String accountScope, String accountDN, String accountfilter, String groupScope, String groupDN, 
			String groupfilter, String status,
			String nativeobject,String displayattribute,String identityattribute, 
			String privilegenative, String privilegedisplay,String privilegeidentity,
			String groupnative, String groupdisplay, String groupidentity,
			String accountcorrelation,
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
			String AppAttrValue5,String IdAttrValue5, String AppAttrValue6,String IdAttrValue6,
			String correlation,String creation,String manager,String customization,String entitement,
			String AppOwner, String AppRevoker, String AppCertifier,
			String taskname1, String taskname2, String taskname3) {
		
		startTest("Application details and configuration of   "+Appname);
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
		.verifyUseTLS(useTLS)
		.verifyAuthenticationType(Authtype)
	    .verifyUserName(user)
	    .verifyHost(Host)
	    .verifyPort(Port)
	    .verifyPagesize_LDAP(pagesize)
	    .Authsearch(authsearchAttributes)
	    .verifyAccountSearchAttributesForLDAP(accountScope, accountDN, accountfilter)
	    .verifyGroupSearchAttributesForLDAP(groupScope, groupDN, groupfilter)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		
		if(Appname.equalsIgnoreCase("B2B TAM LDAP")) {
			
			int count = SchemaAttributeObjects.accountAttributesB2BTAMLDAP.length;
		
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
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesB2BTAMLDAP[i], "string");
		}
			
			new SchemaPage(driver, test)
			.verifyGroupNativeObjectType(groupnative)
			.verifyGroupDisplayAttribute(groupdisplay)
			.verifyGroupIdentityAttribute(groupidentity);
			
			int count1=SchemaAttributeObjects.groupAttributesB2BTAMLDAP.length;
		
			for(int j=0;j<count1;j++) {
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
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesB2BTAMLDAP[j], "string");
			}
		
		}
		
		else if(Appname.equalsIgnoreCase("SAP IDM")){
			
			
				int count=SchemaAttributeObjects.accountAttributesSAP_IDM.length;
			
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
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesSAP_IDM[i], "string");
			}
				
				
				new SchemaPage(driver, test)
				.verifyPrivilegeNativeObjectType(privilegenative)
				.verifyPrivilegeDisplayAttribute(privilegedisplay)
				.verifyPrivilegeIdentityAttribute(privilegeidentity);
				
				int count1=SchemaAttributeObjects.privillegeAttributesSAP_IDM.length;
				
				for(int j=0;j<count1;j++) {
					if((j%9==0)||(j==count1-1)) {
						
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
					.verifyAttributeForRole(SchemaAttributeObjects.privillegeAttributesSAP_IDM[j], "string");
			}
				
				
				new SchemaPage(driver, test)
				.verifyGroupNativeObjectForSwow(groupnative)
				.verifyGroupDisplayAttributeForSwow(groupdisplay)
				.verifyGroupIdentityAttributeForSwow(groupidentity);
				
				int count2=SchemaAttributeObjects.groupAttributesSAP_IDM.length;
				
				for(int k=0;k<count2;k++) {
					if((k%11==0)||(k==count2-1)) {
						
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
					new SchemaPage(driver, test)
					.verifyGroupAttributeForSwow(SchemaAttributeObjects.groupAttributesSAP_IDM[k], "string");
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


