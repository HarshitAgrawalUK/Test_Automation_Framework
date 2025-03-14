package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegPage extends BasePage {

	public AccountRegPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(name = "firstname")
	WebElement txtFirstName;

	@FindBy(name = "lastname")
	WebElement txtLastName;

	@FindBy(name = "email")
	WebElement txtEmail;

	@FindBy(name = "telephone")
	WebElement txtTelephone;

	@FindBy(name = "password")
	WebElement txtPassword;

	@FindBy(name = "confirm")
	WebElement txtConfirmPwd;

	@FindBy(name = "agree")
	WebElement PrivacyChkBox;

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement continueBtn;

	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement msgConfirmation;
	
	

	public void setFirstName(String fName) {
		txtFirstName.sendKeys(fName);
	}

	public void setLastName(String lName) {
		txtLastName.sendKeys(lName);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setTelephone(String telephone) {
		txtTelephone.sendKeys(telephone);
	}

	public void setPwd(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void setConfrimPwd(String cPwd) {
		txtConfirmPwd.sendKeys(cPwd);
	}

	public void setAgree() {
		PrivacyChkBox.click();
	}
	
	public void clickContinueBtn() {
		continueBtn.click();
	}
	
	public String getConfirmationMsg() {
		return msgConfirmation.getText();
		
		
	}
	

}
