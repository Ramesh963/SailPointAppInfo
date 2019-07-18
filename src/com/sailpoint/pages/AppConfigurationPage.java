package com.sailpoint.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sailpoint.pages.AppConfigurationPage;
import com.object.LocatorObjects;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BaseTest;

public class AppConfigurationPage extends BaseTest{
	
	public AppConfigurationPage(RemoteWebDriver driver1,ExtentTest test1) {
		this.driver=driver1;
		this.test=test1;
	}

	public AppConfigurationPage clickOnConfiguration() {
		 
		clickByXpath(LocatorObjects.clickOnConfiguration);
		System.out.println("clicked config");
		
		return this;
	}
	
	public AppConfigurationPage verifyTheFilePath(String text) {
		try {
			WebDriverWait wait=new WebDriverWait(driver, 40);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.XpathforFilePath)));
			String actual=driver.findElementByXPath(LocatorObjects.XpathforFilePath).getAttribute("value");
			if(actual.equalsIgnoreCase(text)) {
				logStatus("pass", "The file path of Application is "+" '"+actual+"' "+" matched correctly", true);
				System.out.println("file path verified");
			}else {
				logStatus("fail", "The file path of Application is "+" '"+actual+"' "+" not matched", true);
				System.out.println("file path not verified");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}
		
		
		return this;
	}
	public AppConfigurationPage checkForParsingType(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.XpathForParsingTypeIcon)));
		boolean obj=driver.findElementByXPath(LocatorObjects.XpathForParsingTypeIcon).isSelected();
		if(obj==true) {
			String Type=driver.findElementByXPath(LocatorObjects.XpathForParsingType).getText();
			System.out.println("Parsing type is clicked on"+" '"+Type+"' ");
			if(Type.equalsIgnoreCase(text)) {
				logStatus("pass", "Parsing type is clicked on "+" '"+Type+"' "+ "and matched correctly", false);
		}else {
			logStatus("fail", "Parsing type is"+" '"+Type+"' "+ "not matched ", false);
		}
					}
		return this;
	}
	public AppConfigurationPage checkDelimiterValue(String text) {
		try {
			String value=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,':r_id_account:j_idt')])[5]").getAttribute("value");
			if(value.equalsIgnoreCase(text)) {
				logStatus("pass", "The value of Delimiter is = "+" '"+value+"' matched", false);
				System.out.println("Delimiter="+" '"+value+"' ");
			}
			else {
				logStatus("fail", "The value of Delimiter is =  "+" '"+value+"' not matched", true);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}

		return this;
	}
	public AppConfigurationPage fileTrasport(String text) {
		
		try {
			boolean obj=driver.findElementByXPath("//input[contains(@id,'editForm:j_idt') and contains(@id,':r_id_account:transport_:0')]").isSelected();
			if(obj==true) {
				String Type=driver.findElementByXPath("//label[contains(@for,'editForm:j_idt') and contains(@for,':r_id_account:transport_:0')]").getText();
				System.out.println("File Transport is checked on"+" '"+Type+"' ");
				if(Type.equalsIgnoreCase(text)) {
					logStatus("pass", "File Transport is checked on "+" '"+Type+"' "+ "and matched correctly", false);
			}else {
				logStatus("fail", "File Transport is"+" '"+Type+"' "+ "not matched ", false);
			}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}
		

		return this;
		
	}
	
	public AppConfigurationPage getNumberOfLinesToSkip(String text) {
		if (text.equalsIgnoreCase("NA")) {
			System.out.println("No of lines to skip is Not Applicable");
			logStatus("pass", "No of lines to skip is Not Applicable", false);
		}else {
			try {
				clickByXpath("(//span[contains(@id,'-btnInnerEl') and contains(@class,'x-tab-inner')])[13]");
				String value=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,':r_id_account:j_idt')])[8]").getAttribute("value");
				if(value.equalsIgnoreCase(text)) {
					logStatus("pass", "The value of Number Of Lines To Skip is = "+" '"+value+"' matched", false);
					System.out.println("Number Of Lines To Skip="+" '"+value+"' ");
				}
				else {
					logStatus("fail", "The value of Number Of Lines To Skip is =  "+" '"+value+"' not matched", false);
				}
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.out.println("Element not found");
			}
		}
		return this;
	}
	
	public AppConfigurationPage checkForFilterEmpty(String checkbox) {
		try {
			boolean obj=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,':r_id_account:j_idt')])[9]").isSelected();
			if(obj==true && checkbox=="TRUE"){
				logStatus("pass", "Data matches, FilterEmpty is checked", true);
				System.out.println("FilterEmpty Data matches");
			}else if(obj==false && checkbox=="FALSE"){
				logStatus("pass", "Data matches, FilterEmpty is not checked", true);
				System.out.println("FilterEmpty Data matches");
			}else {
				logStatus("fail", "Filter Empty checkbox mismatched", true);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}
		return this;
	}
	
	public AppConfigurationPage clickTheTestConnection() {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LocatorObjects.clickTheTestConnection)));
		
		clickByXpath(LocatorObjects.clickTheTestConnection);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public AppConfigurationPage checkTestConnectionStatus(String text) {
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LocatorObjects.XpathForTestConnectionStatus)));
		String status=driver.findElementByXPath(LocatorObjects.XpathForTestConnectionStatus).getText();
		if(status.equalsIgnoreCase(text)) {
			
			
			logStatus("pass", "Test connection status is successful"+"   '"+status+"' ", true);
		}else {
			logStatus("fail", "Test connection is failure the error message is"+"  '"+status+"' ", true);
		}
		
		return this;
	}
	
	public SchemaPage checkTestConnectionStatusAll(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LocatorObjects.XpathForTestConnectionStatus)));
		String status=driver.findElementByXPath(LocatorObjects.XpathForTestConnectionStatus).getText();
		if(status.equalsIgnoreCase(text)) {
			logStatus("pass", "Test connection status is successful"+"   '"+status+"' ", true);
		}else {
			logStatus("fail", "Test connection is failure the error message is"+"  '"+status+"' ", true);
		}
		return new SchemaPage (driver, test);
	}
	
	public AppConfigurationPage clickOnMerging() {
		clickByXpath("(//span[contains(@id,'-btnInnerEl') and @class='x-tab-inner'])[14]");
		return this;
	}
	public SchemaPage verifyOnMerging() {
		boolean obj=driver.findElementByXPath("//input[contains(@id,'editForm:j_idt') and contains(@id,':r_id_account:mergeRows_')]").isSelected();
		if(obj==true) {
			logStatus("pass", "Data needs to be merged checkbox clicked successfully", true);
			
		}if(obj==false) {
			logStatus("pass", "Data needs to be merged checkbox not clicked", true);
			
		}
		return new SchemaPage(driver, test);
		
	}
	public AppConfigurationPage verifyConnectionUser(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LocatorObjects.XpathForConnectionUser)));
		
		String actual=driver.findElementByXPath(LocatorObjects.XpathForConnectionUser).getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The connection user is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The connetion user is"+"  '"+actual+"' "+"not matched", true);
		}
		
		return this;
	}
	public AppConfigurationPage verifyDataBaseUrl(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LocatorObjects.XpathForDataBaseUrl)));
		String actual=driver.findElementByXPath(LocatorObjects.XpathForDataBaseUrl).getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The DataBase URL is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The DataBase URL is"+"  '"+actual+"' "+"not matched", true);
		}
		
		return this;
	}
	public AppConfigurationPage verifyJDBCdriver(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LocatorObjects.XpathForJDBCdriver)));
		String actual=driver.findElementByXPath(LocatorObjects.XpathForJDBCdriver).getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The JDBC driver is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The JDBC driver is"+"  '"+actual+"' "+"not matched", true);
		}
	
		return this;
	}
	public AppConfigurationPage verifyServiceURL(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:serviceUrl']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The ServiceURL is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The ServiceURL is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
		
	}
	public AppConfigurationPage verifyUserName(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:name' or @id='editForm:username' or @id='editForm:user']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Username is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Username is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
		
	}
	public AppConfigurationPage verifyAccountEntity(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:accountEntity']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The AccountEntity is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The AccountEntity is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
		
	}
	public AppConfigurationPage verifyCustomFilter(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:accountCustomFilter']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The CustomFilter is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The CustomFilter is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
		
	}
	public AppConfigurationPage verifyMetadataList(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:accountMetadataList']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The MetadataList is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The MetadataList is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
		
	}
	public AppConfigurationPage verifyAccountPageSize(String text) {
		try {
			String actual = driver.findElementByXPath("//*[@id='editForm:accountPageSize']").getAttribute("value");
			if(actual.equalsIgnoreCase(text)) {
				logStatus("pass", "The Account Page size is"+"   '"+actual+"' "+"is matched", true);
			}else {
				logStatus("fail", "The Account Page size is"+"  '"+actual+"' "+"not matched", true);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}
		
		return this;
	}
	public  AppConfigurationPage verifyUseTLS(String useTLS) {
		try {
			boolean obj=driver.findElementByXPath("//input[@id='editForm:useSSL']").isSelected();
			if((obj==true) && (useTLS=="TRUE")){
				logStatus("pass", "Use TLS is checked", true);
				System.out.println(" Use TLS is checked");
			}else if((obj==false) && (useTLS=="FALSE")){
				logStatus("pass", "Use TLS is not checked", true);
				System.out.println(" Use TLS is not checked");
			}else {
				logStatus("fail", "Use TLS checkbox mismatched", true);
				System.out.println("Use TLS checkbox mismatched");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}
		return this;
	}
	public AppConfigurationPage verifyAuthenticationType(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:authType']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The AuthenticationType is"+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The AuthenticationType is"+"  '"+actual+"' "+"not matched", false);
		}
		return this;
		
	}
	public AppConfigurationPage verifyPagesize_LDAP(String text) {
		String actual=driver.findElementByXPath("(//td[@class='certScheduleHelpCol'])[7]/following-sibling::td/input").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Page size is"+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Page Size is"+"  '"+actual+"' "+"not matched", false);
		}
		return this;
		
	}
	public AppConfigurationPage verifyServiceNowURL(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:url']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The ServiceNowURL is"+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The ServiceNowURL is"+"  '"+actual+"' "+"not matched", false);
		}
		return this;
		
	}
	public AppConfigurationPage verifyUserNameOnSwow(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:uname']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Username is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Username is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
		
	}
	
	public AppConfigurationPage verifyPageSizeSwow(String text) {
		try {
			String actual = driver.findElementByXPath("//input[@id='editForm:pageSize']").getAttribute("value");
			if(actual.equalsIgnoreCase(text)) {
				logStatus("pass", "The Page size is"+"   '"+actual+"' "+" is matched", true);
			}else {
				logStatus("fail", "The Page size is"+"  '"+actual+"' "+" not matched", true);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}
		
		return this;
	}
	
	public AppConfigurationPage verifyClientID_GoogleApps(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:clientID']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Client ID is"+"   '"+actual+"' "+"is matched", true);
			System.out.println("The Client ID is"+"   '"+actual+"' "+"is matched");
		}else {
			logStatus("fail", "The Client ID is"+"  '"+actual+"' "+"not matched", true);
			System.out.println("The Client ID is"+"   '"+actual+"' "+" not matched");
		}
		return this;
		
	}
	
	public AppConfigurationPage verifyClientSecret_GoogleApps(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:clientSecret']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Client Secret is"+"   '"+actual+"' "+"is matched", true);
			System.out.println("The Client Secret is"+"   '"+actual+"' "+"is matched");
		}else {
			logStatus("fail", "The Client Secret is"+"  '"+actual+"' "+"not matched", true);
			System.out.println("The Client Secret is"+"   '"+actual+"' "+" not matched");
		}
		return this;
		
	}
	
	public AppConfigurationPage verifyPageSize_GoogleApps(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:pageSize']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The PageSize is"+"   '"+actual+"' "+"is matched", true);
			System.out.println("The PageSize is"+"   '"+actual+"' "+"is matched");
		}else {
			logStatus("fail", "The PageSize is"+"  '"+actual+"' "+"not matched", true);
			System.out.println("The PageSize is"+"   '"+actual+"' "+"not matched");
		}
		return this;
		
	}
	
	public AppConfigurationPage verifyReadGroupDetails_GoogleApps(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:groupDetails']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The ReadGroupDetails is"+"   '"+actual+"' "+"is matched", true);
			System.out.println("The ReadGroupDetails is"+"   '"+actual+"' "+"is matched");
		}else {
			logStatus("fail", "The ReadGroupDetails is"+"  '"+actual+"' "+"not matched", true);
			System.out.println("The ReadGroupDetails is"+"   '"+actual+"' "+"not matched");
		}
		return this;
	}
	
	public AppConfigurationPage verifyHost(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and @type='text'])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The host is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The host is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
	}
	
	public AppConfigurationPage verifyPort(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and @type='text'])[2]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Port is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Port is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	
	public AppConfigurationPage verifyPortforOPenLDAP(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and @type='text'])[2]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Port is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Port is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	
	public AppConfigurationPage verifySAPHost(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:host']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The SAP Host is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The SAP Host is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	public AppConfigurationPage verifySystemNum(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:systemID']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The System Number is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The System Number is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	public AppConfigurationPage verifyClientNum(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:clientNumber']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Client Number is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Client Number is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	public AppConfigurationPage verifyClientLang(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:clientLanguage']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Client Language is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Client Language is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	public AppConfigurationPage verifyBuildMap(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:sapBuildMapRule']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Build Map is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Build Map is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	
	public AppConfigurationPage verifyAuthTypeforIBM(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='editForm:authType']")));
		String actual=driver.findElementByXPath("//*[@id='editForm:authType']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "Authorization Type"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "Authorization Type"+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyUserforIBM(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='editForm:username']")));
		String actual=driver.findElementByXPath("//*[@id='editForm:username']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "User"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "User"+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyHostforIBM(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[contains(@id,'ext-gen')])[1]")));
		String actual=driver.findElementByXPath("(//input[contains(@id,'ext-gen')])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "Host"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "Host"+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyAuthenticationSearchAttributesforIBM(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//textarea[contains(@name,'editForm:j_idt')]")));
		String actual=driver.findElementByXPath("//textarea[contains(@name,'editForm:j_idt')]").getText();
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "Authentication Search Attributes"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "Authentication Search Attributes"+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyFiletransport(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,'0:j_idt')])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The File transport is"+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The File transport is"+"  '"+actual+"' "+"not matched", false);
		}
		return this;
		
	}  //editForm:j_idt1541:0:j_idt1545
	//editForm:j_idt1541:1:j_idt1545
	
	public AppConfigurationPage verifyHost1(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,'1:j_idt')])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Host is"+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Host is"+"  '"+actual+"' "+"not matched", false);
		}
		return this;
		
	} 
	
	public AppConfigurationPage verifyTransportuser(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,'2:j_idt')])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Transport user is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Transport user is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	
	public AppConfigurationPage verifypasswd(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,'4:j_idt')])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Port is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Port is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	
	public AppConfigurationPage verifygroup(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,'5:j_idt')])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The group is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The group is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	
	public AppConfigurationPage verifypartition(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,'6:j_idt')])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The partition is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The partition is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	
	public AppConfigurationPage Stringbaseurl(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:BaseUrlID' or @name='editForm:j_idt1373']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The base url is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The base url is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

}
	
	public AppConfigurationPage Authtype(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:selectmethodtypeId' or @name='editForm:j_idt1373']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Authtype is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Authtype is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
	}
	
	public AppConfigurationPage verifyUsernameforOracle(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='editForm:user']")));
		String actual=driver.findElementByXPath("//*[@id='editForm:user']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "User"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "User"+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyURLforOracle(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='editForm:url']")));
		String actual=driver.findElementByXPath("//*[@id='editForm:url']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "User"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "User"+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyDriverclassforOracle(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='editForm:driverClass']")));
		String actual=driver.findElementByXPath("//*[@id='editForm:driverClass']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "User"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "User"+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyFile(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,'4:j_idt')])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The File is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The File is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
	}
	
	public  AppConfigurationPage checkForFilterEmptyRecords(String checkbox) {
		try {
			boolean obj=driver.findElementByXPath(LocatorObjects.XpathForFilterEmptyRecords).isSelected();
			if((obj==true) && (checkbox=="TRUE")){
				logStatus("pass", "Filter Empty Records is checked", true);
				System.out.println(" authoritative");
			}else if((obj==false) && (checkbox=="FALSE")){
				logStatus("pass", "Filter Empty Records is unchecked", true);
				System.out.println(" non authoritative");
			}else {
				logStatus("fail", "Filter Empty Records checkbox mismatched", true);
				System.out.println("Filter Empty Records checkbox mismatched");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}
		return new AppConfigurationPage(driver, test);
	}
	
	public AppConfigurationPage verifyPartitionmode(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,'11:j_idt')])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Partitionmode is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Partitionmode is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
	}
	
	public AppConfigurationPage verifyparserule(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt') and contains(@name,'13:j_idt')])[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The parse rule is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The parse rule is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
	}
	
	public AppConfigurationPage verifyIncludeDatabasesforMicrosoft(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='editForm:includeDatabases']")));
		String actual=driver.findElementByXPath("//*[@id='editForm:includeDatabases']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "Include Databases "+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "Include Databases "+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}

	public AppConfigurationPage verifyURLforSaleforce(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='editForm:url']")));
		String actual=driver.findElementByXPath("//*[@id='editForm:url']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "URL"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "URL"+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyUsernameforSaleforce(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='editForm:sfuser']")));
		String actual=driver.findElementByXPath("//*[@id='editForm:sfuser']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "Username"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "Username"+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifySearchQueryForUser_Saleforce(String text) {
		if(text.equalsIgnoreCase("NA")) {
			System.out.println("Search Query For User is not applicable");
			logStatus("pass", "Search Query For User is not applicable for this application", true);
		}
		else {
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='editForm:SearchStringForUser']")));
			String actual=driver.findElementByXPath("//input[@id='editForm:SearchStringForUser']").getAttribute("value");
			if(actual.equalsIgnoreCase(text)) {
				logStatus("pass", "Search Query For User"+"   '"+actual+"' "+"is matched", true);
			}else {
				logStatus("fail", "Search Query For User"+"  '"+actual+"' "+" is not matched", true);
			}
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyUser(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:username' or @name='editForm:j_idt1373']").getAttribute("value");
		if(text.equalsIgnoreCase("NA")) {
			if(actual.equalsIgnoreCase("")) {
				System.out.println("Username is not applicable");
				logStatus("pass", "The Username is not applicable", true);
			}
			else {
				logStatus("fail", "Value '"+actual+"' mismatches, The Username is not applicable", true);
				System.out.println("Value '"+actual+"' mismatches, The Username is not applicable");
			}
		}
		else {
			if(actual.equalsIgnoreCase(text)) {
				logStatus("pass", "The User is"+"   '"+actual+"' "+"is matched", true);
			}else {
				logStatus("fail", "The User is"+"  '"+actual+"' "+"not matched", true);
			}
		}
		return this;
	}
	
	public AppConfigurationPage verifyHost2(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt')])[3]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Host is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Host is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;
	}
	
	public AppConfigurationPage verifyPagesize(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:j_idt')])[5]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Page size is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Page Size is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	
	public AppConfigurationPage Authsearch(String text) {
		String actual=driver.findElementByXPath("//textarea[contains(@name,'editForm:j_idt')]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Authentication Search Attributes is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Authentication Search Attributes is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	
	public AppConfigurationPage verifyPageSize_SAPHANA(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:chunkToFetch']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The PageSize is"+"   '"+actual+"' "+"is matched", true);
			System.out.println("The PageSize is"+"   '"+actual+"' "+"is matched");
		}else {
			logStatus("fail", "The PageSize is"+"  '"+actual+"' "+"not matched", true);
			System.out.println("The PageSize is"+"   '"+actual+"' "+"not matched");
		}
		return this;
		
	}
	
	public AppConfigurationPage verifyDomainNameforAzure(String text) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='editForm:domainName']")));
		String actual=driver.findElementByXPath("//*[@id='editForm:domainName']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "User"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "User"+"  '"+actual+"' "+" is not matched", true);
		}
	
		return this;
	}
	
	
	public AppConfigurationPage verifySapusername(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:user']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The SAP username is"+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The SAP username is"+"  '"+actual+"' "+"not matched", true);
		}
		return this;

	}
	
	public AppConfigurationPage verifyDatabaseURL(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:url']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The DatabaseURL is"+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The DatabaseURL is"+"  '"+actual+"' "+"not matched", false);
		}
		return this;
}
	
	public AppConfigurationPage verifyDriver(String text) {
		String actual=driver.findElementByXPath("//*[@id='editForm:driverClass']").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The DatabaseURL is"+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The DatabaseURL is"+"  '"+actual+"' "+"not matched", false);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyDomainForAD(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:domainInfo:0:domainforestInfo:0:j_idt')])[2]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The Domain is"+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Domain is"+"  '"+actual+"' "+"not matched", false);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyUserForAD(String text) {
		String actual=driver.findElementByXPath("(//input[contains(@name,'editForm:domainInfo:0:domainforestInfo:0:j_idt')])[4]").getAttribute("value");
		if(actual.equalsIgnoreCase(text)) {
			logStatus("pass", "The User is"+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The User is"+"  '"+actual+"' "+"not matched", false);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyAccountSearchAttributesForAD(String dn, String filter) {
		clickByXpath("((//td[@class='centeredColumn'])[10]/following-sibling::td/input)[1]");
		String actual=driver.findElementByXPath("((//td[@class='centeredColumn'])[10]/following-sibling::td/input)[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(dn)) {
			logStatus("pass", "The Account Search DN Value "+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Account Search DN Value "+"  '"+actual+"' "+"not matched", true);
		}
		String actual1=driver.findElementByXPath("((//td[@class='centeredColumn'])[10]/following-sibling::td/input)[2]").getAttribute("value");
		if(actual1.equalsIgnoreCase(filter)) {
			logStatus("pass", "The Account Iterate Search Filter Value "+"   '"+actual1+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Account Iterate Search Filter Value "+"  '"+actual1+"' "+"not matched", false);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyGroupSearchAttributesForAD(String dn, String filter) {
		clickByXpath("(//span[@class='x-tab-inner'])[13]");
		String actual=driver.findElementByXPath("((//td[@class='centeredColumn'])[11]/following-sibling::td/input)[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(dn)) {
			logStatus("pass", "The Group Search DN Value "+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Group Search DN Value "+"  '"+actual+"' "+"not matched", true);
		}
		String actual1=driver.findElementByXPath("((//td[@class='centeredColumn'])[11]/following-sibling::td/input)[2]").getAttribute("value");
		if(actual1.equalsIgnoreCase(filter)) {
			logStatus("pass", "The Group Iterate Search Filter Value "+"   '"+actual1+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Group Iterate Search Filter Value "+"  '"+actual1+"' "+"not matched", false);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyAccountSearchAttributesForLDAP(String scope, String dn, String filter) {
		clickByXpath("(//td[@class='certScheduleHelpCol'])[9]/following-sibling::td/select");
		String actualScope = driver.findElementByXPath("(//td[@class='certScheduleHelpCol'])[9]/following-sibling::td/select").getAttribute("value");
		if(actualScope.equalsIgnoreCase(scope)) {
			logStatus("pass", "The Account Search Scope Value "+"   '"+actualScope+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Account Search Scope Value "+"  '"+actualScope+"' "+"not matched", true);
		}
	
		String actual=driver.findElementByXPath("(//td[@class='certScheduleHelpCol'])[10]/following-sibling::td/input").getAttribute("value");
		if(actual.equalsIgnoreCase(dn)) {
			logStatus("pass", "The Account Search DN Value "+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Account Search DN Value "+"  '"+actual+"' "+"not matched", false);
		}
		String actual1=driver.findElementByXPath("(//td[@class='certScheduleHelpCol'])[11]/following-sibling::td/input").getAttribute("value");
		if(actual1.equalsIgnoreCase(filter)) {
			logStatus("pass", "The Account Iterate Search Filter Value "+"   '"+actual1+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Account Iterate Search Filter Value "+"  '"+actual1+"' "+"not matched", false);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyGroupSearchAttributesForLDAP(String scope, String dn, String filter) {
		clickByXpath("(//span[@class='x-tab-inner'])[13]");
		String actualScope = driver.findElementByXPath("(//td[@class='certScheduleHelpCol'])[15]/following-sibling::td/select").getAttribute("value");
		if(actualScope.equalsIgnoreCase(scope)) {
			logStatus("pass", "The Group Search Scope Value "+"   '"+actualScope+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Group Search Scope Value "+"  '"+actualScope+"' "+"not matched", true);
		}
		
		String actual=driver.findElementByXPath("(//td[@class='certScheduleHelpCol'])[16]/following-sibling::td/input").getAttribute("value");
		if(actual.equalsIgnoreCase(dn)) {
			logStatus("pass", "The Group Search DN Value "+"   '"+actual+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Group Search DN Value "+"  '"+actual+"' "+"not matched", false);
		}
		
		if (filter.equalsIgnoreCase("NA")) {
			System.out.println("The Group Iterate Search Filter Value is Not applicable");
		}
		else {
			String actual1=driver.findElementByXPath("(//td[@class='certScheduleHelpCol'])[17]/following-sibling::td/input").getAttribute("value");
			if(actual1.equalsIgnoreCase(filter)) {
				logStatus("pass", "The Group Iterate Search Filter Value "+"   '"+actual1+"' "+"is matched", false);
			}else {
				logStatus("fail", "The Group Iterate Search Filter Value "+"  '"+actual1+"' "+"not matched", false);
			}
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyGroupSearchScopeForOpenLDAP(String type, String dn) {
		clickByXpath("(//span[@class='x-tab-inner'])[13]");
		String actual=driver.findElementByXPath("((//td[@class='centeredColumn'])[2]/following-sibling::td/input)[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(type)) {
			logStatus("pass", "The Group Search Scope Object Type  "+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Group Search Scope Object Type  "+"  '"+actual+"' "+"not matched", true);
		}
		String actual1=driver.findElementByXPath("((//td[@class='centeredColumn'])[2]/following-sibling::td/input)[2]").getAttribute("value");
		if(actual1.equalsIgnoreCase(dn)) {
			logStatus("pass", "The Group  Search Scope DN "+"   '"+actual1+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Group  Search Scope DN "+"  '"+actual1+"' "+"not matched", false);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyAccountSearchAttributesForIBM(String dn, String filter) {
		clickByXpath("((//td[@class='centeredColumn'])[1]/following-sibling::td/input)[1]");
		String actual=driver.findElementByXPath("((//td[@class='centeredColumn'])[1]/following-sibling::td/input)[1]").getAttribute("value");
		if(actual.equalsIgnoreCase(dn)) {
			logStatus("pass", "The Account Search DN Value "+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Account Search DN Value "+"  '"+actual+"' "+"not matched", true);
		}
		String actual1=driver.findElementByXPath("((//td[@class='centeredColumn'])[1]/following-sibling::td/input)[2]").getAttribute("value");
		if(actual1.equalsIgnoreCase(filter)) {
			logStatus("pass", "The Account Iterate Search Filter Value "+"   '"+actual1+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Account Iterate Search Filter Value "+"  '"+actual1+"' "+"not matched", false);
		}
	
		return this;
	}
	
	public AppConfigurationPage verifyGroupSearchAttributesForIBM(String dn, String filter) {
		clickByXpath("(//span[@class='x-tab-inner'])[13]");
		String actual=driver.findElementByXPath("((//table[@class='spTable'])[3]/tbody/tr/td)[3]/input").getAttribute("value");
		if(actual.equalsIgnoreCase(dn)) {
			logStatus("pass", "The Group Search DN Value "+"   '"+actual+"' "+"is matched", true);
		}else {
			logStatus("fail", "The Group Search DN Value "+"  '"+actual+"' "+"not matched", true);
		}
		String actual1=driver.findElementByXPath("((//table[@class='spTable'])[3]/tbody/tr/td)[4]/input").getAttribute("value");
		if(actual1.equalsIgnoreCase(filter)) {
			logStatus("pass", "The Group Iterate Search Filter Value "+"   '"+actual1+"' "+"is matched", false);
		}else {
			logStatus("fail", "The Group Iterate Search Filter Value "+"  '"+actual1+"' "+"not matched", false);
		}
	
		return this;
	}
	
	public AppConfigurationPage clickOnConfiguration1() {
		 
		clickByXpath(LocatorObjects.clickOnConfiguration);
		System.out.println("clicked config");
		
		return this;
	}
	
}




