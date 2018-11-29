package com.test.chromedisalenotifi;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();

        // Set the experimental option
         options.setExperimentalOption("prefs", prefs);*/
         System. setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
     /*    WebDriver driver = new ChromeDriver(options);
         
 		driver.get("https://www.facebook.com/");
 		driver.manage().window().maximize();
 		driver.findElement(By.id("email")).sendKeys("urid");
 		driver.findElement(By.id("pass")).sendKeys("urpass");
 		driver.findElement(By.id("loginbutton")).click();*/
         
         ChromeOptions options = new ChromeOptions();
         
      // add parameter which will disable the extension
      options.addArguments("--disable-extensions");
       
      // Start the chrome session
      WebDriver driver = new ChromeDriver(options);
	}

}
