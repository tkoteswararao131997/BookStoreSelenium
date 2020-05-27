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

public class TestRegister {
	public static void main(String[] args) throws IOException, InterruptedException {
		DriverConfig configDriver=new DriverConfig();
		WebDriver driver=configDriver.getChromeWebDriver();
		driver.get("http://localhost:3000/register");
		BufferedReader csvReader = new BufferedReader(new FileReader("/home/kotti/Desktop/register.csv"));
		String row;
		int count=1;
		csvReader.readLine();
		while ((row = csvReader.readLine()) != null) {
		String[] value = row.split(",");
		WebElement toClear = driver.findElement(By.id("name"));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		driver.findElement(By.id("name")).sendKeys(value[0]);
		
		WebElement toClear1 = driver.findElement(By.id("email"));
		toClear1.sendKeys(Keys.CONTROL + "a");
		toClear1.sendKeys(Keys.DELETE);
		driver.findElement(By.id("email")).sendKeys(value[1]);
		
		WebElement toClear2 = driver.findElement(By.id("mobile"));
		toClear2.sendKeys(Keys.CONTROL + "a");
		toClear2.sendKeys(Keys.DELETE);
		driver.findElement(By.id("mobile")).sendKeys(value[2]);
		
		WebElement toClear3 = driver.findElement(By.id("password"));
		toClear3.sendKeys(Keys.CONTROL + "a");
		toClear3.sendKeys(Keys.DELETE);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(value[3]);
		boolean isInAction=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[5]/button")).isEnabled();
		System.out.println(isInAction);
		if(isInAction==true)
		{
			System.out.println("test case "+count+" failed");
			count++;
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[5]/button")).click();
		}
		else
		{
			System.out.println("test case "+count+" passed");
			count++;
		}
	}
	}
}
