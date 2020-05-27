package com.bridgelabz.bookstoreselenium.user;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bridgelabz.bookstoreselenium.configuration.DriverConfig;

public class TestLogin {
	public static void main(String[] args) throws IOException {
		DriverConfig  configDriver=new DriverConfig();
		WebDriver driver=configDriver.getChromeWebDriver();
		driver.get("http://localhost:3000/login");
		BufferedReader csvReader = new BufferedReader(new FileReader("/home/kotti/Desktop/login.csv"));
		String row;
		int count=1;
		csvReader.readLine();
		while ((row = csvReader.readLine()) != null) {
		String[] value = row.split(",");
		WebElement toClear = driver.findElement(By.id("emailAddress"));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		driver.findElement(By.id("emailAddress")).sendKeys(value[0]);
		
		WebElement toClear1 = driver.findElement(By.id("password"));
		toClear1.sendKeys(Keys.CONTROL + "a");
		toClear1.sendKeys(Keys.DELETE);
		driver.findElement(By.id("password")).sendKeys(value[1]);
		boolean isInAction=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/button")).isEnabled();
		System.out.println(isInAction);
		if(isInAction==true)
		{
			System.out.println("test case "+count+" failed");
			count++;
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/button")).click();
		}
		else
		{
			System.out.println("test case "+count+" passed");
			count++;
		}
	}
	}
}
