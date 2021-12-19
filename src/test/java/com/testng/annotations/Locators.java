package com.testng.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class Locators extends BaseClass {
	
	@FindBy(name="ctl00$CPHContainer$txtUserLogin")
	private WebElement dummyName;

	@FindBy(name="ctl00$CPHContainer$txtPassword")
	private WebElement dummyPwd;

	@FindBy(name="ctl00$CPHContainer$btnLoginn")
	private WebElement dummyClick;

	public WebElement getDummyName() {
		return dummyName;
	}

	public WebElement getDummyPwd() {
		return dummyPwd;
	}

	public WebElement getDummyClick() {
		return dummyClick;
	}
	
	@FindBy(id="email")
	public WebElement userNameforFB;
	
	@FindBy(id="pass")
	public WebElement passWordforFB;
	
	public WebElement getUserNameforFB() {
		return userNameforFB;
	}

	public WebElement getPassWordforFB() {
		return passWordforFB;
	}

	public WebElement getLoginButtonforFB() {
		return loginButtonforFB;
	}

	@FindBy(name="login")
	public WebElement loginButtonforFB;
	
@FindBy(id="username")
private WebElement username;

@FindBy(id="password")
private WebElement password;

@FindBy(partialLinkText="New User")
private WebElement registerButton;

@FindBy(id="Submit")
private WebElement submitButton;

public WebElement getRegisterButton() {
	return registerButton;
}

public WebElement getSubmitButton() {
	return submitButton;
}

@FindBy(name="username")
private WebElement regUserName;

@FindBy(id="password")
private WebElement regPwd;

@FindBy(id="re_password")
private WebElement confirmPwd;

@FindBy(id="full_name")
private WebElement fullName;

@FindBy(id="email_add")
private WebElement mail;

public WebElement getPwdNotMatchException() {
	return pwdNotMatchException;
}

public WebElement getPwdLengthExeption() {
	return pwdLengthExeption;
}

public WebElement getRegUserName() {
	return regUserName;
}

public WebElement getRegPwd() {
	return regPwd;
}

public WebElement getConfirmPwd() {
	return confirmPwd;
}

public WebElement getFullName() {
	return fullName;
}

public WebElement getMail() {
	return mail;
}

@FindBy(id="tnc_box")
private WebElement checkBox;
public WebElement getCheckBox() {
	return checkBox;
}

@FindBy(xpath="//label[text()='Username is Empty']")
private WebElement userNameEmptyException;

public WebElement getUserNameEmptyException() {
	return userNameEmptyException;
}
@FindBy(xpath = "//label[text()='Password is Empty']")
private WebElement pwdEmptyException;
@FindBy(xpath = "//label[text()='Confirm Password is Empty']")
private WebElement confirmPwdEmptyException;
@FindBy(xpath = "//label[text()='Full Name is Empty']")
private WebElement nameEmptyException;
@FindBy(xpath = "//label[text()='Email Address is Empty']")
private WebElement emailEmptyException;
@FindBy(xpath = "//label[text()='Captcha is Empty']")
private WebElement captchaEmptyException;
@FindBy(xpath = "//label[text()='You must agree to Terms and Conditions']")
private WebElement checkBoxNotClickException;

@FindBy(xpath="//label[text()='Passwords Do Not Match']")
private WebElement pwdNotMatchException;

@FindBy(xpath="//label[text()='Password must contain minimum 6 characters']")
private WebElement pwdLengthExeption;

@FindBy(id="Reset")
private WebElement resetButton;

@FindBy(linkText="Go back to Login page")
private WebElement goBack;

public WebElement getGoBack() {
	return goBack;
}

public WebElement getResetButton() {
	return resetButton;
}

public WebElement getPwdEmptyException() {
	return pwdEmptyException;
}

public WebElement getConfirmPwdEmptyException() {
	return confirmPwdEmptyException;
}

public WebElement getNameEmptyException() {
	return nameEmptyException;
}

public WebElement getEmailEmptyException() {
	return emailEmptyException;
}

public WebElement getCaptchaEmptyException() {
	return captchaEmptyException;
}

public WebElement getCheckBoxNotClickException() {
	return checkBoxNotClickException;
}

@FindBy(xpath="//input[@class='login_button']")
private WebElement loginButton;

@FindBy(xpath="//span[contains(text(),'Enter Password')]")
private WebElement pwdException;

@FindBy(xpath="//span[contains(text(),'Enter Username')]")
private WebElement userNameException;

@FindBy(xpath="//b[contains(text(),'Invalid Login details or Your Password might have expired. ')]")
private WebElement invalidCredentialsException;

public WebElement getUserNameException() {
	return userNameException;
}

public WebElement getInvalidCredentialsException() {
	return invalidCredentialsException;
}

public WebElement getPwdException() {
	return pwdException;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginButton() {
	return loginButton;
}

/*
 * public LoginPage() { PageFactory.initElements(driver, this); }
 */
public Locators(WebDriver fdriver) {
	this.driver = fdriver;
	PageFactory.initElements(driver, this);
}
}