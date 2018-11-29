package com.test.cookiesexample;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesExample {

	public static void main(String[] args) {	WebDriver driver =new FirefoxDriver();
		
		//** For Open The Url
		driver.get("https://www.facebook.com");
		
		//** For Maximize Browser
		driver.manage().window().maximize();
		
		Set <Cookie> cookies= driver.manage().getCookies();
		
		
		for(Cookie cookie:cookies) {
			System.out.println("name = "+cookie.getName());
			System.out.println("value = "+cookie.getValue());
			System.out.println("domain name = "+cookie.getDomain());
			System.out.println("get Expiry = "+cookie.getExpiry());
			System.out.println("is Secure = "+cookie.isSecure());
			System.out.println("is Secure = "+cookie.getPath());
			driver.manage().deleteCookieNamed("_js_reg_fb_ref");
            System.out.println();
		driver.manage().deleteAllCookies();
		
	}
	}
}
