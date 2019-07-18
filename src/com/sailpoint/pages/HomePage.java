package com.sailpoint.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.object.LocatorObjects;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BaseTest;

public class HomePage extends BaseTest{
	public HomePage(RemoteWebDriver driver1,ExtentTest test1) {
		this.driver=driver1;
		this.test=test1;
	}
	
	public HomePage clickOnApplications() {
		clickByXpath(LocatorObjects.clickOnApplications);
		return this;
		}
	public AppDefinitionPage clickOnAppDefinition() {
		clickByXpath(LocatorObjects.clickOnAppDefinition);
		return new AppDefinitionPage(driver, test);
	}
	public HomePage clickSetup() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("(//*[@class='dropdown-toggle'])[5]").sendKeys(Keys.F5);
		clickByXpath("(//*[@class='dropdown-toggle'])[5]");
		return this;
	}
	public GroupConfigPage clickOnGroups() {
		clickByXpath("//*[@role='menuitem' and contains(text(),'Groups')]");
		return new GroupConfigPage(driver, test);
	}
	public TasksPage clickOnTasks() {
		clickByXpath("//*[@role='menuitem' and contains(text(),'Tasks')]");
		return new TasksPage(driver, test);
	}
	public CertificationPage clickOnCertifications() {
		clickByXpath("//*[@role='menuitem' and contains(text(),'Certifications')]");
		return new CertificationPage(driver, test);
	}

}
