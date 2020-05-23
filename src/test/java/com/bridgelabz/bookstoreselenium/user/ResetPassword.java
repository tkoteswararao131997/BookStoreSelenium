package com.bridgelabz.bookstoreselenium.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bridgelabz.bookstoreselenium.configuration.DriverConfig;

public class ResetPassword {
	
	public static void main(String[] args) {
		DriverConfig configDriver=new DriverConfig();
		WebDriver driver=configDriver.getChromeWebDriver();
		driver.get("http://localhost:3000/user/resetpassword/eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6Mn0.ZrGlZZ9xa3T7gsiW3J6yilTQeF5J4RD8n-4bAEDg8_Y");
		driver.findElement(By.id("password")).sendKeys("Nani90849090@");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/button")).click();
	}
}
