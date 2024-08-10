package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mahindrah 
{
	 @Test
     public void LaunchMahindrah()
     {
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://auto.mahindra.com/");
    	 Reporter.log("Mahindrah succussfully Launched", true);
    	 
     }
}
