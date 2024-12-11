package amazon_test;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import amazon_source.Home_Page;
import amazon_source.Product_Detail_Page;

//Reach till cart page without login

public class Test_Case15 extends Launch_Quit
{
	@Test
	public void cart_page() throws EncryptedDocumentException, IOException
	{
	  Home_Page h1 = new Home_Page(driver);
	  h1.all_categories();
	  h1.item_details(driver);
	  
	  Product_Detail_Page p1 = new Product_Detail_Page(driver);
	  p1.add_to_cart();
	  
	 
			  
	
	
	
	
	}
	

}
