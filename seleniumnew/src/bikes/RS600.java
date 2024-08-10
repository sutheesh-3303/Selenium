package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RS600 
{
	 @Test(groups = "smoke")
	   public void LaunchRS600()
	   {
	  	 WebDriver driver=new ChromeDriver();
	  	 driver.get("https://www.bikewale.com/aprilia-bikes/rs-660/");
	  	 Reporter.log("RS600 succussfully Launched", true);
	   } 
}
