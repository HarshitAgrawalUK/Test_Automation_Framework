package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[@id=\"content\"]/h2[1]")
	WebElement logoMyAccount;

	public boolean logMyAccountPage() {

		try {
			return logoMyAccount.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}
