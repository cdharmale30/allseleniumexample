package com.test.waitexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.get("https://www.linkedin.com/");
	     driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("cdharmale");
	     driver.findElement(By.xpath("//input[@class='[login-form']")).click();    
	}

}
