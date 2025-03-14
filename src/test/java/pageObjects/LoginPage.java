package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(name = "email")
	WebElement emailAddress;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement loginBtn;

	public void setEmail(String emailId) {

		emailAddress.sendKeys(emailId);
	}

	public void setPwd(String pwd) {

		password.sendKeys(pwd);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}

}
