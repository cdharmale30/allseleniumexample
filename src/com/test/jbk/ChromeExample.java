package com.test.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExample {
	public static void main(String[] args) throws Exception {
	/*	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.co.in/");*/
		// Initialize browser
		
		System.setProperty("webdriver.chrome.driver", "I://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// Open Google
	
		driver.get("file:///F:/Selenium%20website%20jar%20files/Offline%20Website/index.html");
		// Close browser
		
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		Thread.sleep(10000);
		driver.close();	
		
		
		
		
		}
	
				
}
	
