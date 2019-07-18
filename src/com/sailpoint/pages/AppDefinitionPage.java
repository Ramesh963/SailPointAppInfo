package com.sailpoint.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.object.LocatorObjects;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BaseTest;

public class AppDefinitionPage extends BaseTest {
	public AppDefinitionPage(RemoteWebDriver driver1,ExtentTest test1) {
		this.driver=driver1;
		this.test=test1;
	}
	public AppDefinitionPage enterAppName(String data) {
		EnterDataByXpath(LocatorObjects.enterAppName, data);
		return this;
	}
	public AppDefinitionPage clickOnSearchIcon() {
		clickByXpath(LocatorObjects.clickOnSearchIcon);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public AppDetailsPage clickOnApplication(String data) {
		
		
		WebElement togetrow=driver.findElementByXPath("//table[@class='x-grid-table x-grid-table-resizer']/tbody");
		java.util.List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
		int count=totalrow.size();
		//System.out.println(count);
		int count2=0;
		for(int i=1;i<=count-1;i++) {
			
			String name=driver.findElementByXPath("(//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1018   x-grid-cell-first'])["+i+"]").getText();
		
		//System.out.println(name);
	
		if(name.equalsIgnoreCase(data)) {
		try {
			clickByXpath("(//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1018   x-grid-cell-first'])["+i+"]");
			break;
		} catch (NoSuchElementException e) {
			System.out.println("no such element found");
		}
		
		} 
		else {
			count2=count2+1;
			if(count2==count-1) {
			logStatus("fail", "application not found in sailpoint", true);
			System.out.println("User not found");
		}
		}
		}
	
		return new AppDetailsPage(driver, test);
	}
	
}
