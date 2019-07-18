package com.sailpoint.ApplicationOnBoarding;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sailpoint.pages.CorrelationPage;
import com.sailpoint.pages.HomePage;
import com.sailpoint.pages.SchemaPage;
import com.object.LocatorObjects;
import com.object.SchemaAttributeObjects;
import com.sailpoint.pages.AppConfigurationPage;

import wrappers.TestSuite;

public class AppOnBoardingForWebServices extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=11;
		reportname="FullAppOnBoardingWebServices";
		browsername="chrome";
		
	}
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String Checkbox,
			String Baseurl,String Authtype,String status,
			String nativeobject,String displayattribute,String identityattribute,
			String groupnativeobject, String groupdisplayattribute, String groupidentityattribute,
			String accountcorrelation,
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
			String AppAttrValue5,String IdAttrValue5, String AppAttrValue6,String IdAttrValue6,
			String AppAttrValue7,String IdAttrValue7, String AppAttrValue8,String IdAttrValue8,
			String correlation,String creation,String manager,String customization,String entitement,
			String AppOwner, String AppRevoker, String AppCertifier, String taskname) {
		
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
		.Stringbaseurl(Baseurl)
		.Authtype(Authtype)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		
		if(Appname.equalsIgnoreCase("Lastpass")) {
			
			int count=SchemaAttributeObjects.accountAttributelastpass.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 19)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributelastpass[i], "string");
		}
			
		}else if(Appname.equalsIgnoreCase("Sentient")){
		
		
			
				int count=SchemaAttributeObjects.accountAttributeSentient.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 12)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributeSentient[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("Akamai WAF")){
				
			int count=SchemaAttributeObjects.usertAttributeAkamai.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 12)
				.verifyAttributeFor(SchemaAttributeObjects.usertAttributeAkamai[i], "string");
			}
				
				new SchemaPage(driver, test)
				.verifyGroupNativeObjectType(groupnativeobject)
				.verifyGroupDisplayAttribute(groupdisplayattribute)
				.verifyGroupIdentityAttribute(groupidentityattribute);
				
				int count1 = SchemaAttributeObjects.groupAttributecrossAkamai.length;
				for(int j=0; j<count1;j++) {
					
					new SchemaPage(driver, test)
					.SchemaGroupScreenshot(j, 14)
					.verifyGroupAttribute(SchemaAttributeObjects.groupAttributecrossAkamai[j], "string");
				}
				
			}
		
		else if(Appname.equalsIgnoreCase("Vulnerability Management Server")){
			
			int count=SchemaAttributeObjects.accountAttributeVulnerability.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 18)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributeVulnerability[i], "string");
			}
				
				new SchemaPage(driver, test)
				.verifyGroupNativeObjectType(groupnativeobject)
				.verifyGroupDisplayAttribute(groupdisplayattribute)
				.verifyGroupIdentityAttribute(groupidentityattribute);
				
				int count1 = SchemaAttributeObjects.groupAttributeVulnerability.length;
				for(int j=0; j<count1;j++) {
					
					new SchemaPage(driver, test)
					.SchemaGroupScreenshot(j, 9)
					.verifyGroupAttribute(SchemaAttributeObjects.groupAttributeVulnerability[j], "string");
				}
				
			}
		
		else if(Appname.equalsIgnoreCase("Website Woolworths Money")){
			
			int count=SchemaAttributeObjects.UserAttributewoolworthsmoney.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 15)
				.verifyAttributeFor(SchemaAttributeObjects.UserAttributewoolworthsmoney[i], "string");
			}
				
				new SchemaPage(driver, test)
				.verifyGroupNativeObjectType(groupnativeobject)
				.verifyGroupDisplayAttribute(groupdisplayattribute)
				.verifyGroupIdentityAttribute(groupidentityattribute);
				
				int count1 = SchemaAttributeObjects.groupAttributewoolworthsmoney.length;
				for(int j=0; j<count1;j++) {
					
					new SchemaPage(driver, test)
					.SchemaGroupScreenshot(j, 14)
					.verifyGroupAttribute(SchemaAttributeObjects.groupAttributewoolworthsmoney[j], "string");
				}
				
			}
		else if(Appname.equalsIgnoreCase("Zendesk")){
			
			
			
			int count=SchemaAttributeObjects.accountAttributeZendesk.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 17)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributeZendesk[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("Zscaler Proxy")){
			
			
			
			int count=SchemaAttributeObjects.accountAttributeZscaler.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 6)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributeZscaler[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("APIGEE")){
			
			
			
			int count=SchemaAttributeObjects.userAttributeApigee.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 3)
				.verifyAttributeFor(SchemaAttributeObjects.userAttributeApigee[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("EDG VSTS")){
			
			
			
			int count=SchemaAttributeObjects.userAttributeEDGVsts.length;
		
			for(int i=0;i<count;i++) {
				
				new SchemaPage(driver, test)
				.SchemaAccountScreenshot(i, 17)
				.verifyAttributeFor(SchemaAttributeObjects.userAttributeEDGVsts[i], "string");
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
		.enterTaskName(taskname)
		.verifyTheTaskname(taskname)
		.clickOnTaskResults()
		.enterResultName(taskname)
		.verifyResults(taskname)
		.getStartDate()
		.getCompletedDate()
		.clickOnReturnToTask();	
		
		
		
	}
}
