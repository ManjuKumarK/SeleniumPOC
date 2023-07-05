package com.poc;

import org.testng.annotations.Test;

import PageLocators.PageLocators;
import Pages.InvalidLoginPage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SaucewebsitePOC2_InvalidLogin extends InvalidLoginPage {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		// Invoking the Web driver
		System.setProperty("webdriver.chrome.driver",
				"C://Users//kori.kumar//Downloads//chromedriver_win32//chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Navigate to the Application
		driver.get("https://www.saucedemo.com/");
	
	}
	
	@Test
	public void TS02_InvalidLogin() {
		InvalidLoginPage invalidLogin = new InvalidLoginPage();
		invalidLogin.InvalidLoginPage(driver);
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();

	}

}
