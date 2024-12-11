package amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon_source.DDT_Page;
import amazon_source.Home_Page;
import amazon_source.Login_Page;
import amazon_source.Product_Detail_Page;

//13. check if user is able to apply coupon code while ordering the product
public class Test_Case13 
{
	
	public class coupon_code1 extends Launch_Quit
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
		p1.coupon_code();
		p1.apply();
		
		Assert.assertEquals(p1.apply_code.isDisplayed(), true, "test is failed");
		
		

			
		
		
		
		}	

	}	

}
