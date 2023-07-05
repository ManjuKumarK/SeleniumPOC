package PageLocators;

import org.openqa.selenium.By;

public interface PageLocators {
	
	By userName_txt = By.xpath("//input[@id='user-name']");
	By password_txt = By.xpath("//input[@type='password']");
	By login_btn = By.xpath("//input[@name='login-button']");
	By heading_hdr = By.xpath("//span[text()='Products']");
	By login_error = By.xpath("//button[@class='error-button']/..//button[@class='error-button']/..");
	
	By product1_lnk = By.xpath("//div[contains(text(),'Sauce Labs Onesie')]");
	By addCart1_btn = By.xpath(
			"(//div[contains(text(),'Sauce Labs Onesie')]//following::button[contains(text(),'Add to cart')])[1]");
	By addCart2_btn = By.xpath(
			"//a//div[contains(text(),'Test.allTheThings()')]//following::button[contains(text(),'Add to cart')]");
	By removeCartValue_lnk = By.xpath(
			"//a//div[contains(text(),'Test.allTheThings()')]//following::button[contains(text(),'Remove')]");
	By addcart = By.xpath("//a[@class='shopping_cart_link']");
	By cartValue01_lnk = By.xpath("(//div[@class='inventory_item_name'])[1]");
	By cartValue02_lnk = By.xpath("(//div[@class='inventory_item_name'])[2]");
	
	By checkOut_btn = By.xpath("//button[@name='checkout']");
	
	By firstName_txt = By.xpath("//input[@id='first-name']");
	By lasstName_txt = By.xpath("//input[@id='last-name']");
	By pincode_txt = By.xpath("//input[@id='postal-code']");
	By continue_btn = By.xpath("//input[@id='continue']");
	By finish_btn = By.id("finish");
	By hamberger_lnk = By.xpath("//button[@id='react-burger-menu-btn']");
	By logout_btn = By.xpath("//a[contains(text(),'Logout')]");
	
	

}
