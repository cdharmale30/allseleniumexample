package com.seleniumgrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumGrid {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver()	;
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("(//select[@id='day'])[last()-9]")).click();;
	}
	

}
