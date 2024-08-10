package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Himalayan 
{
	@Test(groups = "smoke")
	   public void LaunchHimalayan()
	   {
	  	 WebDriver driver=new ChromeDriver();
	  	 driver.get("https://www.bikewale.com/royalenfield-bikes/himalayan-650/");
	  	 Reporter.log("Himalayan succussfully Launched", true);
	   } 

}
