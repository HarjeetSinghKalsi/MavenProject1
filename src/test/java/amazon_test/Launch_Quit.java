package amazon_test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import amazon_source.TestNG_Listners_Page;


@Listeners(amazon_source.TestNG_Listners_Page.class)

public class Launch_Quit extends TestNG_Listners_Page
{
	

	
	@BeforeMethod
//	@Parameters("browser")
	public void launch()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	/*	if (nameofthebrowser.equals("chrome"))
		{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		if(nameofthebrowser.equals("firefox"))
		{
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		/*if (nameofthebrowser.equals("Testing edge"))
		{
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}*/
	}
	
	@AfterMethod
	public void quit()
	{
	//	driver.quit();
	}

}
