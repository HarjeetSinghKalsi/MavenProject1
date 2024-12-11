package amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amazon_source.DDT_Page;
import amazon_source.Home_Page;
import amazon_source.Login_Page;
import amazon_source.Payment_Method;
import amazon_source.Product_Detail_Page;

//11. Validate the entire checkout process, including address selection, payment method selection, and order review.

public class Test_Case11 extends Launch_Quit
{
	
	@Test
	public void show_product_details() throws EncryptedDocumentException, IOException, InterruptedException
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
	h1.item_details(driver);
	
	Product_Detail_Page p1 = new Product_Detail_Page (driver);
	p1.buy_now();
	p1.delivering_address();
	
	
	/*
	
	Payment_Method pm1 = new Payment_Method(driver);
	pm1.net_banking();
	
	pm1.item_review();
	*/
	
	
		
	

		
	
	
	
	

	}


}
