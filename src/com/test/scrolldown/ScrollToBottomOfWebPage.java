package com.test.scrolldown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollToBottomOfWebPage {

	@Test
	public void scrollDown(){
		System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.softwaretestingmaterial.com");
		//to perform Scroll on application using  Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
