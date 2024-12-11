package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Your_Orders_Page 
{
	WebDriver driver;
	@FindBy(id="a-autoid-7") //click write your review
	WebElement ord;
	
	@FindBy(xpath="(//button[@type='button'])[8]") //giving 5 rating 
	WebElement rate;
	
	@FindBy(id="scarface-review-title-label") //add a headline 
	WebElement headline;
	
	@FindBy(id="ryp__media-upload-banner-input") //add a photo 
	WebElement photo;
	
	
	@FindBy(id="scarface-review-text-card-title") //write a review 
	WebElement review;
	
	public void last_item()
	{
		ord.click();
	}
	
	public void ratings()
	{
		rate.click();
	}
	
	public void add_headline()
	{
		headline.sendKeys("best product");
	}
	
	public void add_photo()
	{
		
		photo.sendKeys("C:\\Users\\harje\\Downloads\\amz.png");
	}
	
	public void write_review()
	{
		review.sendKeys("best quality");
	}
	
	
   public Your_Orders_Page (WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
	
}
