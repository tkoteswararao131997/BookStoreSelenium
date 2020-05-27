package com.bridgelabz.bookstoreselenium.book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bridgelabz.bookstoreselenium.configuration.DriverConfig;

public class TestPagination {
	public static void main(String[] args) {
		

		DriverConfig configDriver=new DriverConfig();
		WebDriver driver=configDriver.getChromeWebDriver();
		driver.get("http://localhost:3000/books");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[3]/div[2]/button")).click();
	}
}
