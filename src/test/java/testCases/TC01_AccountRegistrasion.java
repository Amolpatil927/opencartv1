package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC01_AccountRegistrasion extends BaseClass
{
	@Test(groups={"Sanity", "Master"})
	public void verifyregistration()
	{
		logger.info("** Starting TC01_AccountRegistrasion  **");
		
		try
		{
		HomePage hp = new HomePage(driver);
		logger.info("Clicking on MyAccount");
		hp.clickMyaccount();
		logger.info("Clicking on Register");
		hp.clickRegister();
		
		RegisterPage rp= new RegisterPage(driver);
		logger.info("Providing customer details for registration");
		logger.info("Entering the First Name");
		rp.setFirstName(randomString(6));
		logger.info("Entering the last name");
		rp.setLastName(randomString(6));
		logger.info("Entering the email");
		rp.setEmail(randomString(6)+"@gmail.com");
		logger.info("Entering the Telephone Number");
		rp.setTelephone(randomNumeric(10));
		logger.info("Entering the Password and confirm password");
		String password = randomAlphaNumeric(10);
		rp.setPassword(password);
		rp.setConfirmPassword(password);
		logger.info("Clicking on Privacy policy checkbox");
		rp.setPrivacyPolicy();
		logger.info("Clicking on Continue button");
		rp.clickContinue();
		}
		catch(Exception e)
		{
			logger.error("Test failed: " + e.getMessage());
		}
		
		
		logger.info("** End of TC01_AccountRegistrasion ** ");
		
		
		
	}
			
}
