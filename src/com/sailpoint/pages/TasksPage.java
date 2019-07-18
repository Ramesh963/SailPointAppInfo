package com.sailpoint.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BaseTest;

public class TasksPage extends BaseTest {

	public TasksPage(RemoteWebDriver driver1,ExtentTest test1) {
		this.driver=driver1;
		this.test=test1;
	}
	public TasksPage enterTaskName(String data) {
		if(data.equalsIgnoreCase("NA")) {
			System.out.println("Value given in excel sheet is NA");
		}else {
			//driver.findElementByXPath("//*[@id='tasksSearchField-inputEl']").clear();
			EnterDataByXpath("//*[@id='tasksSearchField-inputEl']", data);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hitEnterByXpath("//*[@id='tasksSearchField-inputEl']");
			hitEnterByXpath("//*[@id='tasksSearchField-inputEl']");
		}
		return this;
	}
	
	public TasksPage clickSearchIconOnTask() {
		clickByXpath("//*[@id='ext-gen1226']");
		return this;
	}
	public TasksPage clickOnTaskResults() {
		clickByXpath("//*[@id='tab-1091-btnInnerEl']");
		return this;
	}
	public TasksPage enterResultName(String data) {
		if(data.equalsIgnoreCase("NA")) {
			System.out.println("Value given in excel sheet is NA");
		}else {
			EnterDataByXpath("//*[@id='resultsSearchField-inputEl']", data);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			hitEnterByXpath("//*[@id='resultsSearchField-inputEl']");
		}
		
		
		return this;
	}
	public TasksPage verifyTheTaskname(String text) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(text.equalsIgnoreCase("NA")) {
			System.out.println(" ");
		}else {
			try {
				
				String actual=driver.findElementByXPath("//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1022   x-grid-cell-first']").getText();
				if(text.equalsIgnoreCase(actual)) {
					logStatus("pass", "Given the task is "+ " '"+actual+"' " +" matched succesfully", true);
				}else {
					logStatus("fail", "Given the task is "+ " '"+actual+"' " +"  not matched", true);
				}
				System.out.println(actual);
			}
			
			catch(NoSuchElementException e) {
				System.out.println("Task not found");
				logStatus("fail", "The given task is not found", true);
			}
			catch(TimeoutException e) {
				System.out.println("Task not found");
				logStatus("fail", "The given task is not found", true);
			}
		}
		return this;
	}
	public TasksPage clickSearchIconOnTaskResult() {
		clickByXpath("//*[@id='ext-gen1239']");
		return this;
	}
	public TasksPage verifyResults(String text) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(" ");
		}
		if(text.equalsIgnoreCase("NA")) {
			System.out.println(" ");
		}else {
			try {
				String status=driver.findElementByXPath("(//*[contains(@class,'Box font10')])[1]").getText();
				if(status.equalsIgnoreCase("Success")) {
					
					clickOnResult1();
				
				}
				else if((status.equalsIgnoreCase("Fail")) || (status.equalsIgnoreCase("Cancelled"))){
					
					
					String status2=driver.findElementByXPath("(//*[contains(@class,'Box font10')])[2]").getText();
					
					if(status2.equalsIgnoreCase("success")){
						
						logStatus("fail", "The task '"+text+"' is failed", true);
						clickOnResult2();
					}
					else if((status2.equalsIgnoreCase("Fail")) || (status2.equalsIgnoreCase("Cancelled"))){
						
						logStatus("fail", "The task '"+text+"' is failed", true);
					}
				}
			}
			catch(NoSuchElementException e) {
				System.out.println("Task result not found");
				logStatus("fail", "The given task '"+text+"' is not triggered", true);
			}
			catch(TimeoutException e) {
				System.out.println("Task result not found");
				logStatus("fail", "The given task '"+text+"' is not triggered", true);
			}
		}
		return this;
		
	}
	public TasksPage clickOnResult1() {
		try {
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1063   x-grid-cell-first'])[1]")));
		} catch (NoSuchElementException e1) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		} catch(TimeoutException e) {
			System.out.println("Element not found ");
		}
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		clickByXpath("(//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1063   x-grid-cell-first'])[1]");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logStatus("pass", "screenshot of task results", true);
		return this;
	}
	public TasksPage clickOnResult2() {
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1063   x-grid-cell-first'])[2]")));
		} catch (NoSuchElementException e1) {
			// TODO Auto-generated catch block
			System.out.println("Element not found ");
		
		} catch(TimeoutException e) {
			System.out.println("Element not found ");
		}
		
		clickByXpath("(//*[@class=' x-grid-cell x-grid-cell-gridcolumn-1063   x-grid-cell-first'])[2]");
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logStatus("fail", "screenshot of task results", true);
		return this;
	}
	public TasksPage clickOnReturnToTask() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//logStatus("pass", "screenshot of task results", true);
		try {
		clickByXpath("//*[@value='Return to Tasks']");
		}
		catch(NoSuchElementException e) {
			System.out.println("Return To Task option is not available");
		}
		return this;
	}
	public TasksPage getStartDate() {
		try {
		String startdate=driver.findElementByXPath("//*[@id=\"taskResultsDetailsDiv\"]/table/tbody/tr[2]/td[4]").getText();
		logStatus("pass", "Startdate & start time of this task results"+" '"+startdate+"' ", false);
		System.out.println(startdate);
		}
		catch(NoSuchElementException e) {
			System.out.println("No start date found");
		}
		return this;
	}
	public TasksPage getCompletedDate() {
		try {
		String completedate=driver.findElementByXPath("//*[@id=\"taskResultsDetailsDiv\"]/table/tbody/tr[3]/td[4]").getText();
		logStatus("pass", "Enddate & end time of this taskresults "+" '"+completedate+"' ", false);
		System.out.println(completedate);
		}
		catch(NoSuchElementException e) {
			System.out.println("No completed date found");
		}
		return this;
	}
}
