package amazon_test;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import amazon_source.DDT_Page;
import amazon_source.Home_Page;
import amazon_source.Login_Page;


//2. user is successfully login with valid email and pswd
public class Test_Case2 extends Launch_Quit 
{
	@Test (retryAnalyzer=amazon_source.I_Retry_Analyzer.class)
	
	public void login_logic() throws EncryptedDocumentException, IOException
	{
		
		
		Home_Page h1 = new Home_Page(driver);
		h1.accountandlist(driver);
		h1.signin();
		
		DDT_Page d1 = new DDT_Page();
		d1.valid_creds();
		
		
			
		Login_Page s1 = new Login_Page (driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s1.valid_email();
		s1.un_cont();
		s1.valid_password();
		s1.pwd_sign();
		h1.accountandlist(driver);
	    
	    
	    Assert.assertEquals(h1.signoutamazon.isDisplayed(), true, "test is failed");
	  //	Assert.assertEquals(h1.sign_out(), true, "test is failed"); 
	  //	Assert.assertTrue(h1.sign_out(), "test is failed");
	    
	    
	    
		
		    
		}
	}


