package com.seleniumjava;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//kori.kumar//Downloads//chromedriver_win32//chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("kmk");
		driver.findElement(By.name("password")).sendKeys("456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		
		
	}

}
