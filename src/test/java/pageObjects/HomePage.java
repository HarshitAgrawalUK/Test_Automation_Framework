package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath= "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement linkMyAccount;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement linkRegister;
	
	@FindBy(xpath= "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement login;

	
	public void clickMyAccount() {
		linkRegister.click();
	}
	
	public void clickRegister() {
		linkRegister.click();
	}
	
	public void clickLogin() {
		login.click();
	}

}
