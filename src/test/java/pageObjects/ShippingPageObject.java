package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPageObject {
	
	
	@FindBy(xpath="//button[@name='processCarrier']")
	WebElement btn_proceedCheckout;	
	
	@FindBy(id="cgv")
	WebElement chkbox_agreeTerms;	
	
	
	
	public void proceedCheckoutShippingPage()
	{
		btn_proceedCheckout.click();
	}
	
	public void agreeTerms()
	{
		chkbox_agreeTerms.click();
	}
	
	

}
