package unittesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class annoatationAtribute 
{
    @Test(priority = 2)
    public void Home()
    {
    	Reporter.log("hii friends",true);
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.get("https://demoapp.skillrary.com/login.php?type=login");
    	Reporter.log("welcome", true);
    	
    }
    @Test(priority = 1)
    public void Signup()
    {
    	Reporter.log("hii friends",true);
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get("https://demoapp.skillrary.com/login.php?type=register");
    	Reporter.log("hiiman", true);
    	driver.close();
    }
    
}
