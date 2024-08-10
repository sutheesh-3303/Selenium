package unittesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Accountsettings 
{
      @Test(priority = 2,invocationCount = 5)
      public void AddAccount()
      {
    	  WebDriver driver =new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	  driver.get("https://demoapp.skillrary.com/");
    	  Reporter.log("Account will be created", true);
      }
      @Test(priority = 1,enabled = false)
      public void DeleteAccount()
      {
    	  Reporter.log("Account will be deleted", true);
      }
      @Test(priority = 3)
      public void EditAccount()
      {
    	  Reporter.log("Account will be edited", true);
      }
}
