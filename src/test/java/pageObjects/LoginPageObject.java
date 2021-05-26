package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject 
{

	/*
	@FindBy(partialLinkText="Gmail")
	WebElement gmail;
	
	@FindBy(partialLinkText="Images")
	WebElement images;	
	
	
	public HomePage openGmail()
	{
		gmail.click();
		return this;
	}
	
	public HomePage openImages()
	{
		images.click();
		return this;
	} */
	
	@FindBy(partialLinkText="Sign in")
	WebElement link_signin;
	
	@FindBy(name="email")
	WebElement txt_email;
	
	@FindBy(id="passwd")
	WebElement txt_password;
	
	@FindBy(id="SubmitLogin")
	WebElement btn_signin;
	
	@FindBy(partialLinkText="WOMEN")
	WebElement btn_dresses;
	
	public LoginPageObject signIn()
	{
		link_signin.click();
		txt_email.sendKeys("vishwakarma@gmail.com");
		txt_password.sendKeys("FujitsuTest");
		btn_signin.click();
		//btn_dresses.click();
		return this;
	}
	
	
	
}
