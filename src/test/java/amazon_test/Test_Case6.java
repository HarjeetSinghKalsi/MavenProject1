	package amazon_test;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amazon_source.DDT_Page;
import amazon_source.Filters_Page;
import amazon_source.Home_Page;
import amazon_source.Login_Page;

//6. Verify that searching with filters (category, price range) yields accurate result


public class Test_Case6 extends Launch_Quit
{
	
	@Test // (retryAnalyzer=amazon_source.I_Retry_Analyzer.class)
	
	
	public void categories_filter() throws InterruptedException, EncryptedDocumentException, IOException, AWTException 
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
		
		Filters_Page f1 = new Filters_Page(driver);
		h1.search();
		Thread.sleep(1000);
	//	f1.shoe_size();
		Thread.sleep(1000);
    //  f1.brand_puma();
		Thread.sleep(1000);
	//	f1.colour();	
		Thread.sleep(1000);
   //	f1.formal_shoe();
//		Thread.sleep(1000);
		f1.price_range(driver);
				
				
	
		
	}

}
