package initializePageObjects;

import org.openqa.selenium.support.PageFactory;

import framework.WebdriverFactory;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.ShoppingCartSummartPageObject;
import pageObjects.*;

public class PageFactoryInitializer extends WebdriverFactory
{
	public LoginPageObject loginpage()
	{
		return PageFactory.initElements(getWebDriver(), LoginPageObject.class);		
	}
	
	public HomePageObject homepage()
	{
	
		return PageFactory.initElements(getWebDriver(), HomePageObject.class);	
	}
	
	public ShoppingCartSummartPageObject shoppingCartpage()
	{
	
		return PageFactory.initElements(getWebDriver(), ShoppingCartSummartPageObject.class);	
	}
	
	public AddressPageObject addresspage()	{
	
		return PageFactory.initElements(getWebDriver(), AddressPageObject.class);	
	}
	
	public ShippingPageObject shippingpage()	{
		
		return PageFactory.initElements(getWebDriver(), ShippingPageObject.class);	
	}
	
	public PaymentPageObject paymentpage()	{
		
		return PageFactory.initElements(getWebDriver(), PaymentPageObject.class);	
	}

}
