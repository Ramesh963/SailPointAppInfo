package com.sailpoint.ApplicationOnBoarding;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.object.SchemaAttributeObjects;
import com.sailpoint.pages.CorrelationPage;
import com.sailpoint.pages.HomePage;
import com.sailpoint.pages.SchemaPage;

import wrappers.TestSuite;

public class AppOnBoardingForJDBC extends TestSuite {
	@BeforeSuite
	public void beforeClass() {
		testdatasheetname="SailpointAllAppOnboarding";
		sheetnum=1;
		reportname="FullAppOnBoardingJDBC";
		browsername="chrome";
		
	}
	@Test(dataProvider="fetchdata")
	public void AppInfo(String Appname,String Appname1,String revoker,String owner,String Apptype,String Checkbox,String connectionuser,String databaseurl,String JDBCdriver,String status,
			String nativeobject,String displayattribute,String identityattribute,String groupnativeobject,String groupdisplayattribute,String groupidentityattribute,
			String accountcorrelation,String correlation,String creation,String customization,String manager,String entitement,String AppOwner,String AppRevoker,String appcertifiers, String taskname1, String taskname2, String taskname3) {
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
		.verifyConnectionUser(connectionuser)
		.verifyDataBaseUrl(databaseurl)
		.verifyJDBCdriver(JDBCdriver)
		.clickTheTestConnection()
		.checkTestConnectionStatus(status)
		.clickOnMerging()
		.verifyOnMerging()
		.clickSchema()
		.verifyNativeObjectType(nativeobject)
		.verifyDisplayAttribute(displayattribute)
		.verifyIdentityAttribute(identityattribute);
		
		if(Appname.equalsIgnoreCase("BWS Online")) {
			
		
			int count=SchemaAttributeObjects.accountAttributesBWSOnline.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesBWSOnline[i], "string");
		}
			
		}else if(Appname.equalsIgnoreCase("CA Capacity Manager")){
			
		
			
				int count=SchemaAttributeObjects.accountAttributesCACapaciyManager.length;
			
				for(int i=0;i<count;i++) {
					new SchemaPage(driver, test)
					.verifyAttributeFor(SchemaAttributeObjects.accountAttributesCACapaciyManager[i], "string");
			}
		}else if(Appname.equalsIgnoreCase("CA Performance Center")){
			
			
			
			int count=SchemaAttributeObjects.accountAttributesCAPerformancecenter.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesCAPerformancecenter[i], "string");
		}
	}
		
         else if(Appname.equalsIgnoreCase("Category Knowledge Base DB")){
			
			
			
			int count=SchemaAttributeObjects.accountAttributesCategoryknowledge.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesCategoryknowledge[i], "string");
		}
	}
		
         else if(Appname.equalsIgnoreCase("CDRator")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesCDrator.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesCDrator[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("CEFTRON")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesCeftron.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesCeftron[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("Channel Clustering RSO")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesChannelclusteringRSO.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesChannelclusteringRSO[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("Contractors Database")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesContractorsDatabase.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesContractorsDatabase[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("Countdown Online")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesCowntdownOnlineApplication.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesCowntdownOnlineApplication[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("Customer Contact Management")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesCustomerContactmanagement.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesCustomerContactmanagement[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("Customer Led Rostering")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesCustomerLED.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesCustomerLED[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("Dan Murphy Site Management")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesDanMurphySiteManagement.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesDanMurphySiteManagement[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("Dan Murphys DSS")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesDanMurphysDSS.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesDanMurphysDSS[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("Dan Murphys ODH GUI")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesDanMurphysODHGUI.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesDanMurphysODHGUI[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("ECM WoW Online")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesECMWowOnline.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesECMWowOnline[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("Enterprise Data Warehouse EDW")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesEnterprisedata.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesEnterprisedata[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("ePay")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesepay.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesepay[i], "string");
 		}
 	}
         else if(Appname.equalsIgnoreCase("EveryDayGiftcard Online portal - Contact Centre")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesEverydayGiftcard.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesEverydayGiftcard[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("i-Demo")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesiDemo.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesiDemo[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Wyong RDC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesWyongRDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesWyongRDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Sydney RDC TC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesSydneyRDCTC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesSydneyRDCTC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Sydney NDC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesSydneyNDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesSydneyNDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Sydney LDC (Pilot for JDA WM)")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesSydneyLDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesSydneyLDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Melbourne LDC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesMelbourneLDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesMelbourneLDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Wodonga RDC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesWodongaRDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesWodongaRDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Melbourne NDC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesMelbourneNDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesMelbourneNDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Mulgrave Produce DC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesMulgraveProduceDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesMulgraveProduceDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Adelaide RDC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesAdelaideRDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesAdelaideRDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Perth RDC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesPerthRDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesPerthRDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Brisbane RDC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesBrisbaneRDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesBrisbaneRDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Brisbane LDC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesBrisbaneLDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesBrisbaneLDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Big W - Hoxton Park DC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesHoxtonParkDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesHoxtonParkDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Breadalbane DC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesBreadalbanDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesBreadalbanDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Tasmania RDC")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesTasmaniaRDC.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesTasmaniaRDC[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("IPFX")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesIPFX.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesIPFX[i], "string");
 		}
 	}
		
         else if(Appname.equalsIgnoreCase("JDA - Transport Management System")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesJDATransport.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesJDATransport[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("JDA BIGW Profiler")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesJDABIGW.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesJDABIGW[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("JDA Demand Manager - BigW")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesJDADemandManagerBigW.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesJDADemandManagerBigW[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("JDA Demand Manager - BigW Promo")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesJDADemandManagerBigWPromo.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesJDADemandManagerBigWPromo[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("JDA Demand Manager - Promo - Australia")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesJDADemandManagerBigWPromoAustralia.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesJDADemandManagerBigWPromoAustralia[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("JDA Demand Manager - Promo - New Zealand")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesJDADemandManagerBigWPromoNewZealand.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesJDADemandManagerBigWPromoNewZealand[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("JDA Demand Manager - SuperMarket - Australia")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesJDADemandManagerSupermarketAustralia.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesJDADemandManagerSupermarketAustralia[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("JDA Demand Manager - SuperMarket - New Zealand")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesJDADemandManagerSupermarketNewzealand.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesJDADemandManagerSupermarketNewzealand[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("JDA FulFilment")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesJDAFulfillment.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesJDAFulfillment[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("JDA SuperMarket Profiler")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesJDASupermarketprofiler.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesJDASupermarketprofiler[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("Kronos Time Attendance")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesKronosTime.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesKronosTime[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("Lease Management System PEPS")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesLeaseManagementPeps.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesLeaseManagementPeps[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("LoadRunner")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesLoadrunner.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesLoadrunner[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("MAXIMO")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesMaximo.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesMaximo[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("McAfee ePO")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesMcafeeEpo.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesMcafeeEpo[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("McAfee ePO53")){
  			
  			
  			
  			int count=SchemaAttributeObjects.accountAttributesMcafeeePO53.length;
  		
  			for(int i=0;i<count;i++) {
  				new SchemaPage(driver, test)
  				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesMcafeeePO53[i], "string");
  		}
  	}
		
         else if(Appname.equalsIgnoreCase("OFS")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOFS.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOFS[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Onesource FBT")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOnesourceFBT.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOnesourceFBT[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Beef Daily Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityBeefDaily.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityBeefDaily[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Beef Weekly Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityBeefweekly.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityBeefweekly[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - BurRis Weekly Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityBurisweekly.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityBurisweekly[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Cond Weekly Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityCondweekly.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityCondweekly[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Game Weekly Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityGameweekly.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityGameweekly[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Lamb Daily Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityLambdaily.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityLambdaily[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Lamb Weekly Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityLambweekly.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityLambweekly[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Offal Daily Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityOffaldaily.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityOffaldaily[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Petfood Daily Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimitypetfooddaily.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimitypetfooddaily[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Pork Daily Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityporkdaily.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityporkdaily[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Pork Weekly Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityporkweekly.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityporkweekly[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Poultry Daily Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimitypoultrydaily.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimitypoultrydaily[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Poultry Weekly Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityprepmealweekly.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityprepmealweekly[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - PrepMeal Weekly Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityprepmealweekly.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityprepmealweekly[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - ServMeat Weekly Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimityServmeatweekly.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimityServmeatweekly[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Optimity - Smallgds Weekly Curr")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesOptimitysmallgds.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesOptimitysmallgds[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Pass BigW and Spaceman BigW")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesPassbigw.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesPassbigw[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Power Tax Calculator")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesPowertax.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesPowertax[i], "string");
   		}
   	}
		
		
         else if(Appname.equalsIgnoreCase("PWRM")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesPWRM.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesPWRM[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Pyramid")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesPyramid.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesPyramid[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Qlikview Risk")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesQlikview.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesQlikview[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Replenishment Central")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesReplenishmentcentral.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesReplenishmentcentral[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Retalix LMS")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesRetailix.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesRetailix[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Route Planner WOW Online")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesRouteplanner.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesRouteplanner[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("SMART")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesSmart.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesSmart[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Store Locator")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesStorelocator.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesStorelocator[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Swisslog WMS - Hume DC")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesSwisslogHume.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesSwisslogHume[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Swisslog WMS - Minchinbury DC")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesSwisslogMinchinbury.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesSwisslogMinchinbury[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Tactics")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesTactics.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesTactics[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("TeamMate")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesTeammate.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesTeammate[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("Unit Load Device Tracking System ULD UTS")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesUnitload.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesUnitload[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("WDL Order Review")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesWDLOrder.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesWDLOrder[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("WMS 3-3 Broadmeadows DC DB")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesWMSBroadmeadows.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesWMSBroadmeadows[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("WMS 4-1 Monarto DC DB")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesMonartoDC.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesMonartoDC[i], "string");
   		}
   	}
		

         else if(Appname.equalsIgnoreCase("WMS 4-1 Warwick DC DB")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesWarwickDC.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesWarwickDC[i], "string");
   		}
   	}
		

         else if(Appname.equalsIgnoreCase("WMS JDA - Sydney LDC")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesWMSJDA.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesWMSJDA[i], "string");
   		}
   	}
		

         else if(Appname.equalsIgnoreCase("WOW Online - Site Management")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesWowOnline.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesWowOnline[i], "string");
   		}
   	}
		

         else if(Appname.equalsIgnoreCase("XBR - Legacy")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesXBRLegacy.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesXBRLegacy[i], "string");
   		}
   	}
		

         else if(Appname.equalsIgnoreCase("InforWHMS - Auckland NDC")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesAucklandNDC.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesAucklandNDC[i], "string");
   		}
   	}
		

         else if(Appname.equalsIgnoreCase("InforWHMS - Auckland RDC")){
   			
   			
   			
   			int count=SchemaAttributeObjects.accountAttributesAucklandRDC.length;
   		
   			for(int i=0;i<count;i++) {
   				new SchemaPage(driver, test)
   				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesAucklandRDC[i], "string");
   		}
   	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Christchurch RDC")){
    			
    			
    			
    			int count=SchemaAttributeObjects.accountAttributesChristchurchRDC.length;
    		
    			for(int i=0;i<count;i++) {
    				new SchemaPage(driver, test)
    				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesChristchurchRDC[i], "string");
    		}
    	}
		
         else if(Appname.equalsIgnoreCase("InforWHMS - Palmerston North RDC")){
    			
    			
    			
    			int count=SchemaAttributeObjects.accountAttributesPalmerstonRDC.length;
    		
    			for(int i=0;i<count;i++) {
    				new SchemaPage(driver, test)
    				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesPalmerstonRDC[i], "string");
    		}
    	}
		
         else if(Appname.equalsIgnoreCase("File Integrity Monitoring")){
    			
    			
    			
    			int count=SchemaAttributeObjects.accountAttributesFileIntegrity.length;
    		
    			for(int i=0;i<count;i++) {
    				new SchemaPage(driver, test)
    				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesFileIntegrity[i], "string");
    		}
    	}
		
         else if(Appname.equalsIgnoreCase("Endeavour Marketplace")){
 			
 			
 			
 			int count=SchemaAttributeObjects.accountAttributesEndeavormarketplace.length;
 		
 			for(int i=0;i<count;i++) {
 				new SchemaPage(driver, test)
 				.verifyAttributeFor(SchemaAttributeObjects.accountAttributesEndeavormarketplace[i], "string");
 		}
 	}
		
		
		new SchemaPage(driver, test)
		.verifyGroupNativeObjectType(groupnativeobject)
		.verifyGroupDisplayAttribute(groupdisplayattribute)
		.verifyGroupIdentityAttribute(groupidentityattribute);
		
		if(Appname.equalsIgnoreCase("BWS Online")) {
			
		
			int count=SchemaAttributeObjects.groupAttributesBWSOnline.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesBWSOnline[i], "string");
		}
		}else if(Appname.equalsIgnoreCase("CA Performance Centerr")) {
			
			
				int count=SchemaAttributeObjects.groupAttributesCAPerformancecenter.length;
			
				for(int i=0;i<count;i++) {
					new SchemaPage(driver, test)
					.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesCAPerformancecenter[i], "string");
			}
		}
		
		else if(Appname.equalsIgnoreCase("CDRator")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesCDrator.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesCDrator[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("CEFTRON")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesCeftron.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesCeftron[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Countdown Online")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesCowntdownOnlineApplication.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesCowntdownOnlineApplication[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Customer Contact Management - Application Access")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesCustomerContactmanagement.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesCustomerContactmanagement[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Customer Led Rostering")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesCustomerLED.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesCustomerLED[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Dan Murphy Site Management")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesDanMurphySiteManagement.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesDanMurphySiteManagement[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Dan Murphys ODH GUI")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesDanMurphysODHGUI.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesDanMurphysODHGUI[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("ECM WoW Online")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesECMWowOnline.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesECMWowOnline[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("ePay")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesepay.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesepay[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("EveryDayGiftcard Online portal - Contact Centre")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesEverydayGiftcard.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesEverydayGiftcard[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Wyong RDC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesWyongRDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesWyongRDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Sydney RDC TC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesSydneyRDCTC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesSydneyRDCTC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Sydney NDC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesSydneyNDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesSydneyNDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Sydney LDC (Pilot for JDA WM)")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesSydneyLDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesSydneyLDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Melbourne LDC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesMelbourneLDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesMelbourneLDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Wodonga RDC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesWodongaRDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesWodongaRDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Melbourne NDC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesMelbourneNDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesMelbourneNDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Mulgrave Produce DC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesMulgraveProduceDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesMulgraveProduceDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Adelaide RDC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesAdelaideRDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesAdelaideRDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Perth RDC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesPerthRDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesPerthRDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Brisbane RDC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesBrisbaneRDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesBrisbaneRDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Brisbane LDC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesBrisbaneLDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesBrisbaneLDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Big W - Hoxton Park DC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesHoxtonParkDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesHoxtonParkDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Breadalbane DC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesBreadalbanDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesBreadalbanDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("InforWHMS - Tasmania RDC")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesTasmaniaRDC.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesTasmaniaRDC[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("IPFX")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesIPFX.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesIPFX[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("JDA - Transport Management System")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesJDATransport.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesJDATransport[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("JDA BIGW Profiler")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesJDABIGW.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesJDABIGW[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("JDA Demand Manager - BigW")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesJDADemandManagerBigW.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesJDADemandManagerBigW[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("JDA Demand Manager - BigW Promo")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesJDADemandManagerBigWPromo.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesJDADemandManagerBigWPromo[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("JDA Demand Manager - Promo - Australia")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesJDADemandManagerBigWPromoAustralia.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesJDADemandManagerBigWPromoAustralia[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("JDA Demand Manager - Promo - New Zealand")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesJDADemandManagerBigWPromoNewZealand.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesJDADemandManagerBigWPromoNewZealand[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("JDA Demand Manager - SuperMarket - Australia")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesJDADemandManagerSupermarketAustralia.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesJDADemandManagerSupermarketAustralia[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("JDA Demand Manager - SuperMarket - New Zealand")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesJDADemandManagerSupermarketNewzealand.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesJDADemandManagerSupermarketNewzealand[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("JDA FulFilment")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesJDAFulfillment.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesJDAFulfillment[i], "string");
		}
	}
		
		
		else if(Appname.equalsIgnoreCase("JDA SuperMarket Profiler")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesJDASupermarketprofiler.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesJDASupermarketprofiler[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Kronos Time Attendance")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesKronosTime.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesKronosTime[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Lease Management System PEPS")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesLeaseManagementPeps.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesLeaseManagementPeps[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("LoadRunner")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesLoadrunner.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesLoadrunner[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("MAXIMO")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesMaximo.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesMaximo[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("McAfee ePO")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesMcafeeEpo.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesMcafeeEpo[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("McAfee ePO53")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesMcafeeePO53.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesMcafeeePO53[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("OFS")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOFS.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOFS[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Onesource FBT")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOnesourceFBT.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOnesourceFBT[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Beef Daily Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityBeefDaily.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityBeefDaily[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Beef Weekly Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityBeefweekly.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityBeefweekly[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - BurRis Weekly Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityBurisweekly.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityBurisweekly[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Cond Weekly Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityCondweekly.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityCondweekly[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Game Weekly Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityGameweekly.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityGameweekly[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Lamb Daily Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityLambdaily.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityLambdaily[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Lamb Weekly Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityLambweekly.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityLambweekly[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Offal Daily Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityoffaldaily.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityoffaldaily[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Petfood Daily Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimitypetfooddaily.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimitypetfooddaily[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Pork Daily Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityporkdaily.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityporkdaily[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Pork Weekly Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityporkweekly.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityporkweekly[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Poultry Daily Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimitypoultrydaily.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimitypoultrydaily[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - PrepMeal Weekly Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityprepmealweekly.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityprepmealweekly[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - ServMeat Weekly Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimityServmeatweekly.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimityServmeatweekly[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Optimity - Smallgds Weekly Curr")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesOptimitysmallgds.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesOptimitysmallgds[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Pass BigW and Spaceman BigW")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesPassbigw.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesPassbigw[i], "string");
		}
	}
		
		else if(Appname.equalsIgnoreCase("Power Tax Calculator")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesPowertax.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesPowertax[i], "string");
				
		}
	}
		
        else if(Appname.equalsIgnoreCase("PWRM")) {
			
			
			int count=SchemaAttributeObjects.groupAttributesPWRM.length;
		
			for(int i=0;i<count;i++) {
				new SchemaPage(driver, test)
				.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesPWRM[i], "string");
				
		}
	}
		
          else if(Appname.equalsIgnoreCase("Pyramid")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesPyramid.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesPyramid[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("Replenishment Central")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesReplenishmentcentral.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesReplenishmentcentral[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("Retalix LMS")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesRetailix.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesRetailix[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("SMART")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesSmart.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesSmart[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("Store Locatorr")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesStorelocator.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesStorelocator[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("Swisslog WMS - Hume DC")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesSwisslogHume.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesSwisslogHume[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("Swisslog WMS - Minchinbury DC")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesSwisslogMinchinbury.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesSwisslogMinchinbury[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("Tactics")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesTactics.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesTactics[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("WDL Order Review")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesWDLOrder.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesWDLOrder[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("WMS 3-3 Broadmeadows DC DBr")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesWMSBroadmeadows.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesWMSBroadmeadows[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("WMS 3-3 Minchinbury DC DB")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesWMSMinchbury.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesWMSMinchbury[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("WMS 4-1 Monarto DC DBr")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesMonartoDC.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesMonartoDC[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("WMS 4-1 Warwick DC DB")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesWarwickDC.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesWarwickDC[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("XBR - Legacy")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesXBRLegacy.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesXBRLegacy[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("InforWHMS - Auckland NDC")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesAucklandNDC.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesAucklandNDC[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("InforWHMS - Auckland RDC")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesAucklandRDC.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesAucklandRDC[i], "string");
		
         }
     }
		
		

          else if(Appname.equalsIgnoreCase("InforWHMS - Palmerston North RDC")) {
	
	
	int count=SchemaAttributeObjects.groupAttributesPalmerstonRDC.length;

	for(int i=0;i<count;i++) {
		new SchemaPage(driver, test)
		.verifyGroupAttribute(SchemaAttributeObjects.groupAttributesPalmerstonRDC[i], "string");
		
         }
     }
		
		

         
		
		
			new CorrelationPage(driver, test)
		
		.clickOnCorrelation()
		.verifyAccountCorrelation(accountcorrelation)
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
		.verifyAppCertifiers(appcertifiers);
			
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
