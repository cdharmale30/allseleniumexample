package com.test.screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		ScreenShotDemo.captureScreensot(driver,"name");

	}

}
