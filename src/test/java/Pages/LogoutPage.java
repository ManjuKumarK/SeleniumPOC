package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver driver;
//	By hamberger_lnk = By.xpath("//button[@id='react-burger-menu-btn']");
//	By logout_btn = By.xpath("//a[contains(text(),'Logout')]");
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement hamberger_lnk;
	@FindBy(xpath = "//a[contains(text(),'Logout')]") private WebElement logout_btn;
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void  Logout() {	
		hamberger_lnk.click();
		logout_btn.click();
		System.out.println("logout successful");
	}
		
}
