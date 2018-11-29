package com.test.waitexample;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllWaitTypeExample {

	public static void main(String[] args) throws InterruptedException {
		// Opening a browser
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement fromTextBox= driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/label"));
		fromTextBox.sendKeys("Pune");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Wait starts:"+new Date());
		System.out.println("Typed Ban");
		driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/label")).click();
		System.out.println("Selected Bangalore");
		System.out.println("Wait ends:"+new Date());
		//Closing browser
		driver.quit();
		System.out.println("browser closed");
	}
}
