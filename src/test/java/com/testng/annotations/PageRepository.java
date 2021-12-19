package com.testng.annotations;


import org.openqa.selenium.WebDriver;

import com.base.utils.BaseClass;

public class PageRepository extends BaseClass{
	private Locators login;

	public Locators getLogin() {
			login = new Locators(driver);
		return login;
	}
	
	public PageRepository(WebDriver fdriver) {
		this.driver = fdriver;
	}
}
