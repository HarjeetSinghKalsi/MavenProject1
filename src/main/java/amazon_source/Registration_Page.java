package amazon_source;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page extends DDT_Page
{
	 WebDriver driver;
	 
		//step 1
	    @FindBy(xpath="//span[@class='nav-line-2 ']") //hoverover signing
		WebElement accountandlist;
	    
	    @FindBy(xpath="//a[.='Start here.']") //clicking start here
	    WebElement starthere;
	    
	    @FindBy(name="customerName") //clicking your name
	    public  WebElement yourname;
	    
	    @FindBy(id="ap_phone_number") //clicking mobile
	    WebElement mob;
	    
	    @FindBy(id="ap_password") //clicking password
	    WebElement pwd;
	    
	    @FindBy(id="auth-continue") //clicking on verify
	    public   WebElement verifyno_tf;
	    
	 // @FindBy(name="pvSubmit")
	//   WebElement click_createaccount;
	     
	    
	    //step2
	     
	    public void fl_name() throws EncryptedDocumentException, IOException
	    {
	     
	      yourname.sendKeys(name1);		
	    }
	    
	    public void mobile_no() throws EncryptedDocumentException, IOException
	    {
	      
	      mob.sendKeys(mob1);	
	    }
	    
	    public void password() throws EncryptedDocumentException, IOException
	    {
	     
	      pwd.sendKeys(pass1);
	    }
	    
	    public void verify_number()
	    {
	    	verifyno_tf.click();	
	    }
	    
	    public boolean verify_number_assertion()
	    {
	    	boolean status = verifyno_tf.isDisplayed();
	    	return status;  	
	    }
	    
	    
	    
	    //step3
	    public Registration_Page (WebDriver driver)
	    {
	    	
	    	PageFactory.initElements(driver , this);
	    }
		


}
