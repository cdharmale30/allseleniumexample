package com.test.pomwithoutpagefactory.verifyloginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.test.pomwithoutpagefactory.LoginPage;

public class VerifyLoginPage {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Selenium%20website%20jar%20files/Offline%20Website/index.html");
	   LoginPage login = new LoginPage(driver);
	   login.enterEmail();
	   login.enterPassword();
	   login.clickLoginButton();
	   driver.close();
	}
	
	
}
