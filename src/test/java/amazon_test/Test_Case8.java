package amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amazon_source.DDT_Page;
import amazon_source.Home_Page;
import amazon_source.Login_Page;

//8.check if product can be sorted by relevance,price ,rating etc
public class Test_Case8 extends Launch_Quit
{
	@Test (retryAnalyzer=amazon_source.I_Retry_Analyzer.class)
	public void sorted() throws EncryptedDocumentException, IOException, InterruptedException
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
	 Thread.sleep(1000);
	 
	h1.sorting_price(); 
	 Thread.sleep(1000);
	 
	h1.sorting_review();
	 Thread.sleep(1000);
	 
	h1.sorting_arrivals();


	}
}
