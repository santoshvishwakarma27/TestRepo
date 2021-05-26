package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPageObject {
	
	@FindBy(xpath="//button[@name='processAddress']")
	WebElement btn_proceedCheckout;	
	
	public void proceedCheckoutAddressPage()
	{
		btn_proceedCheckout.click();
	}

}
