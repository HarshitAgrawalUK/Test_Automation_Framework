package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC01_AccountRegTest extends BaseClass {

	@Test
	public void verifyAccReg() {

		HomePage hp = new HomePage(driver);
		hp.clickRegister();

		AccountRegPage regpage = new AccountRegPage(driver);

		regpage.setFirstName("Sam");
		regpage.setLastName("Dong");
		regpage.setEmail("h.a@gmail.com");
		regpage.setTelephone("07448254124");
		regpage.setPwd("Har123");
		regpage.setConfrimPwd("Har123");
		regpage.setAgree();
		regpage.clickContinueBtn();

		String confMsg = regpage.getConfirmationMsg();

		Assert.assertEquals(confMsg, "Your Acount Has Been Created");

	}

}
