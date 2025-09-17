package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC03_LoginDDT extends BaseClass
{
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void verifyLoginDDT(String email, String password, String exp)
	{
		logger.info("**** Starting TC_003_LoginDDT *****");
		
		try
		{
		//Home page
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLoginlink(); //Login link under MyAccount
			
		//Login page
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLoginbtn(); //Login button
			
		//My Account Page
		MyAccountPage map = new MyAccountPage(driver);
		boolean targetPage=	map.isMyAccoutPageExists();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{
				map.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetPage==true)
			{
				map.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
		catch(Exception e)
		{
			Assert.fail("An exception occured :"+ e.getMessage());
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");
	}

}
