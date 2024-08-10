package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Bassclass 
{
  public static WebDriver driver;	
  @BeforeClass
  public void Launch()
  {
	 driver=new ChromeDriver();
  }
}
