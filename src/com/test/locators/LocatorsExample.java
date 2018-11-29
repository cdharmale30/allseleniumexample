package com.test.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
				 
      driver.get("file:///F:/Selenium%20website%20jar%20files/Offline%20Website/index.html");
      //TagName Locators	 
       /*   List <WebElement> listofTags= driver.findElements(By.tagName("input"));
        System.out.println(listofTags.size());*/
		
		//ccsClassLocator

       /* WebElement userElement = driver.findElement(By.className("form-control"));
         userElement.sendKeys("kran@gmail.com");*/

     //ccsSelectors
        /* WebElement userElement = driver.findElement(By.cssSelector("input[id=email]"));
         userElement.sendKeys("kiran@gmail.com");*/
      
      
      //AbsoluteXpath
      
   /*   WebElement userElement = driver.findElement(By.cssSelector("input[id=email]"));
      userElement.sendKeys("kiran@gmail.com");*/
      
    	  List <WebElement> list = driver.findElements(By.tagName("a"));
    	  System.out.println("Number of links: "+list.size());
    	  for(int i = 0; i < list.size(); i++){
    	  System.out.println(list.get(i).getText());
    	  }
	}

}
