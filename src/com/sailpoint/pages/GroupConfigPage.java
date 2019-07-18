package com.sailpoint.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.object.LocatorObjects;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BaseTest;

public class GroupConfigPage extends BaseTest {
	public GroupConfigPage(RemoteWebDriver driver1,ExtentTest test1) {
		this.driver=driver1;
		this.test=test1;
	}

		public GroupConfigPage clickOnWorkgroups() {
			
			clickByXpath("//*[@id='tab-1080-btnInnerEl']");
			return this;
		}
		public GroupConfigPage enterApplicationName(String data) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				driver.findElementByXPath("//*[@id='workgroupSearchField-inputEl']").clear();
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.out.println("Element not found");
			}
			EnterDataByXpath("//*[@id='workgroupSearchField-inputEl']", data);
			return this;
		}
		public GroupConfigPage clickOnSearchIcon() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//*[@id="ext-gen1169"]
			clickByXpath("//*[@id='ext-gen1184']");
			return this;
		}
		public GroupConfigPage hitEnterOnSearchBox() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				driver.findElementByXPath("//*[@id='workgroupSearchField-inputEl']").sendKeys(Keys.ENTER);
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.out.println("Element not found");
			}
			return this;
		}
		public GroupConfigPage verifyTheNames() {
			try {
				logStatus("pass", "screenshot of workgroups of application", true);
				WebDriverWait wait=new WebDriverWait(driver, 40);
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class='x-grid-table x-grid-table-resizer']/tbody)[2]")));
				WebElement togetrow=(WebElement) driver.findElementByXPath("//*[@id=\"gridview-1021\"]/table");
				//*[@id="gridview-1021"]/table
				
				//(//*[@class='x-grid-table x-grid-table-resizer']/tbody)[2]
				List<WebElement> totalrow= togetrow.findElements(By.tagName("tr"));
				int count=totalrow.size();
				//System.out.println(count);
				for(int i=2;i<=count;i++) {
					String attribute1=driver.findElementByXPath("//table[@class='x-grid-table x-grid-table-resizer']/tbody/tr["+i+"]/td[1]").getText();
					logStatus("pass", "Workgroups name attributes are "+" '"+attribute1+"' ", false);
				//System.out.println(attribute1);
				
				
}
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.out.println("Element not found");
			}
			
			return this;
		}
		public GroupConfigPage verifyAppOwner(String text) {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Correlation rule is not applicable");
			}else {
				enterApplicationName(text);
				hitEnterOnSearchBox();
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 40);
					wait.ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1018   x-grid-cell-first']")));
				} catch (NoSuchElementException e1) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					String actual=driver.findElementByXPath("//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1018   x-grid-cell-first']").getText();
					if(text.equalsIgnoreCase(actual)) {
						logStatus("pass", "Owner name of Application"+ " '"+actual+"' " +" are matched", true);
					}else {
						logStatus("fail", "Owner name of Application"+ " '"+actual+"' " +" are not matched", false);
					}
					System.out.println(actual);
				}
				catch(NoSuchElementException e) {
					System.out.println("AppOwner not found");
					logStatus("fail", "Owner name of the Application is missing", false);
				}
				catch(TimeoutException e) {
					System.out.println("AppOwner not found");
					logStatus("fail", "Owner name of the Application is missing", false);
				}
			}
			return this;
		}
		public GroupConfigPage verifyAppRevokers(String text) {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Correlation rule is not applicable");
			}else {
				enterApplicationName(text);
				hitEnterOnSearchBox();
				try {
					WebDriverWait wait=new WebDriverWait(driver, 40);
					wait.ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1018   x-grid-cell-first']")));
				} catch (NoSuchElementException e1) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					String actual=driver.findElementByXPath("//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1018   x-grid-cell-first']").getText();
					if(text.equalsIgnoreCase(actual)) {
						logStatus("pass", "Revokers name of Application is"+ " '"+actual+"' " +" are matched", true);
					}else {
						logStatus("fail", "Revokers name of Application is"+ " '"+actual+"' " +" are not matched", false);
					}
					System.out.println(actual);
					}
				catch(NoSuchElementException e) {
					System.out.println("Revokers not found");
					logStatus("fail", "Revokers name of the Application is missing", false);
				}
				catch(TimeoutException e) {
					System.out.println("Revokers not found");
					logStatus("fail", "Revokers name of the Application is missing", false);
				}
			}
			return this;
		}
		public GroupConfigPage verifyAppCertifiers(String text) {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Correlation rule is not applicable");
			}else {
				enterApplicationName(text);
				hitEnterOnSearchBox();
				
				try {
					WebDriverWait wait=new WebDriverWait(driver, 40);
					wait.ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1018   x-grid-cell-first']")));
				} catch (NoSuchElementException e1) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				} catch (TimeoutException e) {
					System.out.println("Element not found");
				}
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					String actual=driver.findElementByXPath("//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1018   x-grid-cell-first']").getText();
					if(text.equalsIgnoreCase(actual)) {
						logStatus("pass", "Certifiers name of Application is"+ " '"+actual+"' " +" are matched", true);
					}else {
						logStatus("fail", "Certifiers name of Application is"+ " '"+actual+"' " +" are not matched", false);
					}
					System.out.println(actual);
				}
				catch(NoSuchElementException e) {
					System.out.println("AppCertifiers not found");
					logStatus("fail", "Certifiers name of the application is missing", false);
				}
				catch(TimeoutException e) {
					System.out.println("AppCertifiers not found");
					logStatus("fail", "Certifiers name of the application is missing", false);
				}
			}
			return this;
		}
		public GroupConfigPage verifyAppRoleOwners(String text) {
			if(text.equalsIgnoreCase("NA")) {
				System.out.println("Correlation rule is not applicable");
			}else {
				enterApplicationName(text);
				hitEnterOnSearchBox();
				try {
					WebDriverWait wait=new WebDriverWait(driver, 40);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='x-grid-cell-inner ']")));
				} catch (NoSuchElementException e1) {
					// TODO Auto-generated catch block
					System.out.println("Element not found");
				}
				
				try {
					String actual=driver.findElementByXPath("//*[@class='x-grid-cell-inner ']").getText();
					if(text.equalsIgnoreCase(actual)) {
						logStatus("pass", "Role Owner name of Application is"+ " '"+actual+"' " +" are matched", true);
					}else {
						logStatus("fail", "Role Owner name of Application is"+ " '"+actual+"' " +" are not matched", false);
					}
					System.out.println(actual);
				}
				catch(NoSuchElementException e) {
					System.out.println("RoleOwner not found");
					logStatus("fail", "RoleOwner name of the application is missing", false);
				}
				catch(TimeoutException e) {
					System.out.println("RoleOwner not found");
					logStatus("fail", "RoleOwner name of the application is missing", false);
				}
			}
			return this;
		}
		
}
