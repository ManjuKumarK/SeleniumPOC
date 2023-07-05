package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {
	WebDriver driver;
	/*
	 * By firstName_txt = By.xpath("//input[@id='first-name']"); By lasstName_txt =
	 * By.xpath("//input[@id='last-name']"); By pincode_txt =
	 * By.xpath("//input[@id='postal-code']"); By continue_btn =
	 * By.xpath("//input[@id='continue']"); By finish_btn = By.id("finish");
	 */
	
	//Locators for Details
	@FindBy(id="first-name") private   WebElement firstName_txt;
	@FindBy(id="last-name") private WebElement lasstName_txt;
	@FindBy(id="postal-code") private WebElement pincode_txt;
	@FindBy(id="continue") private WebElement continue_btn;
	@FindBy(id="finish") private WebElement finish_btn;
	
	public DetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Details() {
	
		firstName_txt.sendKeys("Test_FirstNAme");
		lasstName_txt.sendKeys("LastName");
		pincode_txt.sendKeys("123456");
		continue_btn.click();
		finish_btn.click();
		System.out.println("order placed successfully");
		
	}
	
}
