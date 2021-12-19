package com.testng.samsung;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class SamsungTestCases extends BaseClass{

	public static SamsungRepository repo = new SamsungRepository(driver);
	
	@BeforeSuite
	public void launchUrl() {
		browserOpen("chrome");
		loadUrl("https://www.samsung.com/in/");
	}
	
//	@Test(priority=1)
//	public void signInStep() {
//		jsClick(repo.getLocators().getUserIcon());
//		jsClick(repo.getLocators().getSignIn());
//	}
	
//	@Test(priority=1)
//	public void selectOption() {
		//frameCount();
		//frameIndex(1);
		//jsClick(repo.getLocators().getMailId());
	    //mouseHover(repo.getLocators().getSmartPhones());
	    //jsClick(repo.getLocators().getAllPhones());
	//}
	
	@Test(priority=1)
	public void search() {
		jsClick(repo.getLocators().getSearch());
		jsSetAttribute(repo.getLocators().getSearchBox(), "Galaxy S21");
		jsClick(repo.getLocators().getSearchButton());
		String productSelect= getCurrentUrl();
		loadUrl(productSelect);
	}
	
	@Test(priority=2)
	public void selectProduct() {
		jsClick(repo.getLocators().getProduct());
		String productPage = getCurrentUrl();
		loadUrl(productPage);
	}
	
	@Test(priority=3)
	public void addToCart() {
		jsClick(repo.getLocators().getBuyButton());
		String cartPage = getCurrentUrl();
		loadUrl(cartPage);
		
		jsClick(repo.getLocators().getAddToCart());
		
	}
	
}
