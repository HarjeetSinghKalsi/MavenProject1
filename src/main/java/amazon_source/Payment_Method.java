package amazon_source;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//12 check user is able to select each payment method

public class Payment_Method 
{
	WebDriver driver;
	
	 @FindBy(xpath="(//span[.='Credit or debit card'])[1]") //credit and debit card
	 WebElement cc_dd;
	 
	 @FindBy(linkText="Enter card details") //click Enter card details
	 WebElement details;
	 
	 @FindBy(name="ppw-bankSelection_dropdown") //Net banking
	 WebElement net_bank;
	 
	 @FindBy(xpath="(//span[.='Other UPI Apps'])[1]")//upi
	 WebElement other_upi;
	 
	 @FindBy(name="__sif_encryptedVPA_collect") //enter upi id
	 WebElement enter_upi;
	 
	 @FindBy(name="ppw-widgetEvent:ValidateUpiIdEvent") //clicking verify
	 WebElement verify_upi;
	 
	 @FindBy(id="spcViewButtonId") //review_order
	 WebElement item;
	
	 @FindBy(xpath="//span[@id='pp-PvDOEd-169-announce']") //use this payment method
	 WebElement usethispayment;
	
	public void credit_debit_card()
	{
		cc_dd.click();
	}
	
	public void enter_card_details()
	{
		details.click();
	}
	
	public void net_banking() throws InterruptedException
	{	
		Thread.sleep(3000);
		Select s1 = new Select (net_bank);
		s1.selectByValue("HDF DIRECT");	
    }
	
	public void item_review() throws InterruptedException
	{	
		
		item.click();	
    }
	
	public void upi()
	{
		other_upi.click();
	}
	
	public void enter_upi_id()
	{
		enter_upi.sendKeys("test@123");
	}
	
	public void verify_upi_id()
	{
		verify_upi.click();
	}
	
	public void use_this_payment()
	{
		usethispayment.click();
	}
   public Payment_Method (WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
