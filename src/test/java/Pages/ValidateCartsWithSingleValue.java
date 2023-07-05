package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidateCartsWithSingleValue {
	WebDriver driver;
//	By product1_lnk = By.xpath("//div[contains(text(),'Sauce Labs Onesie')]");
	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Onesie')]") private   WebElement product1_lnk;
//	By addCart1_btn = By.id("add-to-cart-sauce-labs-onesie");
//	By addCart2_btn = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
//	By removeCartValue_lnk = By.id("remove-sauce-labs-onesie");
//	By addCart1_btn = By.xpath(
//			"(//div[contains(text(),'Sauce Labs Onesie')]//following::button[contains(text(),'Add to cart')])[1]");
//	By addCart2_btn = By.xpath(
//			"//a//div[contains(text(),'Test.allTheThings()')]//following::button[contains(text(),'Add to cart')]");
//	By removeCartValue_lnk = By.xpath(
//			"//a//div[contains(text(),'Test.allTheThings()')]//following::button[contains(text(),'Remove')]");
//	By addcart = By.xpath("//a[@class='shopping_cart_link']");
//	By cartValue01_lnk = By.xpath("(//div[@class='inventory_item_name'])[1]");
//	By cartValue02_lnk = By.xpath("(//div[@class='inventory_item_name'])[2]");
	
	@FindBy(id = "add-to-cart-sauce-labs-onesie") private   WebElement addCart1_btn;
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)") private   WebElement addCart2_btn;
	@FindBy(id = "remove-sauce-labs-onesie") private   WebElement removeCartValue_lnk;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private   WebElement addcart;
	@FindBy(xpath = "//div[@class='inventory_item_name']") private   WebElement cartValue01_lnk;
	@FindBy(xpath = "//div[@class='inventory_item_name'])[2]") private   WebElement cartValue02_lnk;
	
	public ValidateCartsWithSingleValue(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public  void  ValidateCartsWithSingleProduct() {
		PageFactory.initElements(driver, this);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement product1 = product1_lnk;
		js.executeScript("arguments[0].scrollIntoView();", product1);
//		String item1 = driver.findElement(addCart1_btn).getText();
		addCart1_btn.click();
//		String item2 = driver.findElement(addCart2_btn).getText();
		addCart2_btn.click();			
		System.out.println("products added");
		removeCartValue_lnk.click();
		System.out.println("products Removed");
		WebElement cart = addcart;
		js.executeScript("arguments[0].scrollIntoView();", cart);
		addcart.click();
		
		String cartValue_1 = cartValue01_lnk.getText();
		System.out.println("cartValue_1"+cartValue_1);
		Assert.assertEquals("Test.allTheThings() T-Shirt (Red)", cartValue_1);
	}
	
}
