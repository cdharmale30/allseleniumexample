package com.test.iebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",
				"C:\\selelib\\IEDriverServer.exe");
		// Initialize InternetExplorerDriver Instance.
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");
		System.out.println("Selenium Webdriver Script in Internet Explorer browser | Software Testing Material");
		driver.close();
	}

}
