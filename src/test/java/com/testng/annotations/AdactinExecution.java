package com.testng.annotations;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class AdactinExecution extends BaseClass{

@BeforeSuite
public void openUrl() {
browserOpen("chrome");
loadUrl("https://adactinhotelapp.com/HotelAppBuild2/");
}

@Test
public void login() {
	LoginPage lp = new LoginPage();
	dataSend(lp.getUserName(), "Muthulakshmi");
	dataSend(lp.getPassWord(), "Viji1703");
	click(lp.getLogin());
}
}
