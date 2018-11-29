package com.test.tooltip;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ToolTipDemo {
	@Test
	public void toolTipMethod() {
             //   System.setProperty("webdriver.chrome.driver", "D:\\Selenium Environment\\Drivers\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		WebElement ele = driver.findElement(By.id("age"));
		// Using actions class to do mouse hover
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		WebElement toolTipEle = driver.findElement(By.xpath("//*[@id='ui-id-118']/div"));
		// Get the Tool Tip Text
		String toolTipTxt = toolTipElement.getText();
                // Using assert to verify the expected and actual value
		Assert.assertEquals("We ask for your age only for statistical purposes.", toolTipTxt);
	}
}