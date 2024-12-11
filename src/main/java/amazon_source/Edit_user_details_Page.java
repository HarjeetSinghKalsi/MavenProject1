package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_user_details_Page extends DDT_Page
{
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox") //click your address
	WebElement your_add;
	
	@FindBy(xpath="(//h2[@class='a-spacing-none ya-card__heading--rich a-text-normal'])[4]") //click edit address
	WebElement edit_add;
	
	@FindBy(id="ya-myab-address-edit-btn-1") //edit your address
	WebElement edit1;
	
	@FindBy(id="address-ui-widgets-form-submit-button") //click update address
	WebElement update_adress;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName") //edit full name
	WebElement full_name;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")//edit phone
	WebElement phone;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode") //edit pincode
	WebElement pincode;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1") //edit flat
	WebElement flat;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2") //edit full street
	WebElement street;
	
	
	@FindBy(id="address-ui-widgets-landmark") //edit landmark
	WebElement landmark;
	
	
	
	public void click_address()
	{
		edit_add.click();
	}
	
	public void edit()
	{
		edit1.click();
	}
	
	public void edit_full_name() 
	{	
		full_name.sendKeys(fname);	
	}
	
	public void edit_mob() 
	{	
		phone.sendKeys(mob);	
	}
	
	public void edit_pincode() 
	{
		pincode.sendKeys(pinc);	
	}
	
	public void edit_flat() 
	{	
		flat.sendKeys(flat1);	
	}
	
	public void edit_street() 
	{
		street.sendKeys(street1);	
	}
	
	public void edit_landmark() 
	{
		landmark.sendKeys(landmark1);	
	}
	
	public void update_add_btn()
	{
		update_adress.click();
	}
	
	
	
	public Edit_user_details_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
}
