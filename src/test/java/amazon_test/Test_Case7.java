	package amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amazon_source.DDT_Page;
import amazon_source.Home_Page;
import amazon_source.Login_Page;
import amazon_source.Product_Detail_Page;

//Ensure that the product details display information like (discription, price, reviews)
public class Test_Case7 extends Launch_Quit
{
	@Test //(retryAnalyzer=amazon_source.I_Retry_Analyzer.class)
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
	
	Product_Detail_Page p1 = new Product_Detail_Page(driver);
	
	
//	p1.description(driver);
	
//	Thread.sleep(500);
	p1.price(driver);
	
	
    p1.customer_review(driver);

}
}
