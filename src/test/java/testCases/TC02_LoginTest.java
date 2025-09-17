package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC02_LoginTest extends BaseClass
{
	@Test(groups= {"Regression", "Master"})
	public void verifyLogin()
	{
		logger.info("**** Starting TC_02_LoginTest  ****");
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLoginlink();
		
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLoginbtn();
		
		MyAccountPage map = new MyAccountPage(driver);
		boolean targetPage=	map.isMyAccoutPageExists();
		Assert.assertEquals(targetPage, true,"Login failed");
		}
		catch(Exception e)
		{
			System.out.println("Test failed");
			Assert.fail();
		}
		logger.info("**** Finished TC_002_LoginTest  ****");	
	}
	

}
