package com.sailpoint.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sailpoint.pages.CorrelationPage;
import com.sailpoint.pages.RulePage;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BaseTest;

public class CorrelationPage extends BaseTest {
	public CorrelationPage(RemoteWebDriver driver1,ExtentTest test1) {
		this.driver=driver1;
		this.test=test1;
	}
	public CorrelationPage clickOnCorrelation() {
		clickByXpath("//*[@id='tab-1092']");
		return this;
	}
	public RulePage verifyAccountCorrelation(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("AccountCorrelation is not applicable");
				logStatus("pass", "AccountCorrelation is not applicable ", true);
			}else {
				String actual=	driver.findElementByXPath("//*[@name='editForm:currentConfigSelection']").getAttribute("value");
				System.out.println(actual);
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "The Account correlation is "+ " '"+actual+"' " +" are matched ", true);
					System.out.println("AccountCorrelation is matched");
				}else {
					logStatus("fail", "The Account correlation is "+ " '"+actual+"' " +" are not matched  ", true);
					System.out.println("AccountCorrelation is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
	return new RulePage(driver, test);
	}
	
	public CorrelationPage verifyAccountCorrelationForAccountBasedCorrelation(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("AccountCorrelation is not applicable");
				logStatus("pass", "AccountCorrelation is not applicable ", true);
			}else {
				String actual=	driver.findElementByXPath("//*[@name='editForm:currentConfigSelection']").getAttribute("value");
				System.out.println(actual);
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "The Account correlation is "+ " '"+actual+"' " +" are matched ", true);
					System.out.println("AccountCorrelation is matched");
				}else {
					logStatus("fail", "The Account correlation is "+ " '"+actual+"' " +" are not matched  ", true);
					System.out.println("AccountCorrelation is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
			logStatus("fail", "Attribute Value missing", true);
		}
		return this;
		}
	
	public CorrelationPage verifyAttributeCorrelationValue1(String app, String id) {
		
			try {
				if(app.equalsIgnoreCase("NA")) {
					System.out.println("Value is not applicable");
				}else {
					WebDriverWait wait=new WebDriverWait(driver, 20);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[1]")));
					String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[1]").getText();
					if(actualApp.equalsIgnoreCase(app)) {
						logStatus("pass", "Application attribute Value 1 '"+actualApp+ "' is matched", false);
						System.out.println(actualApp+" is matched");
					}
					else {
						logStatus("fail", "Application attribute Value 1 '"+actualApp+ "' is not matched", false);
						System.out.println(actualApp+" is not matched");
					}
				}
				
				if(id.equalsIgnoreCase("NA")) {
					System.out.println("Value is not applicable");
				}else {
					String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[2]").getText();
					System.out.println("excel: "+id);
					System.out.println("ID: "+actualId);
					if(actualId.equalsIgnoreCase(id)) {
						logStatus("pass", "Identity attribute Value 1 '"+actualId+ "' is matched", false);
						System.out.println(actualId+" is matched");
					}
					else {
						logStatus("fail", "Identity attribute Value 1 '"+actualId+ "' is not matched", false);
						System.out.println(actualId+" is not matched");
					}
				}
					
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.out.println("Element not found");
				logStatus("fail", "Attribute Value missing", true);
			}
		
		
		return this;
	}
	
	public RulePage verifyAttributeCorrelationValue2(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[3]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 2 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 2 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[4]").getText();
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 2 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 2 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		return new RulePage(driver, test);
	}
	
	public CorrelationPage verifyAttributeCorrelationValue2ForAD(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[3]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 2 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 2 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[4]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 2 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 2 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		return this;
	}
	
	public CorrelationPage verifyAttributeCorrelationValue3(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[5]")));
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[5]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 3 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 3 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[6]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 3 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 3 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		
		return this;
	}
	
	public CorrelationPage verifyAttributeCorrelationValue4(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[7]")));
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[7]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 4 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 4 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[8]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 4 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 4 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		
		return this;
	}
	
	public CorrelationPage verifyAttributeCorrelationValue5(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[9]")));
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[9]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 5 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 5 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
			
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[10]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 5 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 5 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		
		return this;
	}
	
	public CorrelationPage verifyAttributeCorrelationValue6(String app, String id) {
		try {
			
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[11]")));
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[11]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 6 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 6 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[12]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 6 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 6 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		
		return this;
	}
	
	public CorrelationPage verifyAttributeCorrelationValue7(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[7]")));
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[13]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 7 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 7 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
			
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[14]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 7 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 7 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		
		return this;
	}
	
	public RulePage verifyAttributeCorrelationValue8(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[15]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 8 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 8 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
			
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[16]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 8 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 8 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		return new RulePage(driver, test);
	}
	
	public RulePage verifyAttributeCorrelationValue6ForGoogleApps(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[11]")));
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[11]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 6 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 6 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[12]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 6 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 6 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		
		return new RulePage(driver, test);
	}
	
	public RulePage verifyAttributeCorrelationValue7_ForSwow(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[7]")));
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[13]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 7 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 7 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[14]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 7 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 7 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		
		return new RulePage(driver, test);
	}
	
	public RulePage verifyAttributeCorrelationValue4For_OpenLDAP(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[7]")));
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[7]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 4 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 4 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[8]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 4 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 4 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		
		return new RulePage(driver, test);
	}
	
	public RulePage verifyAttributeCorrelationValue5_ForSAPDirect(String app, String id) {
		try {
			if(app.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
				WebDriverWait wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[9]")));
				String actualApp = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[9]").getText();
				
				if(actualApp.equalsIgnoreCase(app)) {
					logStatus("pass", "Application attribute Value 5 '"+actualApp+ "' is matched", false);
					System.out.println(actualApp+" is matched");
				}
				else {
					logStatus("fail", "Application attribute Value 5 '"+actualApp+ "' is not matched", false);
					System.out.println(actualApp+" is not matched");
				}
			}
			if(id.equalsIgnoreCase("NA")) {
				System.out.println("Value is not applicable");
			}else {
			
				String actualId = driver.findElementByXPath("(//tbody[@id='editForm:dynamicAssignment:tbody_element']/tr/td)[10]").getText();
				
				if(actualId.equalsIgnoreCase(id)) {
					logStatus("pass", "Identity attribute Value 5 '"+actualId+ "' is matched", false);
					System.out.println(actualId+" is matched");
				}
				else {
					logStatus("fail", "Identity attribute Value 5 '"+actualId+ "' is not matched", false);
					System.out.println(actualId+" is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
			logStatus("fail", "Attribute Value missing", true);
		}
		
		return new RulePage(driver, test);
	}
}
