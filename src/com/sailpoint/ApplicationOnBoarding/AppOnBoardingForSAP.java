package com.sailpoint.ApplicationOnBoarding;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.object.SchemaAttributeObjects;
import com.sailpoint.pages.CorrelationPage;
import com.sailpoint.pages.HomePage;
import com.sailpoint.pages.SchemaPage;

import wrappers.TestSuite;

public class AppOnBoardingForSAP extends TestSuite{
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=3;
		reportname="FullAppOnBoardingSAPReport";
		browsername="chrome";
		
	}

	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String Checkbox,
			String host, String sysnum,String Clientnum,String language,String username,String buildmap,String status,
			String nativeobject,String displayobject,String identityobject,
			String rolenativeobject,String roledisplayobject,String roleidentityobject,
			String profilenativeobject,String profiledisplayobject,String profileidentityobject, 
			String accountcorrelation,
			String AppAttrValue1,String IdAttrValue1, String AppAttrValue2,String IdAttrValue2,
			String AppAttrValue3,String IdAttrValue3, String AppAttrValue4,String IdAttrValue4,
			String AppAttrValue5,String IdAttrValue5,
			String correlation,String creation,String customization,String manager,String entitement,
			String AppOwner,String AppRevoker,String AppCertifier, 
			String taskname1,String taskname2, String taskname3, String taskname4){
		
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
		.verifySAPHost(host)
		.verifySystemNum(sysnum)
		.verifyClientNum(Clientnum)
		.verifyClientLang(language)
		.verifyUserName(username)
		.verifyBuildMap(buildmap)
		.clickTheTestConnection()
		.checkTestConnectionStatusAll(status)
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayobject)
		.verifyIdentityAttribute(identityobject);
		
		
		 
		   
			   int count=SchemaAttributeObjects.accountAttributeSAPDirect.length; 
			   
			   for(int i=0;i<count;i++) {
				   
				   new SchemaPage(driver, test)
				   .SchemaAccountScreenshot(i, 11)
				   .verifyAttributeForAccount(SchemaAttributeObjects.accountAttributeSAPDirect[i],"string"); 
			   
			   } 
		
		 
		new SchemaPage(driver, test)
		.verifyRoleNativeObjectType(rolenativeobject)
		.verifyRoleDisplayAttribute(roledisplayobject)
		.verifyRoleIdentityAttribute(roleidentityobject);
		
		
		  
		   
			   int count1=SchemaAttributeObjects.roleAttributeSAPDirect.length;
			   
			   for(int j=0;j<count1;j++) { 
					new SchemaPage(driver, test)
					.SchemaRoleScreenshot(j, 7)
				   .verifyAttributeForRole(SchemaAttributeObjects.roleAttributeSAPDirect[j],"string"); 
			   }
			  
		
		
		 
		
		new SchemaPage(driver, test)
		.verifyGroupNativeObjectForSwow(profilenativeobject)
		.verifyGroupDisplayAttributeForSwow(profiledisplayobject)
		.verifyGroupIdentityAttributeForSwow(profileidentityobject);
		
		
		  
		  
		   int count2=SchemaAttributeObjects.groupAttributeSAPDirect.length; 
		  
		   for(int k=0;k<count2;k++) { 
			   
			   new SchemaPage(driver, test)
			   .SchemaGroupForSWOWScreenshot(k, 5)
			   .verifyGroupAttributeForSwow(SchemaAttributeObjects.groupAttributeSAPDirect[k],"string"); 
		   }
			  
		
		new CorrelationPage(driver, test)
		.clickOnCorrelation()
		.verifyAccountCorrelationForAccountBasedCorrelation(accountcorrelation)
		.verifyAttributeCorrelationValue1(AppAttrValue1, IdAttrValue1)
		.verifyAttributeCorrelationValue2ForAD(AppAttrValue2, IdAttrValue2)
		.verifyAttributeCorrelationValue3(AppAttrValue3, IdAttrValue3)
		.verifyAttributeCorrelationValue4(AppAttrValue4, IdAttrValue4)
		.verifyAttributeCorrelationValue5_ForSAPDirect(AppAttrValue5, IdAttrValue5)
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
		.clickOnReturnToTask();;
	}
}
