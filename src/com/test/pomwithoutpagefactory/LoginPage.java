package com.test.pomwithoutpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By username = By.id("email");
	By password = By.id("password");
	By loginbutton = By.xpath("//*[@id=\"form\"]/div[3]/div/button");
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void enterEmail() {
		driver.findElement(username).sendKeys("kiran@gmail.com");
	}
	
	public void enterPassword() {
		driver.findElement(password).sendKeys("123456");
	}
	
	public void clickLoginButton() {
		driver.findElement(loginbutton).click();
	}
	

	

}
