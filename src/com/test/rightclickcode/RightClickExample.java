package com.test.rightclickcode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RightClickExample {

public static void main(String[] args) throws InterruptedException {
		
		//** For Open the Web Browser
		WebDriver driver =new FirefoxDriver();
		
		//** For Open The Url
		driver.get("https://www.facebook.com");
		
		//** For Maximize Browser
		driver.manage().window().maximize();
		
/*		//** Enter the Details
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("Anwesh");
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Shrikhande");
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("9156767828");
		driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("AnweshShrikhande123");
		
		//** For Selecting DroupDowan field
		Select sel1=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel1.selectByValue("21");
		Select sel2=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel2.selectByVisibleText("Apr");
		Select sel3=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByValue("1991");
		
		//** Click on Radio Button
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
		
		//** Click on CreatePage 
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		
		//** For using Back Page
		driver.navigate().back();*/
		
		//** For Right Click On FaceBook Logo
		
		
		WebElement rightclick=driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i"));
	    Actions act=new Actions(driver);
	    act.contextClick(rightclick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		//** For Close the Browser
	    
	    Thread.sleep(8000);
	    driver.quit();

     }
}
