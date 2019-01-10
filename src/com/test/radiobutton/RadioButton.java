package com.test.radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form");

/*		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", radio);
*/
		List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
		 
		 // Create a boolean variable which will hold the value (True/False)
		 boolean bValue = false;
		 
		 // This statement will return True, in case of first Radio button is selected
		 bValue = rdBtn_Sex.get(0).isSelected();
		 
		 // This will check that if the bValue is True means if the first radio button is selected
		 if(bValue == true){
		 // This will select Second radio button, if the first radio button is selected by default
		 rdBtn_Sex.get(1).click();
		 }else{
		 // If the first radio button is not selected by default, the first will be selected
		 rdBtn_Sex.get(0).click();
		 }
		 
		 //Step 4: Select the Third radio button for category 'Years of Exp' (Use Id attribute to select Radio button)
		 WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
		 rdBtn_Exp.click();
	}

}
