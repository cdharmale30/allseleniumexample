package com.test.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlex {

	public static void main(String[] args) {

	    WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
	}

}
