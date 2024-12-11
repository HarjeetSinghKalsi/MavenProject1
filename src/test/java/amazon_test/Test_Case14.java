package amazon_test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amazon_source.DDT_Page;
import amazon_source.Home_Page;
import amazon_source.Login_Page;
import amazon_source.Your_Orders_Page;

//go to order page and click on your last ordered product and give 5 star ratings
public class Test_Case14 extends Launch_Quit
		{
			
			@Test(retryAnalyzer=amazon_source.I_Retry_Analyzer.class)
			public void show_product_details() throws EncryptedDocumentException, IOException, InterruptedException
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
				h1.your_orders();
				
				Your_Orders_Page y1 = new Your_Orders_Page(driver);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				y1.last_item();
				Thread.sleep(1000);
				
				y1.ratings();
				Thread.sleep(1000);
				
				y1.add_headline();
				Thread.sleep(1000);
				
				y1.add_photo();
				Thread.sleep(1000);
				
				y1.write_review();
						
				
			
			

}
}
