package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KIA 
{
	 @Test
     public void LaunchKIA()
     {
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://www.kia.com/in/our-vehicles/seltos/showroom.html");
    	 Reporter.log("KIA succussfully Launched", true);
    	 
     }
}
