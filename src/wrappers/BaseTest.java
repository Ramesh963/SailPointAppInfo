package wrappers;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import utilsFiles.Reporter1;


public class BaseTest extends Reporter1 implements wrappers {
	protected RemoteWebDriver driver;
	public static Properties prob;

	//launch the browser
	//set property for driver instance
	//hit the URL on browser and maximize the browser
	@Override
	public void invokeApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				    driver=new ChromeDriver();
				
				}else if(browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					driver = new FirefoxDriver(); 
				
				}
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (WebDriverException e) {
			System.err.println("browser closed due to unknown error");
		}
		
	}
	
	//enter the data in webpage by using xpath locator
	@Override
	public void EnterDataByXpath(String Xpath, String data) {
		
		try {
			driver.findElementByXPath(Xpath).clear();
			driver.findElementByXPath(Xpath).sendKeys(data);
		} catch (NoSuchElementException e) {
			System.err.println("No such element found");
		}catch (WebDriverException e) {
			System.err.println("browser closed due to unknown error");
		}
		
	}

	//close the active window
	@Override
	public void close() {
		driver.close();
		
	}

	//click the radio button on webpage by using Xpath locator
	@Override
	public void clickByXpath(String xpath) {
		
		try {
			driver.findElementByXPath(xpath).click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found");
		}catch (WebDriverException e) {
			System.err.println("browser closed due to unknown error");
		}
		
	}

	//hit the enter key in webpage by using Xpath locator
	@Override
	public void hitEnterByXpath(String xpath) {
		try {
			driver.findElementByXPath(xpath).sendKeys(Keys.ENTER);
		} catch (NoSuchElementException e) {
			System.err.println("No such element found");
		}catch (WebDriverException e) {
			System.err.println("browser closed due to unknown error");
		}
		
	}
	
	//mouse over on webpage by using Xpath locator
	@Override
	public void mouseOverByXpath(String xpath) {
		WebElement obj=driver.findElementByXPath(xpath);
		Actions act=new Actions(driver);
		act.moveToElement(obj).build().perform();
	}

	//get the attribute from the webpage by using Xpath locator
	//comparing the actual and expected values
	@Override
	public void verifyTextByXpath(String xpath, String text) {
		try {
			String actual=driver.findElementByXPath(xpath).getAttribute("value");
			System.out.println(actual);
			if(actual.equalsIgnoreCase(text)) {
				System.out.println("both of text matched");
			}else {
				System.out.println("both of text not matched");
			}
		} catch (NoSuchElementException e) {
			System.err.println("No such element found");
		}catch (WebDriverException e) {
			System.err.println("browser closed due to unknown error");
		}
	}

	//loading the objects from the different files
	@Override
	public void loadingObject() {
		prob=new Properties();
		try {
			prob.load(new FileInputStream(new File("./configPropertiesFiles/locatorProperties.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//unloading the object from the files
	@Override
	public void unloadObject() {
		prob=null;
		
	}

	@Override
	public long takesnap() {
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
	    String strDate= formatter.format(date);  
		long number=1000000l;
		number=(long)Math.floor(Math.random()*10000000l)+1000000l;
		File pic=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("G:\\Security\\Sailpoint Apps Onboarding\\Screenshot "+strDate+"\\"+number+".jpeg");
		try {
			FileUtils.copyFile(pic, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number;
		
	}

}
