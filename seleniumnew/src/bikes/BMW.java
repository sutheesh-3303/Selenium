package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class BMW 
{
   @Test(groups = "system")
   public void LaunchBMW()
   {
  	 WebDriver driver=new ChromeDriver();
  	 driver.get("https://www.bmw-motorrad.in/en/models/modeloverview.html");
  	 Reporter.log("BMW succussfully Launched", true);
  	 
   } 
    
}
