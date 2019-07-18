package com.sailpoint.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sailpoint.pages.SchemaPage;
import com.object.LocatorObjects;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BaseTest;

public class SchemaPage extends BaseTest {
	public SchemaPage(RemoteWebDriver driver1,ExtentTest test1) {
		this.driver=driver1;
		this.test=test1;
	}

	public SchemaPage clickSchema() {
		clickByXpath("//span[contains(@id,'-btnInnerEl') and contains(text(),'Schema')]");
		return this;
	}
	
	public SchemaPage verifyNativeObjectType(String text) {
		//(//input[contains(@name,'editForm:j_idt') and contains(@name,'0:j_idt')])[1]
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Native Object Type not applicable");
				logStatus("pass", "Native Object Type is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[1]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Native Object Type is"+ " '"+actual+"' " +" are matched", false);
					System.out.println("native object value is matched");
				}else {
					logStatus("fail", "Native Object Type is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("native object value is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage verifyDisplayAttribute(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Display Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[3]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "DisplayAttribute is"+ " '"+actual+"' " +" are matched", false);
					System.out.println("display attribute is matched");
				}else {
					logStatus("fail", "DisplayAttribute is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("display attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
		
	}
	
	public SchemaPage verifyIdentityAttribute(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Identity Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[2]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "IdentityAttribute is"+ " '"+actual+"' " +" are matched", true);
					System.out.println("Identity Attribute is matched");
				}else {
					logStatus("fail", "IdentityAttribute is"+ " '"+actual+"' " +" are not matched", true);
					System.out.println("Identity Attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public CorrelationPage  verifyAttribute(String text,String type) {
		try {
			WebElement togetrow=driver.findElementByXPath("//table[@style='table-layout:fixed']/tbody");
			java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
			int count=totalrow.size();
			int count2=0;
			for(int i=0;i<=count-2;i++) {
				
				String attribute=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':0:schemaAttrTbl:"+i+":attrName')]").getAttribute("value");
			String actual=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':0:schemaAttrTbl:"+i+":attributeType')]").getAttribute("value");
			if(attribute.equalsIgnoreCase(text)) {
				if(actual.equalsIgnoreCase(type)) {
					System.out.println(attribute+" Type is "+" '"+actual +"' "+" matched");
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}
				else if(actual.equalsIgnoreCase("group")) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}else if(actual.equalsIgnoreCase("boolean")) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}
				else {
					System.out.println(attribute+" matched but Type is "+" '"+actual +"' "+" not matched");
					logStatus("fail", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" not matched ", false);
				}
				break;
			}else {
				count2=count2+1;
				if(count2==count-1) {
					
					System.out.println(text+" Type is "+" '"+type +"' "+" not matched");
					logStatus("fail", "The "+ " '"+text+"' " +" atrribute type is"+ " '"+type+"' " +" not matched ", false);
					
				}
			}
			
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}
		return new CorrelationPage(driver,test);
		
	}
	
	public SchemaPage  verifyAttributeFor(String text,String type) {
		try {
			WebElement togetrow=driver.findElementByXPath("//table[@style='table-layout:fixed']/tbody");
			java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
			int count=totalrow.size();
			int count2=0;
			for(int i=0;i<=count-2;i++) {
				
				String attribute=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':0:schemaAttrTbl:"+i+":attrName')]").getAttribute("value");
			String actual=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':0:schemaAttrTbl:"+i+":attributeType')]").getAttribute("value");
			if(attribute.equalsIgnoreCase(text)) {
				if(actual.equalsIgnoreCase(type)) {
					System.out.println(attribute+" Type is "+" '"+actual +"' "+" matched");
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}
				else if(actual.equalsIgnoreCase("group")) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}else if(actual.equalsIgnoreCase("boolean")) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}else if(actual.equalsIgnoreCase("privilege")) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}else if(actual.equalsIgnoreCase("role")) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}
				
				else {
					System.out.println(attribute+" matched but Type is "+" '"+actual +"' "+" not matched");
					logStatus("fail", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" not matched ", false);
				}
				break;
			}else {
				count2=count2+1;
				if(count2==count-1) {
					
					System.out.println(text+" Type is "+" '"+type +"' "+" not matched");
					logStatus("fail", "The "+ " '"+text+"' " +" atrribute type is"+ " '"+type+"' " +" not matched ", false);
					
				}
			}
			
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		
		return this;
		
	}
	
	public SchemaPage  verifyAttributeForAccount(String text,String type) {
		try {
			WebElement togetrow=driver.findElementByXPath("//table[@style='table-layout:fixed']/tbody");
			java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
			int count=totalrow.size();
			int count2=0;
			//System.out.println(count);
			for(int i=0;i<=count-2;i++) {
				String attribute=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':0:schemaAttrTbl:"+i+":attrName')]").getAttribute("value");
			String actual=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':0:schemaAttrTbl:"+i+":attributeType')]").getAttribute("value");
			if(attribute.equalsIgnoreCase(text)) {
				if(actual.equalsIgnoreCase(type)) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					System.out.println(attribute+" Type is "+" '"+type +"' "+" matched");
					}else if(actual.equalsIgnoreCase("group")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("boolean")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("role")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("CATALOG_ROLE")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("REPOSITORY_ROLE")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}

					else if(actual.equalsIgnoreCase("subscription")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("resourceGroup")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("resource")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
				else {
						System.out.println(attribute+" matched but Type is "+" '"+actual +"' "+" not matched");
						logStatus("fail", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" not matched ", false);
					}
				break;
				}
			else {
				count2=count2+1;
				if(count2==count-1) {
					
					System.out.println(text+" Type is "+" '"+type +"' "+" not matched");
					logStatus("fail", "The "+ " '"+text+"' " +" atrribute type is"+ " '"+type+"' " +" not matched ", false);
					
				}
			}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
		
	}
	
