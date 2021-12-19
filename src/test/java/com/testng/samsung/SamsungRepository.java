package com.testng.samsung;

import org.openqa.selenium.WebDriver;

import com.base.utils.BaseClass;

public class SamsungRepository extends BaseClass{
	private SamsungLocators sl;
	
	public SamsungLocators getLocators() {
		sl = new SamsungLocators(driver);
		return sl;
	}

	public SamsungRepository(WebDriver chromeDriver) {
		this.driver = chromeDriver;
	}
}
