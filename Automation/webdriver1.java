package com.selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sthor\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver dr=	new ChromeDriver();
		
	dr.get("https://integrator.actitime.com/auth/at");
	WebElement wb= dr.findElement(By.name("username"));
	
	}

}
