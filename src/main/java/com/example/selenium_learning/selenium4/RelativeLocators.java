package com.example.selenium_learning.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import com.example.selenium_learning.BrowserName;
import com.example.selenium_learning.DriverUtility;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver = DriverUtility.getDriver(BrowserName.CHROME);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameInput = driver.findElement(By.cssSelector("input[name='name']"));
		
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).above(nameInput)).getText());
		System.out.println(
				driver.findElement(RelativeLocator.with(By.tagName("label")).toRightOf(By.id("exampleCheck1"))).getText());
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.cssSelector("[for='dateofBirth']")))
				.click();
		
		driver.quit();
	}

}
