package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ValidateCartPage {
	WebDriver driver;
//	By product1_lnk = By.xpath("//div[contains(text(),'Sauce Labs Onesie')]");
//	By addCart1_btn = By.id("add-to-cart-sauce-labs-onesie");
//	By addCart2_btn = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
//	By removeCartValue_lnk = By.id("remove-sauce-labs-onesie");
	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Onesie')]") private   WebElement product1_lnk;
	@FindBy(id = "add-to-cart-sauce-labs-onesie") private   WebElement addCart1_btn;
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)") private   WebElement addCart2_btn;
	@FindBy(id= "remove-sauce-labs-onesie") private   WebElement removeCartValue_lnk;
	// Addcart_Dup = (//button[contains(text(),'Add to cart')])[5]
//	By addCart1_btn = By.xpath(
//			"(//div[contains(text(),'Sauce Labs Onesie')]//following::button[contains(text(),'Add to cart')])[1]");
//	By addCart2_btn = By.xpath(
//			"//a//div[contains(text(),'Test.allTheThings()')]//following::button[contains(text(),'Add to cart')]");
//	By removeCartValue_lnk = By.xpath(
//			"//a//div[contains(text(),'Test.allTheThings()')]//following::button[contains(text(),'Remove')]");
//	By addcart = By.xpath("//a[@class='shopping_cart_link']");
//	By cartValue01_lnk = By.xpath("(//div[@class='inventory_item_name'])[1]");
//	By cartValue02_lnk = By.xpath("(//div[@class='inventory_item_name'])[2]");
	
	@FindBy(xpath="//a[@class='shopping_cart_link']") private   WebElement addcart;
	@FindBy(xpath="(//div[@class='inventory_item_name'])[1]") private   WebElement cartValue01_lnk;
	@FindBy(xpath="(//div[@class='inventory_item_name'])[2]") private   WebElement cartValue02_lnk;
	public ValidateCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void ValidateCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = product1_lnk;
		js.executeScript("arguments[0].scrollIntoView();", element);
		addCart1_btn.click();
		addCart2_btn.click();
		System.out.println("products added");
		
		WebElement cart = addcart;
		js.executeScript("arguments[0].scrollIntoView();", cart);
		addcart.click();
		
		String cartValue_1 = cartValue01_lnk.getText();
		System.out.println("cartValue_1"+cartValue_1);
		Assert.assertEquals("Sauce Labs Onesie", cartValue_1);
		
		String cartValue_2 = cartValue02_lnk.getText();
		System.out.println("cartValue_2"+cartValue_2);
		Assert.assertEquals("Test.allTheThings() T-Shirt (Red)", cartValue_2);
	}
	
}
