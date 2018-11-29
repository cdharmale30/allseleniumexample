package com.test.scrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleScrollBy {

	@Test
	 public void scrollDown(){
	 System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.navigate().to("https://www.softwaretestingmaterial.com");
/*	 //to perform Scroll on application using  Selenium
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("window.scrollBy(0,-889990)", "");
	 
	 
	 
	 //UptoParticularElement
	 WebElement element =driver.findElement(By.xpath(""));
			 
			 js.executeScript("arguments[0].scrollIntoView(true);",element);*/
	 
	 
	 ((JavascriptExecutor)driver).executeScript("window.scrollBy(2000,0)");

			
	 
	 
	 
	 }

}
