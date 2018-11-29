package com.draganddrop;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollDownUpInSelenium {

	@Test
	public void actionsClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		// creating an object 'driver'
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Creating an object 'action'

		Actions action = new Actions(driver);

		driver.get("https://www.snapdeal.com");
		//Thread.sleep(3000);
		// SCROLL DOWN
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		//Thread.sleep(3000);
		// SCROLL UP
		action.sendKeys(Keys.PAGE_UP).build().perform();
	}
}
