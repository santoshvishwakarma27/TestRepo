package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import framework.BaseMethod;
import framework.WebdriverFactory;
import initializePageObjects.PageFactoryInitializer;

public class HomePageObject extends BaseMethod{
	
	
	@FindBy(partialLinkText="WOMEN")
	WebElement btn_dresses;
	
	//@FindBy(xpath="//p[contains(text(),'100%')]/parent::div/preceding-sibling::div/descendant::a[3]")
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[2]")
	WebElement link_openProduct;
	
	
	
	@FindBy(id="group_1")
	WebElement drpdown_size;
	
	@FindBy(xpath="//a[contains(text(),'Faded')]")
	WebElement txt_fadedshorts;
	
	@FindBy(xpath="//a[contains(text(),'Faded')]/parent::h5/parent::div/preceding-sibling::div/div/a[2]/span")
	WebElement btn_quickview;
	
	@FindBy(xpath="//button[@name='Submit']")
	WebElement btn_addToCart;
	
	@FindBy(xpath="//span[@title='Continue shopping']")
	WebElement btn_continueShopping;
	
	//Second Product
	@FindBy(xpath="//a[contains(text(),'Chiffon')]")
	WebElement txt_chiffon;
	
	@FindBy(xpath="//a[contains(text(),'Chiffon')]/parent::h5/parent::div/preceding-sibling::div/div/a[2]/span")
	WebElement btn_quickview1;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement btn_proceedCheckout;	
	
		
	public HomePageObject openDressesTab() throws InterruptedException	{
	
		btn_dresses.click();	
		moveToElement(txt_fadedshorts);
		moveToElement(btn_quickview);
		btn_quickview.click();
		switchFrame(0);
		selectDropDown(drpdown_size,"L");
		btn_addToCart.click();
		getWebDriver().switchTo().defaultContent();
		btn_continueShopping.click();
		return this;
	}
	
	public HomePageObject openDressesTab1() throws InterruptedException	{
		
		Thread.sleep(5000);
		moveToElement(txt_chiffon);		
		moveToElement(btn_quickview1);
		JS_Click(btn_quickview1);
		switchFrame(0);		
		btn_addToCart.click();
		getWebDriver().switchTo().defaultContent();		
		btn_proceedCheckout.click();
		return this;
	}
	
	

}