//	public SchemaPage  verifyAttributeADDirect() {
//		WebElement togetrow=driver.findElementByXPath("//table[@style='table-layout:fixed']/tbody");
//		java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
//		int count=totalrow.size();
//		//System.out.println(count);
//		for(int i=0;i<=count-2;i++) {
//			String attribute=driver.findElementByXPath("//*[@name='editForm:j_idt507:0:schemaAttrTbl:"+i+":attrName']").getAttribute("value");
//		String actual=driver.findElementByXPath("//*[@name='editForm:j_idt507:0:schemaAttrTbl:"+i+":attributeType']").getAttribute("value");
//		logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' ", false);
//		System.out.println(attribute+" Type is "+" '"+actual +"' ");
////		if(actual.equalsIgnoreCase(text)) {
////			logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
////			System.out.println(attribute+" Type is "+" '"+actual +"' "+" matched");
////		}else {
////			logStatus("fail", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" not matched ", false);
////			System.out.println(attribute+" Type is "+" '"+actual +"' "+" not matched");
////		}
//		}
//		return this;
//		
//	}
	
	public SchemaPage verifyGroupNativeObjectType(String text) {
		
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Group Object Type not applicable");
				logStatus("pass", "Group Native object type is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[5]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Group Native Object Type is"+ " '"+actual+"' " +" are matched", false);
					System.out.println(" Group native object value is matched");
				}else {
					logStatus("fail", "Group Native Object Type is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Group native object value is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage verifyGroupDisplayAttribute(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Group Object Type not applicable");
				logStatus("pass", "Group Display Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[contains(@class,'schema-detail-label')]/span[contains(text(),'Display')]/parent::div/following-sibling::div/input)[2]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Group DisplayAttribute is"+ " '"+actual+"' " +" are matched", false);
					System.out.println("Group display attribute is matched");
				}else {
					logStatus("fail", "Group DisplayAttribute is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Group display attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
		
	}
	
	public SchemaPage verifyGroupIdentityAttribute(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Group Object Type not applicable");
				logStatus("pass", "Group Identity Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[6]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Group IdentityAttribute is"+ " '"+actual+"' " +" are matched", true);
					System.out.println("Group Identity Attribute is matched");
				}else {
					logStatus("fail", "Group IdentityAttribute is"+ " '"+actual+"' " +" are not matched", true);
					System.out.println("Group Identity Attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	

	
	public CorrelationPage  verifyGroupAttribute(String text,String type) {
		try {
			WebElement togetrow=driver.findElementByXPath("(//table[@style='table-layout:fixed']/tbody)[2]");
			java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
			int count=totalrow.size();
			int count2=0;
			for(int i=0;i<=count-2;i++) {
				
				String attribute=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':1:schemaAttrTbl:"+i+":attrName')]").getAttribute("value");
				String actual=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':1:schemaAttrTbl:"+i+":attributeType')]").getAttribute("value");
			if(attribute.equalsIgnoreCase(text)) {
				if(actual.equalsIgnoreCase(type)) {
					System.out.println(attribute+" Type is "+" '"+actual +"' "+" matched");
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}
				else if(actual.equalsIgnoreCase("group")) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}else if(actual.equalsIgnoreCase("boolean")) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
				}
				else {
					System.out.println(attribute+" matched but Type is "+" '"+actual +"' "+" not matched");
					logStatus("fail", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" not matched ", false);
				}
				break;
			}else {
				count2=count2+1;
				if(count2==count-1) {
					
					System.out.println(text+" Type is "+" '"+type +"' "+" not matched");
					logStatus("fail", "The "+ " '"+text+"' " +" atrribute type is"+ " '"+type+"' " +" not matched ", false);
					
				}
			}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return new CorrelationPage(driver,test);
		
	}
	public SchemaPage verifyRoleNativeObjectType(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Role Object Type not applicable");
				logStatus("pass", "Role Native Object type is not applicable", false);
			}else {
				WebDriverWait wait =new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[5]")));
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[5]").getAttribute("value");
				
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Role Native Object Type is"+ " '"+actual+"' " +" are matched", false);
					System.out.println(" Role native object value is matched");
				}else {
					logStatus("fail", "Role Native Object Type is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Role native object value is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage verifyRoleDisplayAttribute(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Role Display Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[7]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Role DisplayAttribute is"+ " '"+actual+"' " +" are matched", false);
					System.out.println("Role display attribute is matched");
				}else {
					logStatus("fail", "Role DisplayAttribute is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Role display attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
		
	}
	
	public SchemaPage verifyRoleIdentityAttribute(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Role Identity Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[6]").getAttribute("value");
//		clickByXpath("//*[@name='editForm:j_idt507:1:j_idt682' or @name='editForm:j_idt506:1:j_idt524']");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Role IdentityAttribute is"+ " '"+actual+"' " +" are matched", true);
					System.out.println("Role Identity Attribute is matched");
				}else {
					logStatus("fail", "Role IdentityAttribute is"+ " '"+actual+"' " +" are not matched", true);
					System.out.println("Role Identity Attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	public SchemaPage  verifyAttributeForRole(String text,String type) {
		try {
			WebElement togetrow=driver.findElementByXPath("(//table[@style='table-layout:fixed']/tbody)[2]");
			java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
			int count=totalrow.size();
			int count2=0;
			//System.out.println(count);
			for(int i=0;i<=count-2;i++) {
				String attribute=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':1:schemaAttrTbl:"+i+":attrName')]").getAttribute("value");
			String actual=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':1:schemaAttrTbl:"+i+":attributeType')]").getAttribute("value");
			if(attribute.equalsIgnoreCase(text)) {
				if(actual.equalsIgnoreCase(type)) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					System.out.println(attribute+" Type is "+" '"+type +"' "+" matched");
					}else if(actual.equalsIgnoreCase("group")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("boolean")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("role")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}

					else if(actual.equalsIgnoreCase("subscription")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("resourceGroup")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("resource")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
				else {
						System.out.println(attribute+" matched but Type is "+" '"+actual +"' "+" not matched");
						logStatus("fail", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" not matched ", false);
					}
				break;
				}
			else {
				count2=count2+1;
				if(count2==count-1) {
					
					System.out.println(text+" Type is "+" '"+type +"' "+" not matched");
					logStatus("fail", "The "+ " '"+text+"' " +" atrribute type is"+ " '"+type+"' " +" not matched ", false);
					
				}
			}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;

	}
	public SchemaPage verifyPrivilegeNativeObjectType(String text) {
		
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", " Privilege Native object is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[5]").getAttribute("value");
				//clickByXpath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[5]");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Privilege Native Object Type is"+ " '"+actual+"' " +" are matched", false);
					System.out.println(" Privilege native object value is matched");
				}else {
					logStatus("fail", "Privilege Native Object Type is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Privilege native object value is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}
		return this;
	}
	
	public SchemaPage verifyPrivilegeDisplayAttribute(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Privilege Display Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[7]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Privilege DisplayAttribute is"+ " '"+actual+"' " +" are matched", false);
					System.out.println("Privilege display attribute is matched");
				}else {
					logStatus("fail", "Privilege DisplayAttribute is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Privilege display attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}
		return this;
		
	}
	
	public SchemaPage verifyPrivilegeIdentityAttribute(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Privilege Identity Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[6]").getAttribute("value");
				//clickByXpath("//*[@name='editForm:j_idt509:1:j_idt527' or @name='editForm:j_idt796:1:j_idt814']");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Privilege IdentityAttribute is"+ " '"+actual+"' " +" are matched", true);
					System.out.println("Privilege Identity Attribute is matched");
				}else {
					logStatus("fail", "Privilege IdentityAttribute is"+ " '"+actual+"' " +" are not matched", true);
					System.out.println("Privilege Identity Attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	public SchemaPage verifyGroupNativeObjectForSwow(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Group Object Type not applicable");
				logStatus("pass", " Group native object Type is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[9]").getAttribute("value");
				
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Group Native Object Type is"+ " '"+actual+"' " +" are matched", false);
					System.out.println(" Group native object value is matched");
				}else {
					logStatus("fail", "Group Native Object Type is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Group native object value is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage verifyGroupDisplayAttributeForSwow(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Group Display Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[11]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Group DisplayAttribute is"+ " '"+actual+"' " +" are matched", false);
					System.out.println("Group display attribute is matched");
				}else {
					logStatus("fail", "Group DisplayAttribute is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Group display attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
		
	}
	
	public SchemaPage verifyGroupIdentityAttributeForSwow(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Group Identity Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[10]").getAttribute("value");
				//clickByXpath("//*[@name='editForm:j_idt664:2:j_idt682' or @name='editForm:j_idt506:2:j_idt524']");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Group IdentityAttribute is"+ " '"+actual+"' " +" are matched", true);
					System.out.println("Group Identity Attribute is matched");
				}else {
					logStatus("fail", "Group IdentityAttribute is"+ " '"+actual+"' " +" are not matched", true);
					System.out.println("Group Identity Attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	public CorrelationPage  verifyGroupAttributeForSwow(String text,String type) {
		try {
			WebElement togetrow=driver.findElementByXPath("(//table[@style='table-layout:fixed']/tbody)[3]");
			java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
			int count=totalrow.size();
			int count2=0;
			//System.out.println(count);
			for(int i=0;i<=count-2;i++) {
				String attribute=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':2:schemaAttrTbl:"+i+":attrName')]").getAttribute("value");
			String actual=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':2:schemaAttrTbl:"+i+":attributeType')]").getAttribute("value");
			if(attribute.equalsIgnoreCase(text)) {
				if(actual.equalsIgnoreCase(type)) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					System.out.println(attribute+" Type is "+" '"+type +"' "+" matched");
					}else if(actual.equalsIgnoreCase("group")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("boolean")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("role")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
				else {
						System.out.println(attribute+" matched but Type is "+" '"+actual +"' "+" not matched");
						logStatus("fail", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" not matched ", false);
					}
				break;
				}
			else {
				count2=count2+1;
				if(count2==count-1) {
					
					System.out.println(text+" Type is "+" '"+type +"' "+" not matched");
					logStatus("fail", "The "+ " '"+text+"' " +" atrribute type is"+ " '"+type+"' " +" not matched ", false);
					
				}
			}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return new CorrelationPage(driver, test);
	}
	
	public SchemaPage verifyResourceGroupNativeObjectTypeForAzure(String text) {
		
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", " Resource Group native object type is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[5]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Resource Group Native Object Type is"+ " '"+actual+"' " +" are matched", false);
					System.out.println(" Resource Group native object value is matched");
				}else {
					logStatus("fail", "Resource Group Native Object Type is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Resource Group native object value is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage verifyResourceGroupIdentityAttribute(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Resource Group Identity Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[6]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Resource Group IdentityAttribute is"+ " '"+actual+"' " +" are matched", true);
					System.out.println("Resource Group Identity Attribute is matched");
				}else {
					logStatus("fail", "Resource Group IdentityAttribute is"+ " '"+actual+"' " +" are not matched", true);
					System.out.println("Resource Group Identity Attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage verifyResourceNativeObjectForAzure(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", " Resource native object is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[9]").getAttribute("value");
				
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Resource Native Object Type is"+ " '"+actual+"' " +" are matched", false);
					System.out.println(" Resource native object value is matched");
				}else {
					logStatus("fail", "Resource Native Object Type is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Resource native object value is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage verifyResourceIdentityAttributeForAzure(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Resource Identity Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[10]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Resource IdentityAttribute is"+ " '"+actual+"' " +" are matched", true);
					System.out.println("Resource Identity Attribute is matched");
				}else {
					logStatus("fail", "Resource IdentityAttribute is"+ " '"+actual+"' " +" are not matched", true);
					System.out.println("Resource Identity Attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage  verifyResourceAttributeForAzure(String text,String type) {
		try {
			WebElement togetrow=driver.findElementByXPath("(//table[@style='table-layout:fixed']/tbody)[3]");
			java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
			int count=totalrow.size();
			int count2=0;
			//System.out.println(count);
			for(int i=0;i<=count-2;i++) {
				String attribute=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':2:schemaAttrTbl:"+i+":attrName')]").getAttribute("value");
			String actual=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':2:schemaAttrTbl:"+i+":attributeType')]").getAttribute("value");
			if(attribute.equalsIgnoreCase(text)) {
				if(actual.equalsIgnoreCase(type)) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					System.out.println(attribute+" Type is "+" '"+type +"' "+" matched");
					}else if(actual.equalsIgnoreCase("group")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("boolean")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("role")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}

					else if(actual.equalsIgnoreCase("subscription")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("resourceGroup")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("resource")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
				else {
						System.out.println(attribute+" matched but Type is "+" '"+actual +"' "+" not matched");
						logStatus("fail", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" not matched ", false);
					}
				break;
				}
			else {
				count2=count2+1;
				if(count2==count-1) {
					
					System.out.println(text+" Type is "+" '"+type +"' "+" not matched");
					logStatus("fail", "The "+ " '"+text+"' " +" atrribute type is"+ " '"+type+"' " +" not matched ", false);
					
				}
			}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage verifySubscriptionNativeObjectForAzure(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", " Subscription native object is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[13]").getAttribute("value");
				
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Subscription Native Object Type is"+ " '"+actual+"' " +" are matched", false);
					System.out.println(" Subscription native object value is matched");
				}else {
					logStatus("fail", "Subscription Native Object Type is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Subscription native object value is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage verifySubscriptionIdentityAttributeForAzure(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Subscription Identity Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[14]").getAttribute("value");
				//clickByXpath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[14]");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Subscription IdentityAttribute is"+ " '"+actual+"' " +" are matched", true);
					System.out.println("Subscription Identity Attribute is matched");
				}else {
					logStatus("fail", "Subscription IdentityAttribute is"+ " '"+actual+"' " +" are not matched", true);
					System.out.println("Subscription Identity Attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage  verifySubscriptionAttributeForAzure(String text,String type) {
		try {
			WebElement togetrow=driver.findElementByXPath("(//table[@style='table-layout:fixed']/tbody)[4]");
			java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
			int count=totalrow.size();
			int count2=0;
			//System.out.println(count);
			for(int i=0;i<=count-2;i++) {
				String attribute=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':3:schemaAttrTbl:"+i+":attrName')]").getAttribute("value");
			String actual=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':3:schemaAttrTbl:"+i+":attributeType')]").getAttribute("value");
			if(attribute.equalsIgnoreCase(text)) {
				if(actual.equalsIgnoreCase(type)) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					System.out.println(attribute+" Type is "+" '"+type +"' "+" matched");
					}else if(actual.equalsIgnoreCase("group")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("boolean")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("role")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("subscription")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("resourceGroup")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("resource")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
				else {
						System.out.println(attribute+" matched but Type is "+" '"+actual +"' "+" not matched");
						logStatus("fail", "The "+ " '"+attribute+"' " +" atrribute type is"+ " '"+actual+"' " +" not matched ", false);
					}
				break;
				}
			else {
				count2=count2+1;
				if(count2==count-1) {
					
					System.out.println(text+" Type is "+" '"+type +"' "+" not matched");
					logStatus("fail", "The "+ " '"+text+"' " +" atrribute type is"+ " '"+type+"' " +" not matched ", false);
					
				}
			}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	
	public SchemaPage verifyGroupNativeObjectForAzure(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", " Group native object is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[17]").getAttribute("value");
				
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Group Native Object Type is"+ " '"+actual+"' " +" are matched", false);
					System.out.println(" Group native object value is matched");
				}else {
					logStatus("fail", "Group Native Object Type is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Group native object value is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public SchemaPage verifyGroupDisplayAttributeForAzure(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Group display Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[19]").getAttribute("value");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Group Display Attribute is"+ " '"+actual+"' " +" are matched", false);
					System.out.println("Group display attribute is matched");
				}else {
					logStatus("fail", "Group Display Attribute is"+ " '"+actual+"' " +" are not matched", false);
					System.out.println("Group display attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
		
	}
	
	public SchemaPage verifyGroupIdentityAttributeForAzure(String text) {
		try {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Object Type not applicable");
				logStatus("pass", "Group Identity Attribute is not applicable", false);
			}else {
				String actual=driver.findElementByXPath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[18]").getAttribute("value");
				//clickByXpath("(//*[@class='schema-detail-label']//following-sibling::div/input[contains(@name,'editForm:j_idt')])[18]");
				if(actual.equalsIgnoreCase(text)) {
					logStatus("pass", "Group IdentityAttribute is"+ " '"+actual+"' " +" are matched", true);
					System.out.println("Group Identity Attribute is matched");
				}else {
					logStatus("fail", "Group IdentityAttribute is"+ " '"+actual+"' " +" are not matched", true);
					System.out.println("Group Identity Attribute is not matched");
				}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return this;
	}
	
	public CorrelationPage  verifyGroupAttributeForAzure(String text,String type) {
		try {
			WebElement togetrow=driver.findElementByXPath("(//table[@style='table-layout:fixed']/tbody)[5]");
			java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
			int count=totalrow.size();
			int count2=0;
			//System.out.println(count);
			for(int i=0;i<=count-2;i++) {
				String attribute=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':4:schemaAttrTbl:"+i+":attrName')]").getAttribute("value");
			String actual=driver.findElementByXPath("//*[contains(@name,'editForm:j_idt')and contains(@name,':4:schemaAttrTbl:"+i+":attributeType')]").getAttribute("value");
			if(attribute.equalsIgnoreCase(text)) {
				if(actual.equalsIgnoreCase(type)) {
					logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					System.out.println(attribute+" Type is "+" '"+type +"' "+" matched");
					}else if(actual.equalsIgnoreCase("group")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("boolean")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}else if(actual.equalsIgnoreCase("role")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("subscription")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("resourceGroup")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
					else if(actual.equalsIgnoreCase("resource")) {
						logStatus("pass", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" matched successfully", false);
					}
				else {
						System.out.println(attribute+" matched but Type is "+" '"+actual +"' "+" not matched");
						logStatus("fail", "The "+ " '"+attribute+"' " +" attribute type is"+ " '"+actual+"' " +" not matched ", false);
					}
				break;
				}
			else {
				count2=count2+1;
				if(count2==count-1) {
					
					System.out.println(text+" Type is "+" '"+type +"' "+" not matched");
					logStatus("fail", "The "+ " '"+text+"' " +" attribute type is"+ " '"+type+"' " +" not matched ", false);
					
				}
			}
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		}
		return new CorrelationPage(driver, test);
	}
	
	public SchemaPage SchemaAccountScreenshot(int i, int count) {
		if(i%count==0) {
			
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
		return this;
	}
	
	public SchemaPage SchemaGroupScreenshot(int i, int count) {
		if(i%count==0) {
			
				clickByXpath(LocatorObjects.SchemaGroupAttribute+i+":attrName')]");
				//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaGroupAttribute+i+":attrName')]")));
					logStatus("pass", "The screenshot of Schema attributes", true);
				}catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}catch (TimeoutException e) {
					System.out.println("Element not found");
				}
			}
		return this;
	}
	
	public SchemaPage SchemaRoleScreenshot(int i, int count) {
		if(i%count==0) {
			
				clickByXpath(LocatorObjects.SchemaRoleAttribute+i+":attrName')]");
				//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaRoleAttribute+i+":attrName')]")));
					logStatus("pass", "The screenshot of Schema attributes", true);
				}catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}catch (TimeoutException e) {
					System.out.println("Element not found");
				}
			}
		return this;
	}
	
	public SchemaPage SchemaGroupForSWOWScreenshot(int i, int count) {
		if(i%count==0) {
			
				clickByXpath(LocatorObjects.SchemaGroupAttributeForSwow+i+":attrName')]");
				//System.out.println(LocatorObjects.SchemaAccountAttribute+i+":attrName')]");
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LocatorObjects.SchemaGroupAttributeForSwow+i+":attrName')]")));
					logStatus("pass", "The screenshot of Schema attributes", true);
				}catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}catch (TimeoutException e) {
					System.out.println("Element not found");
				}
			}
		return this;
	}
}


