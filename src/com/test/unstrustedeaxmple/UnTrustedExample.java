package com.test.unstrustedeaxmple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class UnTrustedExample {
	public static void main(String[] args) {
		FirefoxProfile profile=new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("https://craveinfotech.com/");
	}

}
