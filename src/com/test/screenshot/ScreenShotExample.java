package com.test.screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotExample {

		public static void main(String[] args) throws Exception {

			WebDriver driver = new FirefoxDriver();
				
			driver.manage().window().maximize();
					 
			driver.get("https://www.google.com");
					 
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					 
			FileUtils.copyFile(screenshotFile, new File("I:\\All Eclipse Code3\\SeleniumExamples\\ScreenShotImages\\screen.png"));
					
Thread.sleep(5000);
driver.close();
					
			 
	}

}
