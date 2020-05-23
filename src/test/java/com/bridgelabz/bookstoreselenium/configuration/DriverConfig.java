package com.bridgelabz.bookstoreselenium.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConfig{
//	
	public static WebDriver getChromeWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", "/home/kotti/Downloads/chromedriver_linux64 (2)/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getFirefoxWebdriver()
	{
		System.setProperty("webdriver.gecko.driver", "/home/kotti/Downloads/geckodriver-v0.26.0-linux32/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
