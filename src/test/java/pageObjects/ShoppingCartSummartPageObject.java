package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.BaseMethod;

public class ShoppingCartSummartPageObject extends BaseMethod {
	
	@FindBy(xpath="//small[contains(text(),'SKU : demo_1')]/following-sibling::small/a")
	WebElement txt_demo1ProdDetails;
	
	
	@FindBy(id="total_product")
	WebElement txt_totalProductValue;
	
	@FindBy(id="total_price")
	WebElement txt_totalValue;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement btn_proceedCheckout;	
	
	@FindBy(xpath="//*[@id='center_column']/div[3]/div[2]/ul/li[1]/h3")
	WebElement txt_invoiceaddress;	
	
	
	
	
	public boolean verifySize(String val)
	{
		moveToElement(txt_demo1ProdDetails);
		String details=txt_demo1ProdDetails.getText();
		System.out.println(details);
		if(details.contains(val))
			return true;
		else
			return false;
		
	}
	
	public boolean totalProductsValue(String value)
	{
		String details=txt_totalProductValue.getText();
		System.out.println(details);
		if(details.equalsIgnoreCase(value))
			return true;
		else
			return false;
		
	}
	
	public boolean totalValue(String value)
	{
		moveToElement(txt_totalValue);
		String details=txt_totalValue.getText();
		System.out.println(details);
		if(details.equalsIgnoreCase(value))
			return true;
		else
			return false;		
	}
	
	public void proceedCheckoutShoppingSummary()
	{
		moveToElement(txt_invoiceaddress);
		moveToElement(btn_proceedCheckout);		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", btn_proceedCheckout);
		//btn_proceedCheckout.click();
		JS_Click(btn_proceedCheckout);
	}
	

}
