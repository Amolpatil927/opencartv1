package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txt_FirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_LastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_Email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txt_Telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_Password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_ConfirmPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement ckb_PrivacyPolicy;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement btn_Continue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFirstName(String fname)
	{
		txt_FirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txt_LastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txt_Email.sendKeys(email);
	}
	
	public void setTelephone(String tel)
	{
		txt_Telephone.sendKeys(tel);
	}
	
	public void setPassword(String pwd)
	{
		txt_Password.sendKeys(pwd);
	}
	
	
	public void setConfirmPassword(String cmfpwd)
	{
		txt_ConfirmPassword.sendKeys(cmfpwd);
	}
	
	public void setPrivacyPolicy()
	{
		ckb_PrivacyPolicy.click();
	}
	
	public void clickContinue()
	{
		btn_Continue.click();
	}
	
	public String getConfirmationMsg() 
	{
		try 
		{
			return (msgConfirmation.getText());
		} 
		catch (Exception e)
		{
			return (e.getMessage());

		}

	}
}

