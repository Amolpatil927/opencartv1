package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="(//span[@class='hidden-xs hidden-sm hidden-md'])[3]") 
	WebElement lnk_MyAccount;
	
	@FindBy(linkText="Register") 
	WebElement lnk_register;
	
	@FindBy(linkText="Login") 
	WebElement lnk_login;
	
	
	public void clickMyaccount()
	{
		lnk_MyAccount.click();
	}
	
	public void clickRegister()
	{
		lnk_register.click();
	}
	
	public void clickLoginlink()
	{
		lnk_login.click();
	}
}
