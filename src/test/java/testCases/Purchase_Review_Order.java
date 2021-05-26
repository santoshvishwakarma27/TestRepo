package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import initializePageObjects.PageFactoryInitializer;

public class Purchase_Review_Order extends PageFactoryInitializer
{
	@Test
	public void openMail() throws InterruptedException
	{
		extentTest = extent.startTest("GmailTestTitle");
		loginpage().signIn();
		homepage().openDressesTab();
		homepage().openDressesTab1();
		Assert.assertTrue(shoppingCartpage().verifySize("Size : L"));
		Assert.assertTrue(shoppingCartpage().totalProductsValue("$32.91"));
		Assert.assertTrue(shoppingCartpage().totalValue("$34.91"));
		shoppingCartpage().proceedCheckoutShoppingSummary();
		addresspage().proceedCheckoutAddressPage();
		shippingpage().agreeTerms();
		shippingpage().proceedCheckoutShippingPage();
		paymentpage().selectPaymentMethod();
		paymentpage().confirmOrder();
		paymentpage().signOut();		
		
	}
}
