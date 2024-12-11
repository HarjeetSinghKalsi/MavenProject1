package amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.annotations.Test;

import amazon_source.DDT_Page;
import amazon_source.Edit_user_details_Page;
import amazon_source.Home_Page;
import amazon_source.Login_Page;

//4. check if user can successfully edit their profile information

public class Test_Case4 extends Launch_Quit
{
	@Test //(retryAnalyzer=amazon_source.I_Retry_Analyzer.class)
	public void edit_address() throws EncryptedDocumentException, IOException
	{
	Home_Page h1 = new Home_Page(driver);
	h1.accountandlist(driver);
	h1.signin();
	
	DDT_Page d1 = new DDT_Page();
	d1.valid_creds();
	
	Login_Page l1 = new Login_Page (driver);
	l1.valid_email();
	l1.un_cont();
	l1.valid_password();
	l1.pwd_sign();
	h1.accountandlist(driver);
	h1.account();

	
	Edit_user_details_Page e1 = new Edit_user_details_Page (driver);
	e1.click_address();
	e1.edit();
	e1.edit_full_name();
	e1.edit_mob();
	e1.edit_pincode();
	e1.edit_flat();
	e1.edit_street();
	e1.edit_landmark();
	e1.update_add_btn();
	
	
	
	
	
	}
	

}
