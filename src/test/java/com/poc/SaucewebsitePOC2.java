package com.poc;

import org.testng.annotations.Test;

import PageLocators.PageLocators;
import Pages.DetailsPage;
import Pages.HomePage;
import Pages.InvalidLoginPage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.ValidateCartPage;
import Pages.ValidateCartsWithSingleValue;

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

public class SaucewebsitePOC2 extends InvalidLoginPage {
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
	public void TS01_EndToEnd() {
		LoginPage loginpage = new LoginPage();
		loginpage.LoginPage(driver);
		HomePage homepage = new HomePage();
		homepage.HomePage(driver);
		DetailsPage detialspage = new DetailsPage();
		detialspage.DetailsPage(driver);
		LogoutPage logout = new LogoutPage();
		logout.LogoutPage(driver);
	}
	
	@Test
	public void TS02_ValidateCartPage() {
		LoginPage loginpage = new LoginPage();
		loginpage.LoginPage(driver);
		ValidateCartPage validateCart = new ValidateCartPage();
		validateCart.ValidateCartPage(driver);
	}
	
	@Test
	public void TS03_ValidateCartsWithSingleValue() {
		LoginPage loginpage = new LoginPage();
		loginpage.LoginPage(driver);
		ValidateCartsWithSingleValue validatesinglecart = new ValidateCartsWithSingleValue();
		validatesinglecart.ValidateCartsWithSingleValue(driver);
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();

	}

}
