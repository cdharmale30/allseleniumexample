package com.test.scrolldown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleScrollExample {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.seleniumeasy.com/");
		//to perform Scroll on application using  Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println(1);
		js.executeScript("window.scroll(0,800)");
		System.out.println(2);
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,-1000)");
		System.out.println(3);
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,300)");
		
	}
}
