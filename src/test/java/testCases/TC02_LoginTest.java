package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC02_LoginTest extends BaseClass{
	
	@Test
	public void verifyLogin() {
		
		
		//HomePage
		HomePage hp = new HomePage(driver);
		
		hp.clickMyAccount();
		hp.clickLogin();
		
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail("agrawal.h9.h@gmail.com");
		lp.setPwd("India!1234");
		lp.clickLoginBtn();
		
		
		//My Account page
		MyAccountPage acc = new MyAccountPage(driver); 
		boolean targetPage = acc.logMyAccountPage();
		
		Assert.assertEquals(targetPage, true,"login failed");
		
		
	}

}
