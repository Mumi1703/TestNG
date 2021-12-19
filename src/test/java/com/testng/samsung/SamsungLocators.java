package com.testng.samsung;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class SamsungLocators extends BaseClass{
	
@FindBy(xpath="(//a[@role='button'])[14]")
private WebElement userIcon;

@FindBy(linkText="Log-In/Sign-Up")
private WebElement signIn;

@FindBy(xpath="//input[@type='email']")
private WebElement mailId;

@FindBy(xpath="//input[@type='password']")
private WebElement passWord;

@FindBy(id="signInButton")
private WebElement signInButton;

@FindBy(xpath="(//span[@class='gnb__depth1-link-text'])[1]")
private WebElement mobile;

@FindBy(xpath="(//span[@class='gnb__depth2-link-text'])[2]")
private WebElement smartPhones;

@FindBy(xpath="(//span[@class='gnb__depth3-link-text'])[17]")
private WebElement allPhones;

@FindBy(xpath="(//a[@class='gnb__search-btn gnb__search-btn-js'])[2]")
private WebElement search;

@FindBy(name="search")
private WebElement searchBox;

@FindBy(xpath="//button[@type='submit']")
private WebElement searchButton;

@FindBy(xpath="(//a[@class='result-title__link'])[2]")
private WebElement product;

@FindBy(linkText="Buy now")
private WebElement buyButton;

@FindBy(linkText="ADD TO CART")
private WebElement addToCart;

public WebElement getProduct() {
	return product;
}

public WebElement getBuyButton() {
	return buyButton;
}

public WebElement getAddToCart() {
	return addToCart;
}

public WebElement getSearch() {
	return search;
}

public WebElement getSearchBox() {
	return searchBox;
}

public WebElement getSearchButton() {
	return searchButton;
}

public WebElement getMobile() {
	return mobile;
}

public WebElement getSmartPhones() {
	return smartPhones;
}

public WebElement getAllPhones() {
	return allPhones;
}

private WebDriver chromeDriver;

public WebElement getUserIcon() {
	return userIcon;
}

public WebElement getSignIn() {
	return signIn;
}

public WebElement getMailId() {
	return mailId;
}

public WebElement getPassWord() {
	return passWord;
}

public WebElement getSignInButton() {
	return signInButton;
}

public SamsungLocators(WebDriver chromeDriver) {
	this.driver = chromeDriver;
	PageFactory.initElements(driver, this);
}

}
