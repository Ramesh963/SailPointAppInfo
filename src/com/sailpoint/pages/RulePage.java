package com.sailpoint.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BaseTest;

public class RulePage extends BaseTest {
	public RulePage(RemoteWebDriver driver1,ExtentTest test1) {
		this.driver=driver1;
		this.test=test1;
}
	public RulePage clickOnRule() {
		clickByXpath("//span[text()='Rules']");
		return this;
	}
	
	public RulePage clickOnRuleForADDirect() {
		clickByXpath("//*[@id='tab-1136']");
		return this;
	}
	
	public RulePage verifyCorrelationRule(String text) {
		try {
			logStatus("pass", "Aggregation Rules of this Application", true);
			String actual=driver.findElementByXPath("//*[@name='editForm:correlationRule']").getAttribute("value");
			if(text.equalsIgnoreCase("NA")) {
				if(actual.equalsIgnoreCase("")) {
					logStatus("pass", "Correlation rule is not applicable for this application", false);
					System.out.println("Correlation rule is not applicable for this application");
				}
				else {
					logStatus("fail", "Value mismatches, Correlation Rule should be 'Not Applicable'", false);
					System.out.println("Value mismatches, Correlation Rule should be 'Not Applicable'");
					System.out.println(actual);
				}
				
			}else {
				
				
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Correlation rule is "+ " '"+actual+"' " +" are matched ", false);
					System.out.println("CorrelationRule is matched"+" '"+actual+"' ");
				}else {
					logStatus("fail", "Correlation rule is "+ " '"+actual+"' " +" are not matched ", true);
					System.out.println("correlation rule not matched");
					
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	public RulePage verifyCreationRule(String text) {
		try {
			String actual=driver.findElementByXPath("//*[@name='editForm:creationRule']").getAttribute("value");
			if(text.equalsIgnoreCase("NA")) {
				if(actual.equalsIgnoreCase("")) {
					logStatus("pass", "Creation rule is not applicable for this application", false);
					System.out.println("Creation rule is not applicable for this application");
				}
				else {
					logStatus("fail", "Value mismatches, Creation rule should be 'Not Applicable'", false);
					System.out.println("Value mismatches, Creation Rule should be 'Not Applicable'");
					System.out.println(actual);
				}
			}else {
				
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Creation rule is "+ " '"+actual+"' " +" are matched ",false);
					System.out.println("CreationRule is matched"+" '"+actual+"' ");
				}else {
					logStatus("fail", "Creation rule is "+ " '"+actual+"' " +" are not matched ", false);
					System.out.println("Creation rule is "+ " '"+actual+"' " +" are not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	public RulePage verifyManagerCorrelationRule(String text) {
		try {
			String actual=driver.findElementByXPath("//*[@name='editForm:managerCorrelationRule']").getAttribute("value");
			if(text.equalsIgnoreCase("NA")) {
				if(actual.equalsIgnoreCase("")) {
					logStatus("pass", "Manager Correlation rule is not applicable for this application", false);
					System.out.println("Manager Correlation rule is not applicable for this application");
				}
				else {
					logStatus("fail", "Value mismatches, Manager Correlation rule should be 'Not Applicable'", false);
					System.out.println("Value mismatches, Manager Correlation Rule should be 'Not Applicable'");
					System.out.println(actual);
				}
			}else {
				
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Manager Correlation rule is "+ " '"+actual+"' " +" are matched ",false);
					System.out.println("ManagerCorrelation Rule is matched"+" '"+actual+"' ");
				}else {
					logStatus("fail", "Manager Correlation rule is "+ " '"+actual+"' " +" are not matched", false);
					System.out.println("ManagerCorrelation rule not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	public RulePage verifyCustomizationRule(String text) {
		try {
			String actual=driver.findElementByXPath("//*[@name='editForm:CustomizationRule']").getAttribute("value");
			if(text.equalsIgnoreCase("NA")) {
				if(actual.equalsIgnoreCase("")) {
					logStatus("pass", "Customization rule is not applicable for this application", false);
					System.out.println("Customization rule is not applicable for this application");
				}
				else {
					logStatus("fail", "Value mismatches, Customization rule should be 'Not Applicable'", false);
					System.out.println("Value mismatches, Customization Rule should be 'Not Applicable'");
					System.out.println(actual);
				}
			}else {
				
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Customization rule is "+ " '"+actual+"' " +" are matched ",false);
					System.out.println("Customization Rule is matched"+" '"+actual+"' ");
				}else {
					logStatus("fail", "Customization rule is "+ " '"+actual+"' " +" are not matched  ", false);
					System.out.println("Customization rule not matched ");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	public HomePage verifyEntitlementCustomizationRule(String text) {
		
		try {
			String actual=driver.findElementByXPath("//*[@name='editForm:ManagedAttributeCustomizationRule']").getAttribute("value");
			if(text.equalsIgnoreCase("NA")) {
				if(actual.equalsIgnoreCase("")) {
					logStatus("pass", "Managed Entitlement customization rule is not applicable for this application", false);
					System.out.println("Managed Entitlement customization rule is not applicable for this application");
				}
				else {
					logStatus("fail", "Value mismatches, Managed Entitlement customization Rule should be 'Not Applicable'", false);
					System.out.println("Value mismatches, Managed Entitlement customization Rule should be 'Not Applicable'");
					System.out.println(actual);
				}
			}else {
				
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Managed Entitlement customization rule is "+ " '"+actual+"' " +" are matched ",false);
					System.out.println("Entitlement Customization Rule is matched"+" '"+actual+"' ");
				}else {
					logStatus("fail", "Managed Entitlement customization rule "+ " '"+actual+"' " +" are not matched ", false);
					System.out.println("Entitlement Customization rule not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return new HomePage(driver, test);
	}
}