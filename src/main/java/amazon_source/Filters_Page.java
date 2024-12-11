package amazon_source;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filters_Page 
{
	@FindBy(xpath="//span[.='7.5']") //clicking on shoe size
    WebElement shoe1;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[6]") //clicking on brand
    WebElement brand1;
	
	@FindBy(xpath="(//div[@class='colorsprite aok-float-left'])[1]") //clicking on colour
	WebElement color1;
	
	
	@FindBy (xpath="//span[.=\"Men's Sneakers\"]") //clicking on formal shoes
	WebElement formal1;
	
	@FindBy(id="p_36/range-slider_slider-item_upper-bound-slider") //clicking on price range
	WebElement price;
	
	@FindBy(xpath="//span[@id='a-autoid-98']") //clicking on GO
	WebElement go;
	
	
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
	
	public void price_range(WebDriver driver) throws InterruptedException, AWTException
    {
    	
    	Point  P1 = price.getLocation();
    	int x = P1.getX();
    	int y = P1.getY();
    
    	JavascriptExecutor scroll = (JavascriptExecutor) driver;
    	scroll.executeScript("window.scrollBy(0,"+(y)+")");
    	Thread.sleep(90);
    	//Price.click();
    	
    	Actions Ac = new Actions(driver);
    	Ac.doubleClick(price).perform();
    			
    	Robot r1 = new Robot();
    	r1.keyPress(KeyEvent.VK_TAB);
		for(int i=0;i<=100;i++)
		{
			Thread.sleep(100);
			r1.keyPress(KeyEvent.VK_LEFT);
		}
    }
	
	public void GO()
	{
		go.click();
	}
	
	public Filters_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
