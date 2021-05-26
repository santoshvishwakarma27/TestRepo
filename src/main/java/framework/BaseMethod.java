package framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseMethod extends WebdriverFactory{

	
	
	public WebElement ele1;
	public JavascriptExecutor js=(JavascriptExecutor) getWebDriver();
	
	
	public void JS_Click(WebElement ele)	{
		
		js.executeScript("arguments[0].click();", ele);
	}

	public void moveToElement(WebElement ele)
	{
		Actions act=new Actions(getWebDriver());
		act.moveToElement(ele).perform();
		
	}
	
	public void switchFrame(int index)
	{
		getWebDriver().switchTo().frame(index);
	}
	
	public void selectDropDown(WebElement e,String value)
	{
		Select s=new Select(e);
		s.selectByVisibleText("L");
	}
}
