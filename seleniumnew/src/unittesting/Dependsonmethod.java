package unittesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethod 
{
	@Test
	public void login()
	{
	  WebDriver driver =new ChromeDriver();
  	  driver.manage().window().maximize();
  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  	  driver.get("https://demoapp.skillrary.com/");
  	  Reporter.log("Account will be created", true);
	}
	@Test
	public void register()
	{
		WebDriver driver =new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  	  driver.get("https://demowebshop.tricentis.com/register");
	  	  Reporter.log("Account will be created", true);
	
	}
	@Test(dependsOnMethods = {"register","login"})
	public void Addproduct()
	{
		Reporter.log("Product will be added", true);
		
	}
	

}
