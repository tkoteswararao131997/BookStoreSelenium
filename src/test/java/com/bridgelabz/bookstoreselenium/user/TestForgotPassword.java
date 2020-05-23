package com.bridgelabz.bookstoreselenium.user;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.util.Assert;

import com.bridgelabz.bookstoreselenium.configuration.DriverConfig;

public class TestForgotPassword {
	public static void main(String[] args) throws IOException {
		DriverConfig configDriver=new DriverConfig();
		WebDriver driver=configDriver.getChromeWebDriver();
		driver.get("http://localhost:3000/forgotpassword");
		BufferedReader csvReader = new BufferedReader(new FileReader("/home/kotti/Desktop/forgotPassword.csv"));
		String row;
		csvReader.readLine();
		while ((row = csvReader.readLine()) != null) {
		String[] value = row.split(",");
		WebElement toClear = driver.findElement(By.id("emailAddress"));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		driver.findElement(By.id("emailAddress")).sendKeys(value[0]);
		boolean isInAction=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/button")).isEnabled();
		System.out.println(isInAction);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/button")).click();
	}
	}

}
