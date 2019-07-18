package com.sailpoint.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BaseTest;

public class CertificationPage extends BaseTest {
	
	public CertificationPage(RemoteWebDriver driver1,ExtentTest test1) {
		this.driver=driver1;
		this.test=test1;
	}

	
	public  CertificationPage clickOnNewCertification() {
		clickByXpath("//*[@id='newCertButton-btnInnerEl']");
		return this;
	}
	
	public CertificationPage clickOnApplicationOwner() {
		clickByXpath("//*[@id='newCertButton-ApplicationOwner-textEl']");
		return this;
	}
	
	public CertificationPage enterTheCertificateName(String data) {
		EnterDataByXpath("//*[@id='certificationScheduleForm:certificationTemplateName']", data);
		return this;
	}
	
	public CertificationPage enterApplicationName(String data) {
		EnterDataByXpath("//*[@id='baseSuggest-1043-inputEl']", data);
		hitEnterByXpath("//*[@id='baseSuggest-1043-inputEl']");
		return this;
	}
	
	public CertificationPage clickOnRunNow() {
		clickByXpath("//*[@id='certificationScheduleForm:runNowCheckbox']");
		return this;
	}
	
	public CertificationPage clickOnScheduleCertification() {
		clickByXpath("//*[@id='schedule-cert-btn-btnInnerEl']");
		return this;
	}
	
	
}

