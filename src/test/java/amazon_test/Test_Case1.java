package amazon_test;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import amazon_source.DDT_Page;
import amazon_source.Home_Page;
import amazon_source.Registration_Page;

public class Test_Case1 extends Launch_Quit

//Test if a new user can successfully register

{
	@Test// (retryAnalyzer=amazon_source.I_Retry_Analyzer.class)
		
	public void registration() throws EncryptedDocumentException, IOException
	{
		Home_Page h2 = new Home_Page (driver);
		h2.accountandlist(driver);
		h2.registration();
		
		DDT_Page d1 = new DDT_Page();
		d1.valid_creds();
		
		
		Registration_Page r1 = new Registration_Page(driver);
		r1.fl_name();
		r1.mobile_no();
		r1.password();
		r1.verify_number();
		
		Assert.assertEquals(r1.verifyno_tf.isDisplayed(), true, "TC_failed");
		
		
		
		
		
		
	
		
	}

}
