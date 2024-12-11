package amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amazon_source.DDT_Page;
import amazon_source.Home_Page;
import amazon_source.Login_Page;
import amazon_source.Product_Detail_Page;

//10. Test updating item quantities and removing items from the cart

public class Test_Case10 extends Launch_Quit
{
	
	@Test
	public void show_product_details() throws EncryptedDocumentException, IOException
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
	
	p1.update_item_quantity();
	//p1.scroller(driver);
	p1.add_to_cart();
	p1.go_to_card();
	p1.remove_item();
	
	
	
	
	

	}


}
