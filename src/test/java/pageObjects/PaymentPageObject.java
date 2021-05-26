package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPageObject {
	
	@FindBy(xpath="//a[@class='bankwire']")
	WebElement btn_bankWire;	
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]/parent::button")
	WebElement btn_confirmOrder;	
	
	@FindBy(partialLinkText="Sign out")
	WebElement lnk_signout;
	
	public void selectPaymentMethod()
	{
		btn_bankWire.click();
	}
	
	public void confirmOrder()
	{
		btn_confirmOrder.click();
	}
	
	public void signOut()
	{
		lnk_signout.click();
	}
	
	
	

}
