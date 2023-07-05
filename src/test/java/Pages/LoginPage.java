package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	//@FindBy(id = "user-name") -- for below step reference
	//WebElement userName;
	/*
	 * By userName_txt = By.xpath("//input[@id='user-name']"); By password_txt =
	 * By.xpath("//input[@type='password']"); By login_btn =
	 * By.xpath("//input[@name='login-button']"); By heading_hdr =
	 * By.xpath("//span[text()='Products']"); 
	 * By login_error = By.xpath("//button[@class='error-button']/..//button[@class='error-button']/..");
	 */
	
	@FindBy(id="user-name") private   WebElement userName_txt;
	@FindBy(id="password") private   WebElement password_txt;
	@FindBy(id="login-button") private   WebElement login_btn;
	@FindBy(xpath = "//span[text()='Products']") private   WebElement heading_hdr;
	@FindBy(xpath = "//button[@class='error-button']/..//button[@class='error-button']/..") private   WebElement login_error;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login() {
//		driver.findElement(userName_txt).sendKeys("standard_user");
//		//userName.sendKeys("standard_user");
//		driver.findElement(password_txt).sendKeys("secret_sauce");
//		driver.findElement(login_btn).click();
		
		userName_txt.sendKeys("standard_user");
		password_txt.sendKeys("secret_sauce");
		login_btn.click();
		
	}
	
	public void InvalidLogin() {
//		driver.findElement(userName_txt).sendKeys("kmk");
//		driver.findElement(password_txt).sendKeys("sss");
//		driver.findElement(login_btn).click();
		userName_txt.sendKeys("kmk");
		password_txt.sendKeys("sss");
		login_btn.click();
		String error = login_error.getText();
		String epected_Error = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(error, epected_Error);
		
	}
	
}
