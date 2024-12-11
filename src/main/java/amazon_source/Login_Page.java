package amazon_source;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends DDT_Page
{
	
			WebDriver driver;
			
			//step 1
			@FindBy(id="ap_email") // email
		    WebElement username_tf;
			
			@FindBy(id="continue") //continue
			WebElement un_continue;
			
			@FindBy(name="password") //password
			WebElement password_tf;
			
			@FindBy(id="signInSubmit") //singing in
			public WebElement pwd_continue;
				
			
			//step 2
		    public void valid_email() throws EncryptedDocumentException, IOException
			 {
		    	
				username_tf.sendKeys(un);
			 }
		    
		    public void valid_password() throws EncryptedDocumentException, IOException
			 {
		    	
				password_tf.sendKeys(pwd);	
			 }	    
		    
		    
		    public void invalid_email() throws EncryptedDocumentException, IOException
			{
				
				username_tf.sendKeys(un_invalid);
			}
		    
			
			public void un_cont() // clicking continue
		     {
				un_continue.click();	
			 }
			
			public void invalid_password() throws EncryptedDocumentException, IOException
			{
				
				password_tf.sendKeys(pwd_invalid);
			}
			
			public void pwd_sign() // clicking signing
			 {
				pwd_continue.click();	
			 }
			
			//step 3
			public Login_Page (WebDriver driver)
			 {
				
				PageFactory.initElements(driver, this);
			 }
		


}
