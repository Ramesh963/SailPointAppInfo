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

public class AppOnBoardingForDelimited extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=18;
		reportname="FullAppOnBoardingdelimitedFileRport";
		browsername="chrome";
		
	}

	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String Checkbox,String path,
			String parsetype,String filetransport, String delimValue, String noOfLines, String filterempty, String status,
			String nativeobject,String displayattribute,String identityattribute,
			String accountcorrelation,String correlation,String creation,String customization,String manager,String entitement,
			String AppOwner,String AppRevoker,String AppCertifier,String taskname,String taskname2,String taskname3) {
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
		.verifyTheFilePath(path)
		.checkForParsingType(parsetype)
		.fileTrasport(filetransport)
		.checkDelimiterValue(delimValue)
		.getNumberOfLinesToSkip(noOfLines)
		.checkForFilterEmpty(filterempty)
		.clickTheTestConnection()
		.checkTestConnectionStatus(status)
		.clickOnMerging()
		.verifyOnMerging()
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		
		  if(Appname.equalsIgnoreCase("ALH")) {
		  
		  
			  int count=SchemaAttributeObjects.accountAttributesALH.length;
		  
			  for(int i=0;i<count;i++) { 
				 
				  new SchemaPage(driver, test)
				  .SchemaAccountScreenshot(i, 10)
				  .verifyAttribute(SchemaAttributeObjects.accountAttributesALH[i], "string");
				  }
		  	}
		  else  if(Appname.equalsIgnoreCase("HK")) {
		  
		  
			  int count1=SchemaAttributeObjects.accountAttributesHK.length;
		  
			  for(int j=0;j<count1;j++) { 
				 
				  new SchemaPage(driver, test)
				  .SchemaAccountScreenshot(j, 9)
				  .verifyAttribute(SchemaAttributeObjects.accountAttributesHK[j], "string");
				  }
		  	}
		  
		  else  if(Appname.equalsIgnoreCase("Pay Global")) {
		  
		  
			  int count2=SchemaAttributeObjects.accountAttributesPayGlobal.length;
		  
			  for(int k=0;k<count2;k++) { 
				 
				  new SchemaPage(driver, test)
				  .SchemaAccountScreenshot(k, 7)
				  .verifyAttribute(SchemaAttributeObjects.accountAttributesPayGlobal[k], "string");
				  }
		  	}
		 
		  else if(Appname.equalsIgnoreCase("Aztec")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesAztec.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 3)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesAztec[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("CA Service Operations Insight SOI")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesSOI.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 6)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesSOI[i], "string");
			}
		}
		  
		  
		  else if(Appname.equalsIgnoreCase("Quantum")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesQuantum.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 7)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesQuantum[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("KIRK Indent Order Management")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesKIRK_IndentOrderManagement.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 10)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesKIRK_IndentOrderManagement[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Online Banking - ANZ")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesOnlineBankingANZ.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 4)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOnlineBankingANZ[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Online Banking - CBA")){
				
				int count=SchemaAttributeObjects.accountAttributesOnlineBankingCBA.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 10)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOnlineBankingCBA[i], "string");
				}
		  }
					
		  else if(Appname.equalsIgnoreCase("Online Banking - Exigo")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesOnlineBankingExigo.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 4)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOnlineBankingExigo[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Online Banking - HSBC")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesOnlineBankingHSBC.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 6)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOnlineBankingHSBC[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Online Banking - NAB")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesOnlineBankingNAB.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 3)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOnlineBankingNAB[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Online Banking - Westpac")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesOnlineBankingWestpac.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 13)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOnlineBankingWestpac[i], "string");
			}
		}
		  
		  
		  else if(Appname.equalsIgnoreCase("Optomate")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesOptomate.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 15)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptomate[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Pegasus")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesPegasus.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 8)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesPegasus[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Pulse")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesPulse.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 12)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesPulse[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Telco - Hybris")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesHybris.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 7)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesHybris[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Sap C4c")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesSapc4c.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 9)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesSapc4c[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Webmethods IS")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesWebmethodsIS.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 1)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesWebmethodsIS[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Webmethods Trading Networks")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesWebmethodsTradingnetworks.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 7)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesWebmethodsTradingnetworks[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Informatica - UAT")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesInformaticaApplication.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 3)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesInformaticaApplication[i], "string");
			}
		}
		  
		  else if(Appname.equalsIgnoreCase("Ariba")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesAriba.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 15)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesAriba[i], "string");
			}
		}
		  
		  
		  
		  else if(Appname.equalsIgnoreCase("Qlikview Logistics")){
				
				
				
				int count=SchemaAttributeObjects.accountAttributesQlikviewLogistics.length;
			
				for(int i=0;i<count;i++) {
					
					new SchemaPage(driver, test)
					.SchemaAccountScreenshot(i, 4)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesQlikviewLogistics[i], "string");
			}
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
		.enterTaskName(taskname)
		.verifyTheTaskname(taskname)
		.enterTaskName(taskname2)
		.verifyTheTaskname(taskname2)
		.enterTaskName(taskname3)
		.verifyTheTaskname(taskname3)
		.clickOnTaskResults()
		.enterResultName(taskname)
		.verifyResults(taskname)
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
