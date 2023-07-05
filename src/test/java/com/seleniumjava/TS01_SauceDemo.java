package com.seleniumjava;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS01_SauceDemo {

	public static void main(String[] args)  throws InterruptedException {
		// Invoking the Web driver
		System.setProperty("webdriver.chrome.driver","C://Users//kori.kumar//Downloads//chromedriver_win32//chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Navigate to the Application
		driver.get("https://www.saucedemo.com/");
		
		//Login to the Application
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(5000);
		//Navigate to the Home page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Onesie')]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.findElement(By.xpath("(//div[contains(text(),'Sauce Labs Onesie')]//following::button[contains(text(),'Add to cart')])[1]")).click();
		driver.findElement(By.xpath("//a//div[contains(text(),'Test.allTheThings()')]//following::button[contains(text(),'Add to cart')]")).click();
		WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		js.executeScript("arguments[0].scrollIntoView();", cart);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		WebElement checkOut = driver.findElement(By.xpath("//button[@name='checkout']"));
		js.executeScript("arguments[0].scrollIntoView();", checkOut);
		driver.findElement(By.xpath("//button[@name='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Test_FirstNAme");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("LastName");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='continue']"));
		Thread.sleep(5000);
		
		//Navigate to the Logout page.
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.quit();
	}

}
