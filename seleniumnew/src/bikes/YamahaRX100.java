package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class YamahaRX100 
{
	@Test(groups = "functional")
	   public void LaunchYamahaRX100()
	   {
	  	 WebDriver driver=new ChromeDriver();
	  	 driver.get("https://www.bikewale.com/yamaha-bikes/rx-100/");
	  	 Reporter.log("YamahaRX100 succussfully Launched", true);
	   } 

}
