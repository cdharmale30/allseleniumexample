package com.test.screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShotDemo {
	
    public static void captureScreensot(WebDriver driver, String name) {
	   
    	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File("I:\\All Eclipse Code3\\SeleniumExamples\\ScreenShotImages\\"+name+".png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		 
		System.out.println("Screenshot taken");
		
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chetanrdharmale@gmail.com");
	 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("dsaewq4321-");
	 
	 driver.findElement(By.xpath("//input[@value='Log In']")).click();
	 
	 driver.findElement(By.xpath("//div[@class='_59tf _2ftq' and @data-store-id='52']")).click();
	 
	 String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
	    File dest = new File("I:\\All Eclipse Code3\\SeleniumExamples\\ScreenShotImages\\"+filename);
	    try {
			FileUtils.copyFile(screenshotFile, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 driver.close();
	 
	}
	 
	 
}
