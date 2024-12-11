package amazon_test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon_source.DDT_Page;
import amazon_source.Home_Page;
import amazon_source.Login_Page;


//5. Test searching for products using its name like shoe

public class Test_Case5 extends Launch_Quit
{
	@Test (retryAnalyzer=amazon_source.I_Retry_Analyzer.class)
	
	public void loginl_logic() throws EncryptedDocumentException, IOException
	{
		Home_Page h1 = new Home_Page(driver);
		h1.accountandlist(driver);
		h1.signin();
	
		DDT_Page d1 = new DDT_Page();
		d1.valid_creds();
		
		Login_Page l1 = new Login_Page(driver);
		l1.valid_email();
		l1.un_cont();
		l1.valid_password();
		l1.pwd_sign();
		h1.search();
		
		Assert.assertEquals(h1.search_tf.isDisplayed(), true, "test is failed");
		
		
				
	}

}
