package com.findelementstype;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllFindElementsType {
	public static void main(String[] args) {
		 
		WebDriver  driver = new FirefoxDriver();
		 
	        driver.manage().window().maximize();
	 
	        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	        
	       // driver.findElement(By.id("login-email")).sendKeys("cdharmale30@gmail.com");
	        
	       // driver.findElement(By.name("session_key")).sendKeys("cdharmale30@gmail.com");
	        
	        //driver.findElement(By.className("login-password")).sendKeys("cdharmale30@gmail.com");
	        
	        
	        
	       WebElement element= driver.findElement(By.linkText("Partial Link Test"));
	       
	       
	        
	        
	}

}
