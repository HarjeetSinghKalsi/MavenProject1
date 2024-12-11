package amazon_source;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Home_Page  extends DDT_Page
{
		 
	 WebDriver driver;
	 
	//step 1
    @FindBy(xpath="(//span[@class='nav-icon nav-arrow'])[2]") //hoverover signing
	WebElement accountandlist;
    
    @FindBy(xpath="//span[.='Your Account']") //your account
   	WebElement your_account;
    
    @FindBy(xpath="//a[.='Start here.']") //registration
    WebElement starthere;
    
    @FindBy(xpath="//a[.='Your Orders']") //your last order
    WebElement last_order;
      
    @FindBy(xpath="(//span[@class='nav-action-inner'])[1]") //clicking on sign in
	WebElement signin_to_login; 
    
    @FindBy(name="field-keywords") //search 
    public WebElement search_tf;
    
    @FindBy(id="twotabsearchtextbox") //search power bank
    public WebElement search_tf1;
    
    //span[.=\"Men's Sports Shoes with Memory Foam Cushioned Insole| Running Walking Gym Training Jogging Athletics| Comfortable & Stylish| Casual & Lightweight|Slipon Sneaker Gent's Boy's ART-2008\"]
    @FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]") //select shoe //(//a[@class='a-link-normal s-no-outline'])[8]
    WebElement pro_detail;
    
    @FindBy(id="searchDropdownBox") //select category from dropdown
    WebElement catgories; 
    
    @FindBy(xpath="//div[@class='two-pane-results-container']/div/div") //auto suggestions
    List<WebElement> auto_sugg; 
    
     
    @FindBy(css="a[id='nav-item-signout']") //assertion signout
    public WebElement signoutamazon;
	
	@FindBy(id="s-result-sort-select") //sorting
	WebElement sort;
	
	@FindBy(xpath="(//div[@class='a-box-inner a-alert-container'])[1]") //assertion
    public  WebElement alertassert1; 
	
	
	
	
    //step2
    public void accountandlist(WebDriver driver)
     {
    	Actions a1 = new Actions (driver);
    	a1.moveToElement(accountandlist).perform();
  	 }
    
    public void account()
    {
    	WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	w1.until(ExpectedConditions.elementToBeClickable(your_account));
    	your_account.click();
    }
    
    public void registration()
    {
    	starthere.click();
    }
    
    public void your_orders()
    {
    	last_order.click();
    }
     
    public void signin()
    {
    	WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	w2.until(ExpectedConditions.elementToBeClickable(signin_to_login));
    	signin_to_login.click();
    }
    
    
    public void search()
	{
		
		search_tf.sendKeys("shoe" + Keys.ENTER);
	
	}
    
    public void auto_suggestion() throws InterruptedException
	{
	/*
    	 WebElement e1=  driver.findElement(By.name("q"));
         e1.sendKeys("jabalpur");
         Thread.sleep(1000);
         //used List interface with find elements
         List<WebElement> li = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
         int count =  li.size();
         System.out.println(count);
         Thread.sleep(5000);
         li.get(count-1).click();
       */
       
		 search_tf.sendKeys("shoe");
	//	 List Iterator<WebElement> li = auto_sugg.iterator();
      /*   int count =  li.next();
         System.out.println(count);
         Thread.sleep(5000);
         li.get(count-3).click();*/
				
	
	}
    
     
    public void item_details(WebDriver driver) 
    {
		pro_detail.click();
		
		Set<String>      s1 = driver.getWindowHandles();
    	Iterator <String> i1 =  s1.iterator();
    	
    	String parentid =   i1.next();
    	String childid =    i1.next();
    	
    	System.out.println(parentid);
    	System.out.println(childid);
    	
    	driver.switchTo().window(childid);	
    //	Thread.sleep(1000);   	
	}
    
    
    public void all_categories()
    {
    	Select s1 = new Select(catgories);
    	s1.selectByValue("search-alias=electronics");
    	search_tf1.sendKeys("power bank" + Keys.ENTER);
    }
    
    public void sorting_price() 
	{
		Select sorting = new Select(sort);
		sorting.selectByVisibleText("Price: High to Low");	
	}
	
    public void sorting_review() 
	
	{
		Select sorting = new Select(sort);
		sorting.selectByVisibleText("Avg. Customer Review");	
	}

    public void sorting_arrivals() 
	
	{
		Select sorting = new Select(sort);
		sorting.selectByVisibleText("Newest Arrivals");	
	}
    
    
    
    public boolean sign_out()  // 1st way of using assertion
	
   	{
    	WebDriverWait w3 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	w3.until(ExpectedConditions.elementToBeClickable(signoutamazon));
    	boolean status = signoutamazon.isDisplayed(); 
    	return status;
    	
   	}
    
    public void sign_out1(WebDriver driver)  // 2nd way of using assertion
    {
         //    boolean b1 = 	signoutamazon.isDisplayed();
        //   System.out.println(b1 + " signout is present");
    	 //  Assert.assertEquals(signoutamazon.isDisplayed(), true, signoutamazon.getTitle());   	
    	
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println(expectedTitle);
		String actualTitle =     driver.getTitle();
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle,  expectedTitle);
     
    }
    
    public String sign_out3(WebDriver driver)  // 3rd way of using assertion
    {
 		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";	
		return expectedTitle;
     
    }
    
    public double sign_out4(WebDriver driver) // just explanation how to use return type 
    {
 		double num = Math.random();	
		return num;
     
    }

      
    //step3
    public Home_Page (WebDriver driver)
    {
    	
    	PageFactory.initElements(driver , this);
    }
	  

}
