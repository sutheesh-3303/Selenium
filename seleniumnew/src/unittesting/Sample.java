package unittesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Sample 
{
    @Test
    public void demo() 
    {
    	Reporter.log("hii friends",true);
//    	System.out.println("hii friends");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.get("https://demoapp.skillrary.com/");
    	
    }
    @Test
    public void temmy()
    {
    	Reporter.log("welcom in my laptop", true);
    }
    @Test
    public void ammy()
    {
    	Reporter.log("reporters", true);
    }
}
