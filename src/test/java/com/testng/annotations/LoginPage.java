package com.testng.annotations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(xpath="")
	private WebElement login;
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

}
