package com.test.calenderhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarHandling {
	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIoaih1Pjd3QIVgSQrCh026gl7EAAYASAAEgK7NPD_BwE");
		
		driver.findElement(By.id("onward_cal")).click();
					
		List<WebElement> allDates=driver.findElements(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
			
		}
		
}



}
