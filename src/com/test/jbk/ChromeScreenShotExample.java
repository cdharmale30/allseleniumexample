package com.test.jbk;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ChromeScreenShotExample {
	 public static void captureScreenShot(WebDriver driver, String ScreenShorName) {
  	   try {
			TakesScreenshot ts= (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("I:\\EclipseCode\\ChromeTestCasesEaxmple\\ChromeScreenShotIfFails"+ScreenShorName+".png"));
			System.out.println("ScreenShot Taken");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
     }
	}

}
