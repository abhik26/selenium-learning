package com.example.selenium_learning.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.example.selenium_learning.BrowserName;
import com.example.selenium_learning.DriverUtility;

public class SeleniumLocators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverUtility.getDriver(BrowserName.CHROME);
		
		// global timeout option for the driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		String userName = "rahul";
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[type*='pass'")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello " + userName + ",");
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		driver.quit();
	}

}
