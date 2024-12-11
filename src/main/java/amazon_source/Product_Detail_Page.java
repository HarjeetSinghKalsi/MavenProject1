package amazon_source;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Product_Detail_Page extends DDT_Page
{
	    WebDriver driver;
	    
	    @FindBy(xpath="(//span[@class='a-expander-prompt'])[2]") // description
	    WebElement show_more;
	   
	    @FindBy(id="(//span[@class='a-price-whole'])[1]") // price
	    WebElement show_price;
	    
	    @FindBy(xpath="(//span[@class='a-dropdown-prompt'])[3]") // customer_review
	    WebElement review;
	   
	    @FindBy(name="ppw-claimCode") // coupon
	    WebElement coupon;
	    
	    @FindBy(name="ppw-claimCodeApplyPressed") // apply button
	    public WebElement apply_code;
	    
	    @FindBy(id="add-to-cart-button") //click add to cart
	    WebElement shoppin_crt;
	    
	    @FindBy(name="quantity")// update item quantity
	    WebElement update_item;
	    
	    @FindBy(name="submit.buy-now")// scroller
	    WebElement scroll;
	    
	    @FindBy(id="sw-gtc")  //Go to card
	    WebElement click_card;
	    
	    @FindBy(name="submit.buy-now") //buy now
	    WebElement buy_product;
	    
	    @FindBy(id="deliver-to-customer-text") //delivering to address
	    WebElement address;
	    
	    @FindBy(id="shipToThisAddressButton") //use this address
	    WebElement use_address;
	    
	    
	    @FindBy(id="navBackToTop") //back to top
	    WebElement checkout;    
	    
	    @FindBy(xpath="(//input[@value='Delete'])[1]") //delete
	    WebElement remove;
	    
	    
	    public void description(WebDriver driver)
	    {
	    	show_more.click();
	    	Assert.assertEquals(show_more.isDisplayed(), true);
	    	System.out.println("product description is displayed" + show_more); 			
	    }
	    
	    public void price(WebDriver driver)
	    {	
	    	Assert.assertEquals(show_price.isDisplayed(), true);
	    	System.out.println("shoes price is displayed" + show_price);	;
	    }
	    
	    public void customer_review(WebDriver driver) throws InterruptedException
	    {
	    	 int i = 10;
	         while (i>5)
	         {
	        	 
	      Point p3 =show_price.getLocation();
	      int c=	p3.getX();
	      int r = 	p3.getY();
	      System.out.println(c);
	      System.out.println(r);
	      
	      Thread.sleep(1000);
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,  "+r+")");
	      System.out.println(r);
	      r++;
	    	
	      Assert.assertEquals(review.isDisplayed(), true);
	      System.out.println("review is displayed" + review);
	      
	         }
	    }
	      
	    public void coupon_code()
	    {
	    	coupon.sendKeys(cupon);
	    }
	    
	    public void apply()
	    {
	    	apply_code.click();
	    }
	    
	    
	    public void add_to_cart()
	    {
	    	shoppin_crt.click();
	    }
	    
	    
	    public void scroller(WebDriver driver)
	    {
	      Point p2 =	scroll.getLocation();
	      int x =  p2.getX();
	      int y =  p2.getY();
	      System.out.println(x);
	      System.out.println(y);
	      
	      JavascriptExecutor js = (JavascriptExecutor) driver;  //upcasting driver to JavascriptExecutor
	      js.executeScript("window.scrollBy(0,  "+y+")");   //utilizing a method called executeScript 
	      
	    }
	    
	    
	    public void update_item_quantity()
	    {
	    	Select s2= new Select(update_item);
	    	s2.selectByValue("2");
	    }
	   
	    public void go_to_card()
	    {
	    	click_card.click();
	    }
	    
	    public void buy_now()
	    {
	    	buy_product.click();
	    }
	    
	    
	    public void remove_item()
	    {
	    	remove.click();
	    }
	    
	    public void delivering_address()
	    {
	    	address.click();
	    }
	    
	    public void use_this_address()
	    {
	    	use_address.click();
	    }
	    
	   public Product_Detail_Page (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	    

}
