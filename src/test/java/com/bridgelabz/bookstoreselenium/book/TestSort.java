package com.bridgelabz.bookstoreselenium.book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bridgelabz.bookstoreselenium.configuration.DriverConfig;

public class TestSort {
	
	public static void main(String[] args) throws InterruptedException {
		
		DriverConfig configDriver=new DriverConfig();
		WebDriver driver=configDriver.getChromeWebDriver();
		driver.get("http://localhost:3000/books");
		driver.findElement(By.className("dropdown")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div/div/div[3]")).click();
	}

}
