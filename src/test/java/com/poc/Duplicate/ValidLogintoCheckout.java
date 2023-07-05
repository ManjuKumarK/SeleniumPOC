package com.poc.Duplicate;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.DetailsPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.ValidateCartPage;
import Pages.ValidateCartsWithSingleValue;

public class ValidLogintoCheckout  {
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
	
	@Test (description="Valid login add to cart and checkout")
	public void TS01_ValidLogintoCheckout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Login();
		HomePage homepage = new HomePage(driver);
		homepage.Endtoend();
		DetailsPage detailsPage=new DetailsPage(driver);
		detailsPage.Details();
		LogoutPage logout = new LogoutPage(driver);
		logout.Logout();
		
	}
	
	@Test (description="Validate cart page")
	public void TS02_ValidateCartPage() {		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Login();
		ValidateCartPage validateCart = new ValidateCartPage(driver);
		validateCart.ValidateCart();
	}
	
	@Test (description="Validate cart by removing one product")
	public void TS03_ValidateCartAfterRemovingProdut() {	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Login();
		ValidateCartsWithSingleValue validatesinglecart = new ValidateCartsWithSingleValue(driver);
		validatesinglecart.ValidateCartsWithSingleProduct();
		
	}
	
	@Test(description="InvalidLogin")
	public void TS04_InvalidLogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPage invalidLogin = new LoginPage(driver);
		invalidLogin.InvalidLogin();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();
		

	}

}
