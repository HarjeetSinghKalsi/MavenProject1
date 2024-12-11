package amazon_source;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filters_Page 
{
	@FindBy(xpath="//span[.='7.5']") //clicking on shoe size
    WebElement shoe1;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[6]") //clicking on brand
    WebElement brand1;
	
	@FindBy(xpath="(//div[@class='colorsprite aok-float-left'])[3]") //clicking on colour
	WebElement color1;
	
	@FindBy (xpath="//span[.=\"Men's Formal Shoes\"]") //clicking on formal shoes
	WebElement formal1;
		
	@FindBy(id="p_36/range-slider_slider-item_lower-bound-slider") //clicking on price range
	WebElement price1;
	
	
	public void shoe_size()
	{
		shoe1.click();
	}
	
	public void brand_puma()
	{
		brand1.click();
	}
	
	public void formal_shoe()
	{
		formal1.click();
	}
	
	public void colour()
	{
		color1.click();
	}
	
	public void price_range(WebDriver driver) throws AWTException, InterruptedException
	{
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0, 600)");

		Thread.sleep(5000);	
		price1.click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_LEFT);
		r1.keyPress(KeyEvent.VK_LEFT);
		r1.keyPress(KeyEvent.VK_LEFT);
		r1.keyPress(KeyEvent.VK_LEFT);
		r1.keyPress(KeyEvent.VK_LEFT);
		r1.keyPress(KeyEvent.VK_LEFT);
		r1.keyPress(KeyEvent.VK_LEFT);
		r1.keyPress(KeyEvent.VK_LEFT);
	}
	
	
	public Filters_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
