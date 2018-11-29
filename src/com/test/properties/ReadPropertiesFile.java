package com.test.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertiesFile {
	static WebDriver driver;

	public static void main(String[] args) {
		Properties pr = new Properties();
		try {
			FileInputStream fis = new FileInputStream("I:\\All Eclipse Code3\\SeleniumExamples\\config.properties");
			pr.load(fis);
			System.out.println(pr.getProperty("browser"));

			String browserName = pr.getProperty("browser");

			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\selelib\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("IE")) {
				driver = new InternetExplorerDriver();
			} else {

				System.out.println("No any Browser Open");
			}

			driver.get(pr.getProperty("url"));

			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(pr.getProperty("username"));
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pr.getProperty("password"));
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
